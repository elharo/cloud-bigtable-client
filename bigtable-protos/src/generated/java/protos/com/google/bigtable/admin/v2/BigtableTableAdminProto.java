// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public final class BigtableTableAdminProto {
  private BigtableTableAdminProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_CreateTableRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_CreateTableRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_CreateTableRequest_Split_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_CreateTableRequest_Split_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_BulkDeleteRowsRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_BulkDeleteRowsRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_ListTablesRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ListTablesRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_ListTablesResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ListTablesResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_GetTableRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GetTableRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_DeleteTableRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_DeleteTableRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_Modification_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_Modification_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/bigtable/admin/v2/bigtable_tabl" +
      "e_admin.proto\022\030google.bigtable.admin.v2\032" +
      "\034google/api/annotations.proto\032$google/bi" +
      "gtable/admin/v2/table.proto\032\033google/prot" +
      "obuf/empty.proto\"\306\001\n\022CreateTableRequest\022" +
      "\014\n\004name\030\001 \001(\t\022\020\n\010table_id\030\002 \001(\t\022.\n\005table" +
      "\030\003 \001(\0132\037.google.bigtable.admin.v2.Table\022" +
      "J\n\016initial_splits\030\004 \003(\01322.google.bigtabl" +
      "e.admin.v2.CreateTableRequest.Split\032\024\n\005S" +
      "plit\022\013\n\003key\030\001 \001(\014\"o\n\025BulkDeleteRowsReque",
      "st\022\014\n\004name\030\001 \001(\t\022\030\n\016row_key_prefix\030\002 \001(\014" +
      "H\000\022$\n\032delete_all_data_from_table\030\003 \001(\010H\000" +
      "B\010\n\006target\"i\n\021ListTablesRequest\022\014\n\004name\030" +
      "\001 \001(\t\0222\n\004view\030\002 \001(\0162$.google.bigtable.ad" +
      "min.v2.Table.View\022\022\n\npage_token\030\003 \001(\t\"^\n" +
      "\022ListTablesResponse\022/\n\006tables\030\001 \003(\0132\037.go" +
      "ogle.bigtable.admin.v2.Table\022\027\n\017next_pag" +
      "e_token\030\002 \001(\t\"S\n\017GetTableRequest\022\014\n\004name" +
      "\030\001 \001(\t\0222\n\004view\030\002 \001(\0162$.google.bigtable.a" +
      "dmin.v2.Table.View\"\"\n\022DeleteTableRequest",
      "\022\014\n\004name\030\001 \001(\t\"\256\002\n\033ModifyColumnFamiliesR" +
      "equest\022\014\n\004name\030\001 \001(\t\022Y\n\rmodifications\030\002 " +
      "\003(\0132B.google.bigtable.admin.v2.ModifyCol" +
      "umnFamiliesRequest.Modification\032\245\001\n\014Modi" +
      "fication\022\n\n\002id\030\001 \001(\t\0228\n\006create\030\002 \001(\0132&.g" +
      "oogle.bigtable.admin.v2.ColumnFamilyH\000\0228" +
      "\n\006update\030\003 \001(\0132&.google.bigtable.admin.v" +
      "2.ColumnFamilyH\000\022\016\n\004drop\030\004 \001(\010H\000B\005\n\003mod2" +
      "\272\007\n\022BigtableTableAdmin\022\221\001\n\013CreateTable\022," +
      ".google.bigtable.admin.v2.CreateTableReq",
      "uest\032\037.google.bigtable.admin.v2.Table\"3\202" +
      "\323\344\223\002-\"(/v2/{name=projects/*/instances/*}" +
      "/tables:\001*\022\231\001\n\nListTables\022+.google.bigta" +
      "ble.admin.v2.ListTablesRequest\032,.google." +
      "bigtable.admin.v2.ListTablesResponse\"0\202\323" +
      "\344\223\002*\022(/v2/{name=projects/*/instances/*}/" +
      "tables\022\212\001\n\010GetTable\022).google.bigtable.ad" +
      "min.v2.GetTableRequest\032\037.google.bigtable" +
      ".admin.v2.Table\"2\202\323\344\223\002,\022*/v2/{name=proje" +
      "cts/*/instances/*/tables/*}\022\207\001\n\013DeleteTa",
      "ble\022,.google.bigtable.admin.v2.DeleteTab" +
      "leRequest\032\026.google.protobuf.Empty\"2\202\323\344\223\002" +
      ",**/v2/{name=projects/*/instances/*/tabl" +
      "es/*}\022\272\001\n\024ModifyColumnFamilies\0225.google." +
      "bigtable.admin.v2.ModifyColumnFamiliesRe" +
      "quest\032\037.google.bigtable.admin.v2.Table\"J" +
      "\202\323\344\223\002D\"?/v2/{name=projects/*/instances/*" +
      "/tables/*}:modifyColumnFamilies:\001*\022\237\001\n\016B" +
      "ulkDeleteRows\022/.google.bigtable.admin.v2" +
      ".BulkDeleteRowsRequest\032\026.google.protobuf",
      ".Empty\"D\202\323\344\223\002>\"9/v2/{name=projects/*/ins" +
      "tances/*/tables/*}:bulkDeleteRows:\001*B9\n\034" +
      "com.google.bigtable.admin.v2B\027BigtableTa" +
      "bleAdminProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.bigtable.admin.v2.TableProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_google_bigtable_admin_v2_CreateTableRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_v2_CreateTableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_CreateTableRequest_descriptor,
        new java.lang.String[] { "Name", "TableId", "Table", "InitialSplits", });
    internal_static_google_bigtable_admin_v2_CreateTableRequest_Split_descriptor =
      internal_static_google_bigtable_admin_v2_CreateTableRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_CreateTableRequest_Split_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_CreateTableRequest_Split_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_google_bigtable_admin_v2_BulkDeleteRowsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_v2_BulkDeleteRowsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_BulkDeleteRowsRequest_descriptor,
        new java.lang.String[] { "Name", "RowKeyPrefix", "DeleteAllDataFromTable", "Target", });
    internal_static_google_bigtable_admin_v2_ListTablesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_admin_v2_ListTablesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_ListTablesRequest_descriptor,
        new java.lang.String[] { "Name", "View", "PageToken", });
    internal_static_google_bigtable_admin_v2_ListTablesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_bigtable_admin_v2_ListTablesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_ListTablesResponse_descriptor,
        new java.lang.String[] { "Tables", "NextPageToken", });
    internal_static_google_bigtable_admin_v2_GetTableRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_bigtable_admin_v2_GetTableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_GetTableRequest_descriptor,
        new java.lang.String[] { "Name", "View", });
    internal_static_google_bigtable_admin_v2_DeleteTableRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_bigtable_admin_v2_DeleteTableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_DeleteTableRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_descriptor,
        new java.lang.String[] { "Name", "Modifications", });
    internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_Modification_descriptor =
      internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_Modification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_ModifyColumnFamiliesRequest_Modification_descriptor,
        new java.lang.String[] { "Id", "Create", "Update", "Drop", "Mod", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.bigtable.admin.v2.TableProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
