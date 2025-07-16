|Resources|HTTP Verb                    |Resource URL|Use Case Representation                      |
|---------|-----------------------------|------------|---------------------------------------------|
|Zoo      |PATCH                        |/zoos/{zoo_id}|Open/Close the zoo by modifying the object   |
|         |GET                          |/zoos?status=open|Get all open zoos                            |
|         |GET                          |/zoos?status=closed|Get all closed zoos                          |
|         |POST                         |/zoos/{zoo_id}|Add a new zoo object (ID is optional, if server-assigned there is no need for an ID in the resource URL)|
|         |                             |            |                                             |
|Ticket   |POST                         |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}|Post a new user ticket when user purchases a new ticket|
|         |DELETE                       |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}|Delete user ticket, if ticket needs to be revoked (Refund/Void)|
|         |PATCH                        |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}|Modify ticket details, if needed (Such as when they leave, e.g. mark ticketStatus : "claimed, user left at <timestamp>")|
|         |GET                          |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}|Get tickets of one person                    |
|         |GET                          |/zoos/{zoo_id}/tickets/{ticket_id}/visitors|Get all issued tickets                       |
|         |                             |            |                                             |
|Enclosure|POST                         |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}|Add animal to enclosure                      |
|         |DELETE                       |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}|Remove an animal from enclosure/zoo completely|
|         |PATCH                        |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}|Modify animal's enclosure or move to another zoo|
|         |GET                          |/zoos/{zoo_id}/enclosures/{enclosure_id}|Get enclosure details                        |
|         |                             |            |                                             |
|Shop     |POST                         |/shops/{shop_id}/items/{item_id}|Add item to inventory                        |
|         |GET                          |/shops/{shop_id}/items/{item_id}|Get quantity of item in shop                 |
|         |GET                          |/shops/{shop_id}|Get all items in a shop                      |
|         |PATCH/PUT                    |/shops/{shop_id}/items/{item_id}|Modify quantity or minor details (PATCH), or completely replace item details (PUT)|
|         |POST                         |/shops/{shop_id}/items/{item_id}/ledgers/|Add purchase details to ledger (Tracking store metrics, per user and per item over time)|
|         |PATCH/PUT                    |/shops/{shop_id}/items/{item_id}/ledgers/|Modify ledger                                |
|         |GET                          |/shops/{shop_id}/ledgers|Get all ledgers for a store                  |
|         |                             |            |                                             |
|         |                             |            |                                             |
|Visitor  |PATCH                        |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}|Modify user ticket, to reflect their entry and exit (Prevent ticket reuse)|
|         |OPTIONS                      |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}|Get possible user activities in the zoo      |
|         |PATCH                        |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}/activities/{activity_id}|Modify ticket to reflect activities participated in (Activities can involve animals, such as feeding, etc.)|
|         |POST                         |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}/activities/{activity_id}|Add new user activity participated in        |
|         |GET                          |/zoos/{zoo_id}/tickets/{ticket_id}/visitors/{visitor_id}/activities/|Get record of activities participated in by the user and by tickets associated with the user |
|         |                             |            |                                             |
|Hospital |GET                          |/zoos/{zoo_id}/hospital/animals/|Get all animals in the hospital              |
|         |PATCH/PUT                    |/zoos/{zoo_id}/hospital/animals/{animal_id}|Modify hospital status of animal             |
|         |POST                         |/zoos/{zoo_id}/hospital/animals/{animal_id}|Add animal to the clinic                     |
|         |DELETE                       |/zoos/{zoo_id}/hospital/animals/{animal_id}|Delete animal in clinic                      |
|         |                             |            |                                             |
|         |                             |            |                                             |
|Activity |POST                         |zoos/{zoo_id}/activities/{activity_id}|Add a new activity to activity list          |
|         |PUT                          |zoos/{zoo_id}/activities/{activity_id}|Replace activity                             |
|         |PATCH                        |zoos/{zoo_id}/activities/{activity_id}|Modify activity details like time, etc.      |
|         |DELETE                       |zoos/{zoo_id}/activities/{activity_id}|Delete an activity completely                |
|         |                             |            |                                             |
|Animal   |POST                         |/zoos/{zoo_id}/animals|Add animal/s to zoo                          |
|         |GET                          |/zoos/{zoo_id}/animal|Get all animals in a zo                      |
|         |GET                          |/zoos/{zoo_id}/animals/enclosure/{enclosure_id}|Get animals in an enclosure                  |
|         |GET                          |/zoos/{zoo_id}/animal/{animal_id}|Get single animal details such as health, etc.|
|         |PATCH/PUT                    |/zoos/{zoo_id}/animal/{animal_id}|Modify animal details such as health, etc.   |
|         |DELETE                       |/zoos/{zoo_id}/animal/{animal_id}|Delete an animal from the zoo                |
