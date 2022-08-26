Feature: Validating GITHUB Login Page
Scenario Outline: Test GITHUB Credentials
Given launch site using chrome browser
When click on Sign In button
Then enter "<u>" as username
And enter "<p>" as password
And click on Sign in button
Then validate criteria "<pc>" as criteria
And close site
Examples:
|u                            |p         |pc         |
|                             |          |bothblank  |
|                             |tulasi123 |blankuid   |
|tulasi123                    |          |pwdblank   |
|tulasi123                    |garikapati|invalid    |
|tulasiramgarikapati@gmail.com|Y10@it2749|valid      |