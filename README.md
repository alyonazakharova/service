Java + Spring Boot web service.

At the moment there is a single GET request in the RestController. Receiving a GET request with required and optional parameters, this service sends several SOAP requests to other web-services, finds required params in the responses and sends final JSON response to the client.
