package io.github.kongyu666.common.kafka.config;

import local.lingo.qj.common.core.factory.YmlPropertySourceFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * Spring Cloud Stream配置文件
 *
 * @author 孔余
 * @since 2024-06-06 09:37:53
 */
@AutoConfiguration
@PropertySource(value = "classpath:common-kafka.yml", factory = YmlPropertySourceFactory.class)
public class SpringKafkaConfig {
}
