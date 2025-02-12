// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Defines EnumClass
    /// </summary>
    public enum EnumClass
    {
        /// <summary>
        /// Enum Abc for value: _abc
        /// </summary>
        Abc = 1,

        /// <summary>
        /// Enum Efg for value: -efg
        /// </summary>
        Efg = 2,

        /// <summary>
        /// Enum Xyz for value: (xyz)
        /// </summary>
        Xyz = 3
    }

    /// <summary>
    /// Converts <see cref="EnumClass"/> to and from the JSON value
    /// </summary>
    public static class EnumClassValueConverter
    {
        /// <summary>
        /// Parses a given value to <see cref="EnumClass"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static EnumClass FromString(string value)
        {
            if (value.Equals("_abc"))
                return EnumClass.Abc;

            if (value.Equals("-efg"))
                return EnumClass.Efg;

            if (value.Equals("(xyz)"))
                return EnumClass.Xyz;

            throw new NotImplementedException($"Could not convert value to type EnumClass: '{value}'");
        }

        /// <summary>
        /// Parses a given value to <see cref="EnumClass"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static EnumClass? FromStringOrDefault(string value)
        {
            if (value.Equals("_abc"))
                return EnumClass.Abc;

            if (value.Equals("-efg"))
                return EnumClass.Efg;

            if (value.Equals("(xyz)"))
                return EnumClass.Xyz;

            return null;
        }

        /// <summary>
        /// Converts the <see cref="EnumClass"/> to the json value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        /// <exception cref="NotImplementedException"></exception>
        public static string ToJsonValue(EnumClass value)
        {
            if (value == EnumClass.Abc)
                return "_abc";

            if (value == EnumClass.Efg)
                return "-efg";

            if (value == EnumClass.Xyz)
                return "(xyz)";

            throw new NotImplementedException($"Value could not be handled: '{value}'");
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="EnumClass"/>
    /// </summary>
    /// <exception cref="NotImplementedException"></exception>
    public class EnumClassJsonConverter : JsonConverter<EnumClass>
    {
        /// <summary>
        /// Returns a  from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override EnumClass Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string? rawValue = reader.GetString();

            EnumClass? result = rawValue == null
                ? null
                : EnumClassValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the EnumClass to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="enumClass"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, EnumClass enumClass, JsonSerializerOptions options)
        {
            writer.WriteStringValue(enumClass.ToString());
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="EnumClass"/>
    /// </summary>
    public class EnumClassNullableJsonConverter : JsonConverter<EnumClass?>
    {
        /// <summary>
        /// Returns a EnumClass from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override EnumClass? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string? rawValue = reader.GetString();

            EnumClass? result = rawValue == null
                ? null
                : EnumClassValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the DateTime to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="enumClass"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, EnumClass? enumClass, JsonSerializerOptions options)
        {
            writer.WriteStringValue(enumClass?.ToString() ?? "null");
        }
    }
}
