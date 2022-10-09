public enum TypeOfBody {SEDAN("седан"),
    HATCHBACK("хетчбэк"),
    COUPE("купе"),
    ESTATE("универсал"),
    OFFROAD("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивэн");

    private final String typeOfBody;


    TypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }



}
