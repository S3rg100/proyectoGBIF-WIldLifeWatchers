package entities;

public class Camara_Trampa {
    public class Camara {
        private String id_camara;
        private String ubicacion_camara;
        private boolean estado;

        public void generarImagen(String id_camara, String ubicacion_camara, boolean estado) {
            this.id_camara = id_camara;
            this.ubicacion_camara = ubicacion_camara;
            this.estado = estado;
        }

        public void setIdCamara(String id_camara) {
            this.id_camara = id_camara;
        }

        public String getIdCamara() {
            return id_camara;
        }

        public void setUbicacionCamara(String ubicacion_camara) {
            this.ubicacion_camara = ubicacion_camara;
        }

        public String getUbicacionCamara() {
            return ubicacion_camara;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }

        public boolean getEstado() {
            return estado;
        }
    }
}