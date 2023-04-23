/*
 * Copyright (C) 2023 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package okhttp3.internal.idn

import okio.BufferedSink

/**
 * A decoded [mapping table] that can perform the [mapping step] of IDNA processing.
 *
 * This implementation is optimized for readability over efficiency.
 *
 * [mapping table]: https://www.unicode.org/reports/tr46/#IDNA_Mapping_Table
 * [mapping step]: https://www.unicode.org/reports/tr46/#ProcessingStepMap
 */
class CompactIdnaMappingTable internal constructor(
  private val mappings: List<Mapping>,
) : IdnaMappingTable {
  override fun map(codePoint: Int, sink: BufferedSink): Boolean {
    TODO("Not yet implemented")
  }
  /*
  sorted 4 bytes section index
  2 bytes: section prefix: 0000 ... 10FF
  2 bytes: section offset: position in file

sorted 4 bytes mappings
  1 byte: character
  4 bits: mapping type
     (
      literal mapped inline,
      literal mapped offset length,
      disallowed,
      valid,
      ignored,
      disallowed_STD3_mapped inline
      disallowed_STD3_mapped offset length
     )
  mapping content, either:
    20 bits, inline single codepoint,
     4 bits, length + 16 bits, offset


   */
}

