package model;

public class Wheater {

        private String city;
        private String country;
        private String humidity;
        private String descriptions;
        private String temperature;

        public Wheater(String city, String country, String humidity, String descriptions, String temperature) {
            this.city = city;
            this.country = country;
            this.humidity = humidity;
            this.descriptions = descriptions;
            this.temperature = temperature;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getDescriptions() {
            return descriptions;
        }

        public void setDescriptions(String descriptions) {
            this.descriptions = descriptions;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        @Override
        public String toString() {
            return "Wheater{" +
                    "city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    ", humidity='" + humidity + '\'' +
                    ", descriptions='" + descriptions + '\'' +
                    ", temperature='" + temperature + '\'' +
                    '}';
        }
    }

