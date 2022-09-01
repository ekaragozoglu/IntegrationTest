Feature: userResource Integration Test

  Background:
    Given url UserResourceURL

  Scenario: Control of API response
    * def requestUserDetails =  read('../resource/UserResourceRequestBody.json')
    Given path 'users'
    When request requestUserDetails
    When method get
    Then status 200
    And match $.[0].id == 1
    And match $.[1].id == 2
    And match $.[2].id == 3
    And match $.[0].name == 'Erhan'
    And match $.[1].name == 'Duygu'
    And match $.[2].name == 'Han'
    And print response