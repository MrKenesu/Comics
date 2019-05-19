package fp.tipo;

import java.time.LocalDate;

public class Cancion implements Comparable<Cancion>{
	
	
		// TODO Auto-generated method stub
//atributos
		private String titulo;
		private String autor;
		private Integer duracion;
		private LocalDate fechaLanzamiento;
		private Genero genero;
		
		
//constructor		
		public Cancion(String titulo, String autor, Integer duracion, LocalDate fechaLanzamiento, Genero genero) {
			this.titulo = titulo;
			this.autor = autor;
			this.duracion = duracion;
			this.fechaLanzamiento = fechaLanzamiento;
			this.genero = genero;
			// lanzar == throw
			if(duracion<0) {
				throw new IllegalArgumentException("Cancion. La duración no va");
					
			}
			
			if(fechaLanzamiento.isBefore(LocalDate.of(1951, 1, 1))) {
				throw new IllegalArgumentException("Cancion. La fecha debe ser posterior a 1950");
			}
		}
		// getters and setters
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public Integer getDuracion() {
			return duracion;
		}
		public void setDuracion(Integer duracion) {
			this.duracion = duracion;
		}
		public LocalDate getFechaLanzamiento() {
			return fechaLanzamiento;
		}
		public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
			LocalDate fecha = LocalDate.of(1951, 1, 1);
			//LocalDate fecha = LocalDate.parse("1951-01-01");
			
			if(fechaLanzamiento.isBefore(fecha)) {
				throw new IllegalArgumentException("Fecha no valida,anterior a 1950");
			}
			this.fechaLanzamiento = fechaLanzamiento;
		}
		public Genero getGenero() {
			return genero;
		}
		public void setGenero(Genero genero) {
			this.genero = genero;
		}
		
		// to string
		@Override
		public String toString() {
			return "cancion [titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + ", fechaLanzamiento="
					+ fechaLanzamiento + ", genero=" + genero + "]";
		}
		// propiedad derivada
		public Integer getAnyoLanzamiento(){
			Integer anyo;
			anyo = this.fechaLanzamiento.getYear();
			return anyo;
			/*
			 * public Integer getañoLanzamiento{
			 * 	return this.fechaLanzamiento.getYear();
			 * }
			 * 
			 */
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((autor == null) ? 0 : autor.hashCode());
			result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
			return result;
		}
		
		// EQUALS AND HASHCODE
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cancion other = (Cancion) obj;
			if (autor == null) {
				if (other.autor != null)
					return false;
			} else if (!autor.equals(other.autor))
				return false;
			if (titulo == null) {
				if (other.titulo != null)
					return false;
			} else if (!titulo.equals(other.titulo))
				return false;
			return true;
		}
		

		@Override
		public int compareTo(Cancion c) {
			// TODO Auto-generated method stub
			int res;
			
			res = getTitulo().compareTo(c.getTitulo());
			
			if(res==0) {
				res = getFechaLanzamiento().compareTo(c.getFechaLanzamiento());
			}
			
			return res;
		}
		
		
		
		
		
}
