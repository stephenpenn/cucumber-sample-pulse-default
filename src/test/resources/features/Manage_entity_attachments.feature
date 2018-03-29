
Feature: Manage entity attachments
  <Some interesting description here>

  Scenario: Add attachment to new defect
    <Some interesting scenario steps here>
    When the user creates a defect
    And he pastes an image in the description field
    Then the image is added to the attachments
    When he uploads an image from the local device
    Then the image is added to the description
    And added to the attachments
    
    Scenario: Add movie attachment to a defect
      
      Given a defect
      When the user uploads a large movie attachment but less than the limit
      Then the user can see the progress of the upload
      And the attachment is added
      When the user tries to upload a larger attachment higher than the limit
      Then he gets a message that this is to large
      
      Scenario Outline: View attachments
        
        Given a defect with an attachment of type "<type>"
        When the user opens the list of attachments
        Then he can see its name and type
        And he can see when it was uploaded
        And he can download the attachment
        When the user adds a description
        Then the description is saved
        When the user modifies the name and not the extension
        Then the new name is saved
        But extension was not changed
        
        Examples:
          | type |
          | jpg  |
          | Jpeg |
          | png  |
          | bmp  |
          | doc  |
          | docx |
          | xml  |
          | csv  |
