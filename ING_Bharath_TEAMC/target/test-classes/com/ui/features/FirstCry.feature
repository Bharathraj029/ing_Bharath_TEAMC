Feature: Capture list of centres in respective location

Scenario: validate the navigation to All Categories link
Given Luncht the browser and hit the url
When Navigate to All Categories Link
Then Validate the Navigation from All Categories link

Scenario: validate two playschools on the map are Hyderabad and Bengaluru
Given Luncht the browser and hit the url
When Navigate to All Categories Link
And Hover on Stores and playschools adn then to Playschools tab
Then Validate the two playschools on the map

Scenario: validate information are accurate in list of centres
Given Luncht the browser and hit the url
When Navigate to All Categories Link
And Hover on Stores and playschools adn then to Playschools tab
Then Validate the two playschools on the map


