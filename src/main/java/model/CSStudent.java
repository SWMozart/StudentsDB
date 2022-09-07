package repo;

import model.Student;

    public class CSStudent extends Student {

        private String Kurs;

        public CSStudent(int id, String name, String kurs) {
            super(String.valueOf(id), name);
            this.Kurs = kurs;
        }

        public String getKurs() {
            return Kurs;
        }

        public void setKurs(String kurs) {
            this.Kurs = kurs;
        }


    }
