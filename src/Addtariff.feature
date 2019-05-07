
Feature: Add tariff plans
  
  
  Scenario: Add Tariffs
    Given The user in add tariff plan pages
    When user will the validate traiffs
    |Mrental|LMinute|Iminute|smspack|Lpminutes|IpMinute|Smscharge|
    |100|20|50|50|120|123|345|
    |120|220|150|450|225|153|245|
    |150|120|350|550|20|100|145|
    And add the traiff by click the submit 
    Then congratulations traiff added
    
    

  
