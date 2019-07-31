// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_test.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import com.squareup.wire.internal.missingRequiredFields
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.UnsupportedOperationException
import kotlin.jvm.JvmField
import okio.ByteString

data class RedactedRequired(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REQUIRED,
    redacted = true
  )
  val a: String,
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<RedactedRequired, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing {
    throw AssertionError()
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RedactedRequired) return false
    return unknownFields == other.unknownFields
        && a == other.a
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = result * 37 + a.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String = buildString {
    append("RedactedRequired(")
    append("""a=██""")
    append(")")
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<RedactedRequired> = object : ProtoAdapter<RedactedRequired>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedRequired::class
    ) {
      override fun encodedSize(value: RedactedRequired): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.a) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: RedactedRequired) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): RedactedRequired {
        var a: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> a = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RedactedRequired(
          a = a ?: throw missingRequiredFields(a, "a"),
          unknownFields = unknownFields
        )
      }

      override fun redact(value: RedactedRequired): RedactedRequired {
        throw UnsupportedOperationException("Field 'a' is required and cannot be redacted.")
      }
    }
  }
}
