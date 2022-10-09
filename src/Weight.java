public enum Weight {N1(" с полной массой до 3,5 тонны"),
        N2(" с полной массой свыше 3,5 до 12 тонн"),
        N3(" с полной массой свыше 12 тонн");
        public String weight;

        Weight(String weight) {
            this.weight = weight;
        }

         public String getWeight() {
            return weight;
        }


    }

