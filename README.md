## The steps for realise this project
1. Use h2.database for read file data.json and insert data in the table
- Create PersonEntity, FirestationEntity, MedicalrecordEntity
- Create 3 repository corespendes
- use ObjectMapper.readValue -> read value and add in each repository
    - create Data.java contain 3 list<Entity>
    - create DataWrapper appler 3 repos et method to addEntity -> loop for list then save in repository
    - creat LoadData use ObjectMapper to read file #Todo 

## Endpoints
1. Persons list with info : id, firstName, lastName, address, city, phone, email
the same in PersonEntity
2. 