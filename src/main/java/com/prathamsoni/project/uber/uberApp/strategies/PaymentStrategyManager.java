package com.prathamsoni.project.uber.uberApp.strategies;

import com.prathamsoni.project.uber.uberApp.entities.enums.PaymentMethod;
import com.prathamsoni.project.uber.uberApp.strategies.impl.CashPaymentStrategy;
import com.prathamsoni.project.uber.uberApp.strategies.impl.WalletPaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {

    private final WalletPaymentStrategy walletPaymentStrategy;
    private final CashPaymentStrategy cashPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;
        };
    }
}
