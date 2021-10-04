package com.kafka.common.util

import com.typesafe.config.Config

/**
 * Author: Cesar Advincula
 * This class use the parameters of the Config File
 * @param baseConfig
 */

class ApplicationParameters(baseConfig:Config) extends Serializable {

  val appName        = baseConfig.getString("application.app-name")
  val edgeNodePath   = baseConfig.getString("application.edge-node-path")
  val hdfsService    = baseConfig.getString("application.hdfs.service-url")
  val metadaHive     = baseConfig.getString("application.metadata-hive")
  val tableName      = baseConfig.getString("application.source-data")
  val schemaName     = baseConfig.getString("application.layer-data-lake")

}
