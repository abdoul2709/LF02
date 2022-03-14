public class Sparkonto extends Konto {

        public Sparkonto(Kunde inaber, double zinsGuthaben) {

            super(inaber,0, zinsGuthaben);

        }

            @Override
            public String toString() {

            return super.toString() + "------------------------------------";
            }

    }
