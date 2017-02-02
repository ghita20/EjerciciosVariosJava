
public class Clase {
	//*************CAMPOS
		private Examen examen_alumno[][];
	
	//*************CONSTRUCTORES
		public Clase(){
			//10 Alumnos -- 5 examenes por alumno
			examen_alumno=new Examen[10][5];
			
			for(int i=0;i<examen_alumno.length;i++)
				for(int j=0;j<examen_alumno[i].length;j++)
					examen_alumno[i][j]=new Examen();			
		}
		
	//**************MÉTODOS
		public float calcularMedia(){
			float suma=0,cantidadExamenes=0;
			
			for(int i=0;i<examen_alumno.length;i++)
				for(int j=0;j<examen_alumno[i].length;j++){
					suma+=examen_alumno[i][j].getNota();
					cantidadExamenes++;
				}
			
			return suma/cantidadExamenes;
		}
		
		public float calculardesviacionTipica(){
			float media=calcularMedia(),result=0,cantidad=0;
			
			for(int i=0;i<examen_alumno.length;i++)
				for(int j=0;j<examen_alumno[i].length;j++){
					result+= (float) Math.pow(examen_alumno[i][j].getNota()-media, 2);
					cantidad++;
				}
			float cociente=result/(cantidad-1);
			
			return (float)Math.round( (float)Math.sqrt(cociente) *100)/100;
		}
		
		//Imprime media y desviacion tipica
		public void imprimirResumen(){
			System.out.println("La media de la clase es: " +calcularMedia());
			
			System.out.println("La desviación típica es: " +calculardesviacionTipica());
		}
		
		//Modifica la nota de un alumno
		public boolean modificarNota(int id_alumno,int examen,int nueva_nota){
			if( id_alumno>=0 && id_alumno<10 && examen>=0 && examen<5){
				examen_alumno[id_alumno][examen].setNota(nueva_nota);
				
				return true;
			}else
				return false;
		}
		
		//Imprime Datos Examenes y Alumnos
		public void imprimirDatos(){
			System.out.println();
			for(int i=0;i<examen_alumno.length;i++){
				System.out.println("ALUMNO " +i);
				for(int j=0;j<examen_alumno[i].length;j++){
					System.out.println(" Nota examen " +j +": " +examen_alumno[i][j].getNota() );
				}
				System.out.println();
			}
			
		}
		//Calcula la media de un alumno
		public float calcularMediaAlumno(int alumno){
			int suma=0;
			
			if(alumno>=0 && alumno<10){
				for(int j=0;j<examen_alumno[alumno].length;j++)
					suma+=examen_alumno[alumno][j].getNota();
			
				return suma/(float)examen_alumno[alumno].length;
			}else
				return 0;
					
		}

		
}
