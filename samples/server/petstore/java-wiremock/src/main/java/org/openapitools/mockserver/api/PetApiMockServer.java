/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.12.0-SNAPSHOT).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.mockserver.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.http.Fault;

public class PetApiMockServer {

    public static MappingBuilder stubAddPet200(@javax.annotation.Nonnull String body) {
        MappingBuilder stub = post(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubAddPet405(@javax.annotation.Nonnull String body) {
        MappingBuilder stub = post(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(405)
            );


        return stub;
    }

    public static MappingBuilder stubAddPetFault(@javax.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String addPetRequestSample1() {
        return "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
    }
    public static String addPetRequestSample2() {
        return "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
    }


    public static MappingBuilder stubDeletePet200(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String apiKey) {
        MappingBuilder stub = delete(urlPathTemplate("/pet/{petId}"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(200)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(apiKey != null) {
            stub = stub.withHeader("api_key", havingExactly(apiKey));
        }

        return stub;
    }

    public static MappingBuilder stubDeletePet400(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String apiKey) {
        MappingBuilder stub = delete(urlPathTemplate("/pet/{petId}"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(400)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(apiKey != null) {
            stub = stub.withHeader("api_key", havingExactly(apiKey));
        }

        return stub;
    }

    public static MappingBuilder stubDeletePetFault(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String apiKey, Fault fault) {
        MappingBuilder stub = delete(urlPathTemplate("/pet/{petId}"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(apiKey != null) {
            stub = stub.withHeader("api_key", havingExactly(apiKey));
        }

        return stub;
    }




    public static MappingBuilder stubFindPetsByStatus200(@javax.annotation.Nonnull String status, String response) {
        MappingBuilder stub = get(urlPathEqualTo("/pet/findByStatus"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/xml")
                .withBody(response)
            );

        stub = stub.withQueryParam("status", equalTo(status));

        return stub;
    }

    public static MappingBuilder stubFindPetsByStatus400(@javax.annotation.Nonnull String status, String response) {
        MappingBuilder stub = get(urlPathEqualTo("/pet/findByStatus"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(400)
                .withHeader("Content-Type", "application/xml")
                .withBody(response)
            );

        stub = stub.withQueryParam("status", equalTo(status));

        return stub;
    }

    public static MappingBuilder stubFindPetsByStatusFault(@javax.annotation.Nonnull String status, Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/pet/findByStatus"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withQueryParam("status", equalTo(status));

        return stub;
    }

    public static String findPetsByStatus200ResponseSample1() {
        return "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } ]";
    }
    public static String findPetsByStatus200ResponseSample2() {
        return "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
    }



    @Deprecated
    public static MappingBuilder stubFindPetsByTags200(@javax.annotation.Nonnull String tags, String response) {
        MappingBuilder stub = get(urlPathEqualTo("/pet/findByTags"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/xml")
                .withBody(response)
            );

        stub = stub.withQueryParam("tags", equalTo(tags));

        return stub;
    }

    @Deprecated
    public static MappingBuilder stubFindPetsByTags400(@javax.annotation.Nonnull String tags, String response) {
        MappingBuilder stub = get(urlPathEqualTo("/pet/findByTags"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(400)
                .withHeader("Content-Type", "application/xml")
                .withBody(response)
            );

        stub = stub.withQueryParam("tags", equalTo(tags));

        return stub;
    }

    public static MappingBuilder stubFindPetsByTagsFault(@javax.annotation.Nonnull String tags, Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/pet/findByTags"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withQueryParam("tags", equalTo(tags));

        return stub;
    }

    public static String findPetsByTags200ResponseSample1() {
        return "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } ]";
    }
    public static String findPetsByTags200ResponseSample2() {
        return "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
    }



    public static MappingBuilder stubGetPetById200(@javax.annotation.Nonnull String petId, String response) {
        MappingBuilder stub = get(urlPathTemplate("/pet/{petId}"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/xml")
                .withBody(response)
            );

        stub = stub.withPathParam("petId", equalTo(petId));

        return stub;
    }

    public static MappingBuilder stubGetPetById400(@javax.annotation.Nonnull String petId, String response) {
        MappingBuilder stub = get(urlPathTemplate("/pet/{petId}"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(400)
                .withHeader("Content-Type", "application/xml")
                .withBody(response)
            );

        stub = stub.withPathParam("petId", equalTo(petId));

        return stub;
    }

    public static MappingBuilder stubGetPetById404(@javax.annotation.Nonnull String petId, String response) {
        MappingBuilder stub = get(urlPathTemplate("/pet/{petId}"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(404)
                .withHeader("Content-Type", "application/xml")
                .withBody(response)
            );

        stub = stub.withPathParam("petId", equalTo(petId));

        return stub;
    }

    public static MappingBuilder stubGetPetByIdFault(@javax.annotation.Nonnull String petId, Fault fault) {
        MappingBuilder stub = get(urlPathTemplate("/pet/{petId}"))
            .withHeader("Accept", havingExactly("application/xml", "application/json"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("petId", equalTo(petId));

        return stub;
    }

    public static String getPetById200ResponseSample1() {
        return "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
    }
    public static String getPetById200ResponseSample2() {
        return "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
    }



    public static MappingBuilder stubUpdatePet200(@javax.annotation.Nonnull String body) {
        MappingBuilder stub = put(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubUpdatePet400(@javax.annotation.Nonnull String body) {
        MappingBuilder stub = put(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(400)
            );


        return stub;
    }

    public static MappingBuilder stubUpdatePet404(@javax.annotation.Nonnull String body) {
        MappingBuilder stub = put(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(404)
            );


        return stub;
    }

    public static MappingBuilder stubUpdatePet405(@javax.annotation.Nonnull String body) {
        MappingBuilder stub = put(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(405)
            );


        return stub;
    }

    public static MappingBuilder stubUpdatePetFault(@javax.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = put(urlPathEqualTo("/pet"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String updatePetRequestSample1() {
        return "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
    }
    public static String updatePetRequestSample2() {
        return "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
    }


    public static MappingBuilder stubUpdatePetWithForm200(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String name, @javax.annotation.Nullable String status) {
        MappingBuilder stub = post(urlPathTemplate("/pet/{petId}"))
            .withHeader("Content-Type", havingExactly("application/x-www-form-urlencoded"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(200)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(name != null) {
            stub = stub.withFormParam("name", havingExactly(name));
        }
        if(status != null) {
            stub = stub.withFormParam("status", havingExactly(status));
        }

        return stub;
    }

    public static MappingBuilder stubUpdatePetWithForm405(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String name, @javax.annotation.Nullable String status) {
        MappingBuilder stub = post(urlPathTemplate("/pet/{petId}"))
            .withHeader("Content-Type", havingExactly("application/x-www-form-urlencoded"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(405)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(name != null) {
            stub = stub.withFormParam("name", havingExactly(name));
        }
        if(status != null) {
            stub = stub.withFormParam("status", havingExactly(status));
        }

        return stub;
    }

    public static MappingBuilder stubUpdatePetWithFormFault(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String name, @javax.annotation.Nullable String status, Fault fault) {
        MappingBuilder stub = post(urlPathTemplate("/pet/{petId}"))
            .withHeader("Content-Type", havingExactly("application/x-www-form-urlencoded"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(name != null) {
            stub = stub.withFormParam("name", havingExactly(name));
        }
        if(status != null) {
            stub = stub.withFormParam("status", havingExactly(status));
        }

        return stub;
    }




    public static MappingBuilder stubUploadFile200(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String additionalMetadata, @javax.annotation.Nullable String _file, String response) {
        MappingBuilder stub = post(urlPathTemplate("/pet/{petId}/uploadImage"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("multipart/form-data"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(additionalMetadata != null) {
            stub = stub.withFormParam("additionalMetadata", havingExactly(additionalMetadata));
        }
        if(_file != null) {
            stub = stub.withFormParam("file", havingExactly(_file));
        }

        return stub;
    }

    public static MappingBuilder stubUploadFileFault(@javax.annotation.Nonnull String petId, @javax.annotation.Nullable String additionalMetadata, @javax.annotation.Nullable String _file, Fault fault) {
        MappingBuilder stub = post(urlPathTemplate("/pet/{petId}/uploadImage"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("multipart/form-data"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(additionalMetadata != null) {
            stub = stub.withFormParam("additionalMetadata", havingExactly(additionalMetadata));
        }
        if(_file != null) {
            stub = stub.withFormParam("file", havingExactly(_file));
        }

        return stub;
    }

    public static String uploadFile200ResponseSample1() {
        return "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
    }



    public static MappingBuilder stubUploadFileWithRequiredFile200(@javax.annotation.Nonnull String petId, @javax.annotation.Nonnull String requiredFile, @javax.annotation.Nullable String additionalMetadata, String response) {
        MappingBuilder stub = post(urlPathTemplate("/fake/{petId}/uploadImageWithRequiredFile"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("multipart/form-data"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(additionalMetadata != null) {
            stub = stub.withFormParam("additionalMetadata", havingExactly(additionalMetadata));
        }
        stub = stub.withFormParam("requiredFile", havingExactly(requiredFile));

        return stub;
    }

    public static MappingBuilder stubUploadFileWithRequiredFileFault(@javax.annotation.Nonnull String petId, @javax.annotation.Nonnull String requiredFile, @javax.annotation.Nullable String additionalMetadata, Fault fault) {
        MappingBuilder stub = post(urlPathTemplate("/fake/{petId}/uploadImageWithRequiredFile"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("multipart/form-data"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("petId", equalTo(petId));
        if(additionalMetadata != null) {
            stub = stub.withFormParam("additionalMetadata", havingExactly(additionalMetadata));
        }
        stub = stub.withFormParam("requiredFile", havingExactly(requiredFile));

        return stub;
    }

    public static String uploadFileWithRequiredFile200ResponseSample1() {
        return "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
    }



}
