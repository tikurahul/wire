// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.swift_modules.SwiftModuleThreeMessage in swift_module_three.proto
import Foundation
import Wire
import module_one

public struct SwiftModuleThreeMessage {

    @ProtoDefaulted
    public var name: String?
    public var unknownFields: Foundation.Data = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension SwiftModuleThreeMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension SwiftModuleThreeMessage : Hashable {
}
#endif

extension SwiftModuleThreeMessage : Sendable {
}

extension SwiftModuleThreeMessage : ProtoDefaultedValue {

    public static var defaultedValue: SwiftModuleThreeMessage {
        SwiftModuleThreeMessage()
    }
}

extension SwiftModuleThreeMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.swift_modules.SwiftModuleThreeMessage"
    }

}

extension SwiftModuleThreeMessage : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var name: String? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: name = try protoReader.decode(String.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._name.wrappedValue = name
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.name)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension SwiftModuleThreeMessage : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._name.wrappedValue = try container.decodeIfPresent(String.self, forKey: "name")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.name, forKey: "name")
    }

}
#endif

/**
 * Subtypes within SwiftModuleThreeMessage
 */
extension SwiftModuleThreeMessage {

    public struct NestedMessage {

        public var map_string_types: [String : SwiftModuleOneEnum] = [:]
        public var module_type: SwiftModuleOneMessage?
        public var unknownFields: Foundation.Data = .init()

        public init(configure: (inout Self) -> Swift.Void = { _ in }) {
            configure(&self)
        }

    }

}

#if !WIRE_REMOVE_EQUATABLE
extension SwiftModuleThreeMessage.NestedMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension SwiftModuleThreeMessage.NestedMessage : Hashable {
}
#endif

extension SwiftModuleThreeMessage.NestedMessage : Sendable {
}

extension SwiftModuleThreeMessage.NestedMessage : ProtoDefaultedValue {

    public static var defaultedValue: SwiftModuleThreeMessage.NestedMessage {
        SwiftModuleThreeMessage.NestedMessage()
    }
}

extension SwiftModuleThreeMessage.NestedMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.swift_modules.SwiftModuleThreeMessage.NestedMessage"
    }

}

extension SwiftModuleThreeMessage.NestedMessage : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var map_string_types: [String : SwiftModuleOneEnum] = [:]
        var module_type: SwiftModuleOneMessage? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: try protoReader.decode(into: &map_string_types)
            case 2: module_type = try protoReader.decode(SwiftModuleOneMessage.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.map_string_types = map_string_types
        self.module_type = module_type
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.map_string_types)
        try protoWriter.encode(tag: 2, value: self.module_type)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension SwiftModuleThreeMessage.NestedMessage : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self.map_string_types = try container.decodeProtoMap([String : SwiftModuleOneEnum].self, firstOfKeys: "mapStringTypes", "map_string_types")
        self.module_type = try container.decodeIfPresent(SwiftModuleOneMessage.self, firstOfKeys: "moduleType", "module_type")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        if includeDefaults || !self.map_string_types.isEmpty {
            try container.encodeProtoMap(self.map_string_types, forKey: preferCamelCase ? "mapStringTypes" : "map_string_types")
        }
        try container.encodeIfPresent(self.module_type, forKey: preferCamelCase ? "moduleType" : "module_type")
    }

}
#endif
