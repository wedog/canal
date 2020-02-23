package com.alibaba.otter.canal.deployer;

import java.text.MessageFormat;

/**
 * 启动常用变量
 *
 * @author jianghang 2012-11-8 下午03:15:55
 * @version 1_0_0
 */
public class CanalConstants {

    public static final String MDC_DESTINATION                      = "destination";
    public static final String ROOT                                 = "canal";
    public static final String CANAL_ID                             = ROOT + "_" + "id";
    public static final String CANAL_IP                             = ROOT + "_" + "ip";
    public static final String CANAL_REGISTER_IP                    = ROOT + "_" + "register_ip";
    public static final String CANAL_PORT                           = ROOT + "_" + "port";
    public static final String CANAL_USER                           = ROOT + "_" + "user";
    public static final String CANAL_PASSWD                         = ROOT + "_" + "passwd";
    public static final String CANAL_METRICS_PULL_PORT              = ROOT + "_" + "metrics_pull_port";
    public static final String CANAL_ADMIN_MANAGER                  = ROOT + "_" + "admin_manager";
    public static final String CANAL_ADMIN_PORT                     = ROOT + "_" + "admin_port";
    public static final String CANAL_ADMIN_USER                     = ROOT + "_" + "admin_user";
    public static final String CANAL_ADMIN_PASSWD                   = ROOT + "_" + "admin_passwd";
    public static final String CANAL_ADMIN_AUTO_REGISTER            = ROOT + "_" + "admin_register_auto";
    public static final String CANAL_ADMIN_AUTO_CLUSTER             = ROOT + "_" + "admin_register_cluster";
    public static final String CANAL_ZKSERVERS                      = ROOT + "_" + "zkServers";
    public static final String CANAL_WITHOUT_NETTY                  = ROOT + "_" + "withoutNetty";

    public static final String CANAL_DESTINATIONS                   = ROOT + "_" + "destinations";
    public static final String CANAL_AUTO_SCAN                      = ROOT + "_" + "auto_scan";
    public static final String CANAL_AUTO_SCAN_INTERVAL             = ROOT + "_" + "auto_scan_interval";
    public static final String CANAL_CONF_DIR                       = ROOT + "_" + "conf_dir";
    public static final String CANAL_SERVER_MODE                    = ROOT + "_" + "serverMode";

    public static final String CANAL_DESTINATION_SPLIT              = ",";
    public static final String GLOBAL_NAME                          = "global";

    public static final String INSTANCE_MODE_TEMPLATE               = ROOT + "_" + "instance_{0}_mode";
    public static final String INSTANCE_LAZY_TEMPLATE               = ROOT + "_" + "instance_{0}_lazy";
    public static final String INSTANCE_MANAGER_ADDRESS_TEMPLATE    = ROOT + "_" + "instance_{0}_manager_address";
    public static final String INSTANCE_SPRING_XML_TEMPLATE         = ROOT + "_" + "instance_{0}_spring_xml";

    public static final String CANAL_DESTINATION_PROPERTY           = ROOT + "_instance_destination";

    public static final String CANAL_SOCKETCHANNEL                  = ROOT + "_" + "socketChannel";

    public static final String CANAL_MQ_SERVERS                     = ROOT + "_" + "mq_servers";
    public static final String CANAL_MQ_RETRIES                     = ROOT + "_" + "mq_retries";
    public static final String CANAL_MQ_BATCHSIZE                   = ROOT + "_" + "mq_batchSize";
    public static final String CANAL_MQ_LINGERMS                    = ROOT + "_" + "mq_lingerMs";
    public static final String CANAL_MQ_MAXREQUESTSIZE              = ROOT + "_" + "mq_maxRequestSize";
    public static final String CANAL_MQ_BUFFERMEMORY                = ROOT + "_" + "mq_bufferMemory";
    public static final String CANAL_MQ_CANALBATCHSIZE              = ROOT + "_" + "mq_canalBatchSize";
    public static final String CANAL_MQ_CANALGETTIMEOUT             = ROOT + "_" + "mq_canalGetTimeout";
    public static final String CANAL_MQ_FLATMESSAGE                 = ROOT + "_" + "mq_flatMessage";
    public static final String CANAL_MQ_PARALLELTHREADSIZE          = ROOT + "_" + "mq_parallelThreadSize";
    public static final String CANAL_MQ_COMPRESSION_TYPE            = ROOT + "_" + "mq_compressionType";
    public static final String CANAL_MQ_ACKS                        = ROOT + "_" + "mq_acks";
    public static final String CANAL_MQ_TRANSACTION                 = ROOT + "_" + "mq_transaction";
    public static final String CANAL_MQ_PRODUCERGROUP               = ROOT + "_" + "mq_producerGroup";
    public static final String CANAL_ALIYUN_ACCESSKEY               = ROOT + "_" + "aliyun_accessKey";
    public static final String CANAL_ALIYUN_SECRETKEY               = ROOT + "_" + "aliyun_secretKey";
    public static final String CANAL_MQ_PROPERTIES                  = ROOT + "_" + "mq_properties";
    public static final String CANAL_MQ_ENABLE_MESSAGE_TRACE        = ROOT + "_" + "mq_enableMessageTrace";
    public static final String CANAL_MQ_ACCESS_CHANNEL              = ROOT + "_" + "mq_accessChannel";
    public static final String CANAL_MQ_CUSTOMIZED_TRACE_TOPIC      = ROOT + "_" + "mq_customizedTraceTopic";
    public static final String CANAL_MQ_NAMESPACE                   = ROOT + "_" + "mq_namespace";
    public static final String CANAL_MQ_KAFKA_KERBEROS_ENABLE       = ROOT + "_" + "mq_kafka_kerberos_enable";
    public static final String CANAL_MQ_KAFKA_KERBEROS_KRB5FILEPATH = ROOT + "_" + "mq_kafka_kerberos_krb5FilePath";
    public static final String CANAL_MQ_KAFKA_KERBEROS_JAASFILEPATH = ROOT + "_" + "mq_kafka_kerberos_jaasFilePath";
    public static final String CANAL_MQ_USERNAME                    = ROOT + "_" + "mq_username";
    public static final String CANAL_MQ_PASSWORD                    = ROOT + "_" + "mq_password";
    public static final String CANAL_MQ_VHOST                       = ROOT + "_" + "mq_vhost";
    public static final String CANAL_MQ_ALIYUN_UID                  = ROOT + "_" + "mq_aliyunuid";
    public static final String CANAL_MQ_EXCHANGE                    = ROOT + "_" + "mq_exchange";
    public static final String CANAL_MQ_DATABASE_HASH               = ROOT + "_" + "mq_database_hash";

    public static String getInstanceModeKey(String destination) {
        return MessageFormat.format(INSTANCE_MODE_TEMPLATE, destination);
    }

    public static String getInstanceManagerAddressKey(String destination) {
        return MessageFormat.format(INSTANCE_MANAGER_ADDRESS_TEMPLATE, destination);
    }

    public static String getInstancSpringXmlKey(String destination) {
        return MessageFormat.format(INSTANCE_SPRING_XML_TEMPLATE, destination);
    }

    public static String getInstancLazyKey(String destination) {
        return MessageFormat.format(INSTANCE_LAZY_TEMPLATE, destination);
    }
}
