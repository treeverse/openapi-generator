/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import java.io.IOException

import org.openapitools.client.models.User

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.type.TypeReference

import io.vertx.core.Vertx
import io.vertx.core.http.RequestOptions
import io.vertx.core.http.HttpMethod
import io.vertx.core.buffer.Buffer
import io.vertx.core.Future
import io.vertx.ext.web.client.WebClient
import io.vertx.uritemplate.UriTemplate


import org.openapitools.client.infrastructure.*

@Suppress ("UNUSED")
class UserApi(basePath: kotlin.String = ApiClient.defaultBasePath, accessToken: String? = null, apiKey: MutableMap<String, String> = mutableMapOf(), apiKeyPrefix: MutableMap<String, String> = mutableMapOf(), username: String? = null, password: String? = null, vertx: Vertx): ApiClient(basePath, accessToken, apiKey, apiKeyPrefix, username, password, vertx) {
    /**
     * POST /user
     * Create user
     * This can only be done by the logged in user.
     * @param user Created user object
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createUser(user: User) : Future<Unit> {
        return createUserWithHttpInfo(user = user).map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> Unit
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * POST /user
     * Create user
     * This can only be done by the logged in user.
     * @param user Created user object
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun createUserWithHttpInfo(user: User) : Future<ApiResponse<Unit?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.POST, UriTemplate.of("$basePath/user"))

        
        
        
                    request.putHeader("Content-Type", "application/json")
        
        



        if (apiKey["api_key"] != null) {
            if (apiKeyPrefix["api_key"] != null) {
                request.putHeader("api_key", apiKeyPrefix["api_key"]!! + " " + apiKey["api_key"]!!)
            } else {
                request.putHeader("api_key", apiKey["api_key"]!!)
            }
        }

        return request
            .sendBuffer(responseBody(user))
            .map {
                val apiResponse: ApiResponse<Unit?> = handleResponse(it)
                apiResponse
            }
    }

    /**
     * POST /user/createWithArray
     * Creates list of users with given input array
     * 
     * @param user List of user object
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createUsersWithArrayInput(user: kotlin.collections.List<User>) : Future<Unit> {
        return createUsersWithArrayInputWithHttpInfo(user = user).map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> Unit
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * POST /user/createWithArray
     * Creates list of users with given input array
     * 
     * @param user List of user object
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun createUsersWithArrayInputWithHttpInfo(user: kotlin.collections.List<User>) : Future<ApiResponse<Unit?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.POST, UriTemplate.of("$basePath/user/createWithArray"))

        
        
        
                    request.putHeader("Content-Type", "application/json")
        
        



        if (apiKey["api_key"] != null) {
            if (apiKeyPrefix["api_key"] != null) {
                request.putHeader("api_key", apiKeyPrefix["api_key"]!! + " " + apiKey["api_key"]!!)
            } else {
                request.putHeader("api_key", apiKey["api_key"]!!)
            }
        }

        return request
            .sendBuffer(responseBody(user))
            .map {
                val apiResponse: ApiResponse<Unit?> = handleResponse(it)
                apiResponse
            }
    }

    /**
     * POST /user/createWithList
     * Creates list of users with given input array
     * 
     * @param user List of user object
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createUsersWithListInput(user: kotlin.collections.List<User>) : Future<Unit> {
        return createUsersWithListInputWithHttpInfo(user = user).map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> Unit
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * POST /user/createWithList
     * Creates list of users with given input array
     * 
     * @param user List of user object
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun createUsersWithListInputWithHttpInfo(user: kotlin.collections.List<User>) : Future<ApiResponse<Unit?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.POST, UriTemplate.of("$basePath/user/createWithList"))

        
        
        
                    request.putHeader("Content-Type", "application/json")
        
        



        if (apiKey["api_key"] != null) {
            if (apiKeyPrefix["api_key"] != null) {
                request.putHeader("api_key", apiKeyPrefix["api_key"]!! + " " + apiKey["api_key"]!!)
            } else {
                request.putHeader("api_key", apiKey["api_key"]!!)
            }
        }

        return request
            .sendBuffer(responseBody(user))
            .map {
                val apiResponse: ApiResponse<Unit?> = handleResponse(it)
                apiResponse
            }
    }

    /**
     * DELETE /user/{username}
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteUser(username: kotlin.String) : Future<Unit> {
        return deleteUserWithHttpInfo(username = username).map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> Unit
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * DELETE /user/{username}
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteUserWithHttpInfo(username: kotlin.String) : Future<ApiResponse<Unit?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.DELETE, UriTemplate.of("$basePath/user/{username}".replace("{"+"username"+"}", encodeURIComponent(username.toString()))))

        
        
        
        



        if (apiKey["api_key"] != null) {
            if (apiKeyPrefix["api_key"] != null) {
                request.putHeader("api_key", apiKeyPrefix["api_key"]!! + " " + apiKey["api_key"]!!)
            } else {
                request.putHeader("api_key", apiKey["api_key"]!!)
            }
        }

        return request
            .send()
            .map {
                val apiResponse: ApiResponse<Unit?> = handleResponse(it)
                apiResponse
            }
    }

    /**
     * GET /user/{username}
     * Get user by user name
     * 
     * @param username The name that needs to be fetched. Use user1 for testing.
     * @return User
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getUserByName(username: kotlin.String) : Future<User> {
        return getUserByNameWithHttpInfo(username = username).map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> (localVarResponse as Success<*>).data as User
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * GET /user/{username}
     * Get user by user name
     * 
     * @param username The name that needs to be fetched. Use user1 for testing.
     * @return ApiResponse<User?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getUserByNameWithHttpInfo(username: kotlin.String) : Future<ApiResponse<User?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.GET, UriTemplate.of("$basePath/user/{username}".replace("{"+"username"+"}", encodeURIComponent(username.toString()))))

        
        
        
        request.putHeader("Accept", "application/xml, application/json")




        return request
            .send()
            .map {
                val apiResponse: ApiResponse<User?> = handleResponse(it)
                apiResponse
            }
    }

    /**
     * GET /user/login
     * Logs user into the system
     * 
     * @param username The user name for login
     * @param password The password for login in clear text
     * @return kotlin.String
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun loginUser(username: kotlin.String, password: kotlin.String) : Future<kotlin.String> {
        return loginUserWithHttpInfo(username = username, password = password).map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * GET /user/login
     * Logs user into the system
     * 
     * @param username The user name for login
     * @param password The password for login in clear text
     * @return ApiResponse<kotlin.String?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun loginUserWithHttpInfo(username: kotlin.String, password: kotlin.String) : Future<ApiResponse<kotlin.String?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.GET, UriTemplate.of("$basePath/user/login"))

        
        
        
        request.putHeader("Accept", "application/xml, application/json")


        username.let { request.queryParams().add("username", listOf(it.toString())) }
        password.let { request.queryParams().add("password", listOf(it.toString())) }


        return request
            .send()
            .map {
                val apiResponse: ApiResponse<kotlin.String?> = handleResponse(it)
                apiResponse
            }
    }

    /**
     * GET /user/logout
     * Logs out current logged in user session
     * 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun logoutUser() : Future<Unit> {
        return logoutUserWithHttpInfo().map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> Unit
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * GET /user/logout
     * Logs out current logged in user session
     * 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun logoutUserWithHttpInfo() : Future<ApiResponse<Unit?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.GET, UriTemplate.of("$basePath/user/logout"))

        
        
        
        



        if (apiKey["api_key"] != null) {
            if (apiKeyPrefix["api_key"] != null) {
                request.putHeader("api_key", apiKeyPrefix["api_key"]!! + " " + apiKey["api_key"]!!)
            } else {
                request.putHeader("api_key", apiKey["api_key"]!!)
            }
        }

        return request
            .send()
            .map {
                val apiResponse: ApiResponse<Unit?> = handleResponse(it)
                apiResponse
            }
    }

    /**
     * PUT /user/{username}
     * Updated user
     * This can only be done by the logged in user.
     * @param username name that need to be deleted
     * @param user Updated user object
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateUser(username: kotlin.String, user: User) : Future<Unit> {
        return updateUserWithHttpInfo(username = username, user = user).map { localVarResponse ->
            when (localVarResponse.responseType) {
                ResponseType.Success -> Unit
                ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
                ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
                ResponseType.ClientError -> {
                    val localVarError = localVarResponse as ClientError<*>
                    throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
                ResponseType.ServerError -> {
                    val localVarError = localVarResponse as ServerError<*>
                    throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
                }
            }
        }
    }

    /**
     * PUT /user/{username}
     * Updated user
     * This can only be done by the logged in user.
     * @param username name that need to be deleted
     * @param user Updated user object
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun updateUserWithHttpInfo(username: kotlin.String, user: User) : Future<ApiResponse<Unit?>> {
        val vertxClient = WebClient.create(vertx)
        val request = vertxClient.requestAbs(HttpMethod.PUT, UriTemplate.of("$basePath/user/{username}".replace("{"+"username"+"}", encodeURIComponent(username.toString()))))

        
        
        
                    request.putHeader("Content-Type", "application/json")
        
        



        if (apiKey["api_key"] != null) {
            if (apiKeyPrefix["api_key"] != null) {
                request.putHeader("api_key", apiKeyPrefix["api_key"]!! + " " + apiKey["api_key"]!!)
            } else {
                request.putHeader("api_key", apiKey["api_key"]!!)
            }
        }

        return request
            .sendBuffer(responseBody(user))
            .map {
                val apiResponse: ApiResponse<Unit?> = handleResponse(it)
                apiResponse
            }
    }


    private inline fun <reified T: Any?> responseBody(body: T): Buffer {
        return Buffer.buffer(Serializer.jacksonObjectMapper.writeValueAsBytes(body))
    }

}
