Feature: json feature testing

  Scenario: json reader parser
    * def jsonObject =
      """
      [
      {
        
          "name": "vanitha",
          "city": "Bnagalore",
          "job": "Testing"
      },
      {
           "name": "Hem",
          "city": "Bnagalore",
          "job": "Dev"
      }
      ]
      """
    * print jsonObject
    * print jsonObject[0].name
    * print jsonObject[1].name + " " + jsonObject[1].city  + " " + jsonObject[1].job 
    
    Scenario: json reader menu
    
    * def jsonObject =
    """
    {
    "menu": 
    {
       "id": "file",
			  "value": "File",
			  "popup": {
			    "menuitem": 
			    [
			      {"value": "New", "onclick": "CreateNewDoc()"},
			      {"value": "Open", "onclick": "OpenDoc()"},
			      {"value": "Close", "onclick": "CloseDoc()"}
          ]
  }
}}
    """
    
    * print jsonObject
    * print jsonObject.menu
    * print jsonObject.menu.id
    * print jsonObject.menu.popup
    * print jsonObject.menu.popup.menuitem
    * print jsonObject.menu.popup.menuitem[0].value
    * print jsonObject.menu.popup.menuitem[0].onclick
     
    
    