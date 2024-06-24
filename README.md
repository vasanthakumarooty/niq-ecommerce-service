# niq-ecommerce-service
NIQ is the world's leading consumer intelligence company, delivering the most complete understanding of consumer buying behavior and revealing new pathways to growth.

**Documentation**
    The specification for NIQ eCommerce can be found - Will update the link soon..
    The developer guide can be found - Will update

**Development**
    **Requirements**
        eCommerce task requires the following software:
        
            JDK 17
            Spring boot 3.3.1
            Apache Maven 3.3+
            Apache Tomcat 9.0+
            Mysql connector 8.0.33

**eCommerce is built with Maven:**
    mvn clean install

**Profile:**
    The default active profile is env-local. For building in a different environment, need to use the appropriate profile. Currently I am not configured other profiles.
            
            env-local – Local development
            env-dev - yet to add
            env-preprod - yet to add
            env-prod  -yet to add`

No VPN reqired to generating the code.

No SSL certification is required to connecting Db.

Running port:8088

Running locally:

    Once the application is ready, head to http://localhost:8088/.

CURD Operations:

    Create and Read operation are performed. Seven modules were defined to perform different activits.
    
Endpoints:
    
    Fetching Product detaila for a Specific shopper Id under Shopper Personalized Product Class. 
        http://localhost:8088/shopperprodcuts/productList/shopperId/{shopperId}
        
    Creating and Fetching shopper detils defined under Shopper Personalized Product Controller Class
       GET:
            Particular shopper Id: http://localhost:8088/shopperprodcuts/S-1000
            All shopper Id : http://localhost:8088/shopperprodcuts/
        Post:
            http://localhost:8088/shopperprodcuts/ - need to pass required payload.

    Creating and Fetching product details defined under Product Controller Class.

       GET:
            Particular product Id: http://localhost:8088/prodcut/S-1000
            All product Id : http://localhost:8088/prodcut/
        Post:
            http://localhost:8088/prodcut/ - need to pass required payload.
Db:
    Defined under appication.yaml

    Name: shoppers_products_info
    Table's Used:
        product
        shopper_personalized_prodcuts

Test Cases:
        Working on it


        