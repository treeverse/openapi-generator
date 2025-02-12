//
// AdditionalPropertiesClass.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

internal struct AdditionalPropertiesClass: Codable, JSONEncodable {

    internal private(set) var mapString: [String: String]?
    internal private(set) var mapMapString: [String: [String: String]]?

    internal init(mapString: [String: String]? = nil, mapMapString: [String: [String: String]]? = nil) {
        self.mapString = mapString
        self.mapMapString = mapMapString
    }

    internal enum CodingKeys: String, CodingKey, CaseIterable {
        case mapString = "map_string"
        case mapMapString = "map_map_string"
    }

    // Encodable protocol methods

    internal func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(mapString, forKey: .mapString)
        try container.encodeIfPresent(mapMapString, forKey: .mapMapString)
    }
}

