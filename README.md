# springboot3-cxf-demo

This small spring boot 3 cxf demo based on: https://learn.microsoft.com/en-us/windows/win32/wsw/calculatorwsdl
In this demo the WSDL will be used to generate the sources (contract first).

When the demo is started:

- [CXF overview](http://127.0.0.1:8080/services/?wsdl)
- [Hello SOAP endpoint](http://127.0.0.1:8080/services/calculator?wsdl)

## Docker

To create a docker image run:

```shell
./mvnw spring-boot:build-image
```

Run the docker image:

```shell
docker run -p 127.0.0.1:8080:8080 com.github.ronlievens/springboot3-cxf-demo:1.0.0-SNAPSHOT --name springboot3-cxf-demo
```
