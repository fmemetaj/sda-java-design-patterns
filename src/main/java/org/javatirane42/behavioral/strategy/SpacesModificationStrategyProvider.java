package org.javatirane42.behavioral.strategy;

public class SpacesModificationStrategyProvider {

    public SpacesModificationStrategy get(StrategyType strategyType) {
        switch (strategyType) {
            case DOUBLE:
                return new DoubleSpacesStrategy();
            case REMOVE:
                return new RemoveSpacesStrategy();
        }
        throw new UnsupportedOperationException("Unsupported strategy type");
    }
}
