# Customer Saver Application

This application is designed to listen to a Kafka topic for incoming customer data, and save it to a PostgreSQL database.


## **Setup**

### Kafka Service
Kafka server should be up and running.

### PostgreSQL Service
PostgreSQL server should be up and running.
A database named 'customer' should be present.

## **Run the application**
Once the application is up and running, it will listen to the
'save-customer-topic' Kafka topic for incoming customer data.
When a new customer object is received,
it will be saved to the customer table in the PostgreSQL database.
