public class Sparkonto extends Konto {

        public Sparkonto(Kunde inaber, double zinsGuthaben) {

            super(inaber,0, zinsGuthaben);

        }

            @Override
            public String toString() {
                String text = "Inaber = " + getInaber();
                text += "\n\tZinssatz = " + getZinsGuthaben();

                return text;
            }

    }
