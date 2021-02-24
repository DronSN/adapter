package ru.skvrez.adapter_example.shared;

import ru.skvrez.adapter_example.shared.CardinalPoints;

public class GeoCoordinate {

    private Double degree;
    private CardinalPoints cardinalPoints;

    public GeoCoordinate(Double degree, CardinalPoints cardinalPoints) {
        this.degree = degree;
        this.cardinalPoints = cardinalPoints;
    }

    public Double getDegree() {
        return degree;
    }

    public void setDegree(Double degree) {
        this.degree = degree;
    }

    public CardinalPoints getCardinalPoints() {
        return cardinalPoints;
    }

    public void setCardinalPoints(CardinalPoints cardinalPoints) {
        this.cardinalPoints = cardinalPoints;
    }
}
