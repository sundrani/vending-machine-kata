package vendingmachine.domain;

import com.google.common.collect.Sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static vendingmachine.domain.MachineState.READY;
import static vendingmachine.domain.Money.money;

public class VendingMachine {

    private MachineState state;

    private Set<Coin> coinReturnTray;

    public VendingMachine() {
        state = READY;
        coinReturnTray = new HashSet<>();
    }

    public String getDisplay() {
        if (state == READY) {
            return "INSERT A COIN";
        }

        return "";
    }

    /**
     * Current amount on display:
     * sum of *valid* coins inserted, minus sold products, minus change
     */
    public Money getBalance() {
        return money(0);
    }

    /**
     * @return unmodifiableSet
     */
    public Set<Coin> getCoinReturnTray() {
        return Collections.unmodifiableSet(coinReturnTray);
    }
}
