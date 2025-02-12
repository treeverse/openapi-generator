/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// ArrayItemRefTest : Test handling of object reference in arrays
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ArrayItemRefTest {
    #[serde(rename = "list_with_array_ref")]
    pub list_with_array_ref: Vec<Vec<String>>,
    #[serde(rename = "list_with_object_ref")]
    pub list_with_object_ref: Vec<std::collections::HashMap<String, serde_json::Value>>,
}

impl ArrayItemRefTest {
    /// Test handling of object reference in arrays
    pub fn new(list_with_array_ref: Vec<Vec<String>>, list_with_object_ref: Vec<std::collections::HashMap<String, serde_json::Value>>) -> ArrayItemRefTest {
        ArrayItemRefTest {
            list_with_array_ref,
            list_with_object_ref,
        }
    }
}

