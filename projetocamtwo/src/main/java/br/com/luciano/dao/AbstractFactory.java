package br.com.luciano.dao;

public class AbstractFactory {

		private static DaoFactory factory;
		
	/*	static{
					
			factory = TipoPersistencia
					.valueOf(System.getProperty("tipoPersistencia"))
					.createFactory();
			
		}
		*/
		/**
		 * Retorna a fabrica criada.
		 * @return DaoFactory
		 */
		public static DaoFactory get(){
			return factory;
		}
		
}
