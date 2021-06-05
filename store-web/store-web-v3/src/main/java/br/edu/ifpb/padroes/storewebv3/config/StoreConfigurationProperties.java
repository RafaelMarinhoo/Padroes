package br.edu.ifpb.padroes.storewebv3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "store")
public class StoreConfigurationProperties {

    private String stripeKey;

    public String getStripeKey() {
        return stripeKey;
    }

    public void setStripeKey(String stripeKey) {
        this.stripeKey = stripeKey;
    }
}
