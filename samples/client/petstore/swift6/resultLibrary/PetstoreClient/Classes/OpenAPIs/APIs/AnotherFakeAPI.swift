//
// AnotherFakeAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

internal class AnotherFakeAPI {

    /**
     To test special tags
     
     - parameter body: (body) client model 
     - parameter openAPIClient: The OpenAPIClient that contains the configuration for the http request.
     - parameter completion: completion handler to receive the result
     */
    @discardableResult
    internal class func call123testSpecialTags(body: Client, openAPIClient: OpenAPIClient = OpenAPIClient.shared, completion: @Sendable @escaping (_ result: Swift.Result<Client, ErrorResponse>) -> Void) -> RequestTask {
        return call123testSpecialTagsWithRequestBuilder(body: body, openAPIClient: openAPIClient).execute { result in
            switch result {
            case let .success(response):
                completion(.success(response.body))
            case let .failure(error):
                completion(.failure(error))
            }
        }
    }

    /**
     To test special tags
     - PATCH /another-fake/dummy
     - To test special tags and operation ID starting with number
     - parameter body: (body) client model 
     
     - parameter openAPIClient: The OpenAPIClient that contains the configuration for the http request.
     - returns: RequestBuilder<Client> 
     */
    internal class func call123testSpecialTagsWithRequestBuilder(body: Client, openAPIClient: OpenAPIClient = OpenAPIClient.shared) -> RequestBuilder<Client> {
        let localVariablePath = "/another-fake/dummy"
        let localVariableURLString = openAPIClient.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body, codableHelper: openAPIClient.codableHelper)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Client>.Type = openAPIClient.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "PATCH", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: false, openAPIClient: openAPIClient)
    }
}
