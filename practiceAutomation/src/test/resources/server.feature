Feature: CreateDirectory

  Scenario Outline: Validate that directory is created
    Given I created a directory <dirName> in my home directory
    When I write 5 files with 10 lines each in <dirName>
    Then I list all the files in <dirName>
    And I concatenate all files in <dirName> into a temp file
    Then I download the <fileName> from <dirName>
    Then i print the content in the <fileName>

    Examples: 
      | dirName | fileName |
      | test1   | temp.txt |
      | test2   | temp.txt |
      | test3   | temp.txt |
