// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.wire.mutable.Payload in squareup/wire/mutable_types.proto
@file:Suppress(
  "DEPRECATION",
  "RUNTIME_ANNOTATION_NOT_SUPPORTED",
)

package squareup.wire.mutable

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import kotlin.UnsupportedOperationException
import okio.ByteString

public class MutablePayload(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    schemaIndex = 0,
  )
  public var content: ByteString? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<MutablePayload, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw UnsupportedOperationException("newBuilder() is unsupported for mutable message types")

  override fun equals(other: Any?): Boolean {
    if (other !is MutablePayload) return false
    if (unknownFields != other.unknownFields) return false
    if (content != other.content) return false
    return true
  }

  override fun hashCode(): Int {
    var result = 0
    result = unknownFields.hashCode()
    result = result * 37 + (content?.hashCode() ?: 0)
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (content != null) result += """content=$content"""
    return result.joinToString(prefix = "MutablePayload{", separator = ", ", postfix = "}")
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<MutablePayload> = object : ProtoAdapter<MutablePayload>(
      FieldEncoding.LENGTH_DELIMITED, 
      MutablePayload::class, 
      "type.googleapis.com/squareup.wire.mutable.Payload", 
      PROTO_2, 
      null, 
      "squareup/wire/mutable_types.proto"
    ) {
      override fun encodedSize(`value`: MutablePayload): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.content)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: MutablePayload) {
        ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.content)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: MutablePayload) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.content)
      }

      override fun decode(reader: ProtoReader): MutablePayload {
        var content: ByteString? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> content = ProtoAdapter.BYTES.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return MutablePayload(
          content = content,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: MutablePayload): MutablePayload = throw UnsupportedOperationException("redact() is unsupported for mutable message types")
    }

    private const val serialVersionUID: Long = 0L
  }
}
