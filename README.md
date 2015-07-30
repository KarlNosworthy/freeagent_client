# FreeAgent Client


A Java based client for FreeAgent that allows simple access to the API utilising the awesome [Retrofit](http://square.github.io/retrofit/).

Authentication is required before the client can be used and is performing using OAuth 2.0.

## Obtaining an authenticated client
```java
FreeAgentClient freeAgentClient = FreeAgentClient.authorise("OAuth Key here",
                                                            "OAuth Secret Here",
                                                            "API URL here");
```

Once you have an authenticated instance you can use it to access the various entities and rich information that FreeAgent 
provides for the specified account. At the current moment only a simple implementation of reading Contacts has been
provided but full CRUD for Contacts will be supported shortly and then followed by Projects.


## Contacts

To list all the contacts attached to an account;
```java
List<FreeAgentContact> contacts = freeAgentClient.getContacts();
```
To obtain a specific contact (by known identifier);
```java
String contactId = "Set your valid identifier here"
FreeAgentContact contact = freeAgentClient.getContact(contactId);
```

#### Filtering / Sorting
To show only contacts who are attached to active projects
```java
List<FreeAgentContact> contacts = freeAgentClient.getContacts(ContactViewType.ActiveProjects);
```
To show only contacts that have been hidden and sort by their creation dates in ascending order;
```java
List<FreeAgentContact> contacts = freeAgentClient.getContacts(ContactViewType.Hidden,
                                                                       ContactSortOrderType.CreatedAtAscending);
````
or to sort by descending order
```java
List<FreeAgentContact> contacts = freeAgentClient.getContacts(ContactViewType.Hidden,
                                                                       ContactSortOrderType.CreatedAtDescending);
````
#### Creating a new contact
```java
FreeAgentContact contact = new FreeAgentContact();
contact.setFirstName("Bob");
contact.setLastName("Tester");
contact.setEmail("bob.tester@bobstesting.com");

// a new contact instance is returned with the identifier url and created_at timestamp set or null
// returned if creation failed.
FreeAgentContact contact = freeAgentClient.createContact(contact);
```
#### Updating a contact
```java
contact.setEmail("bob@bobstesting.com");
contact.setBillingEmail("billing@bobstesting.com");

boolean updateSuccessful = freeAgentClient.updateContact(contact);
```
#### Deleting a contact
```java
boolean deleteSuccessful = freeAgentClient.deleteContact(contact);
```

