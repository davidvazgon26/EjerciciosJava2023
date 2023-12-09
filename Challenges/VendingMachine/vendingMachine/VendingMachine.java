package vendingMachine;

interface Drink {
    int getPrice();

    String getName();

    int getQuantityLeft();

    void serveDrink();
}

class ServeDrinkSummary {
    Drink servedDrink;
    int change;
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class InsufficientMoneyException extends Exception {
    public InsufficientMoneyException() {
        super();
    }
}

class VendingMachine {
    void registerDrink(int buttonIdx, Drink drink) {

    }

    ServeDrinkSummary dispatch(int buttonPressed, int money)
            throws OutOfStockException, InsufficientMoneyException {
        return null;
    }
}