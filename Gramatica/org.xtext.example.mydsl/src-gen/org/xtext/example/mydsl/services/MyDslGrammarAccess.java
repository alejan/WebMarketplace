/*
* generated by Xtext
*/
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MarketPlaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MarketPlace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMarketPlaceAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cLESSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cQUESTIONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cXmlKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cVersionKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cEQUALSTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cEncodingKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cEQUALSTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Keyword cASCIIKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final RuleCall cQUESTIONTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		private final RuleCall cGREATERTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cLESSTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cTMARKETPLACETerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final Keyword cXmiVersionKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final RuleCall cEQUALSTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		private final Keyword cQuotationMarkDigitTwoFullStopDigitZeroQuotationMarkKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Keyword cXmlnsXmiKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final RuleCall cEQUALSTerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		private final RuleCall cTXMITerminalRuleCall_19 = (RuleCall)cGroup.eContents().get(19);
		private final Keyword cXmlnsXsiKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final RuleCall cEQUALSTerminalRuleCall_21 = (RuleCall)cGroup.eContents().get(21);
		private final RuleCall cTXSITerminalRuleCall_22 = (RuleCall)cGroup.eContents().get(22);
		private final Keyword cXmlnsProyectosKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final RuleCall cEQUALSTerminalRuleCall_24 = (RuleCall)cGroup.eContents().get(24);
		private final RuleCall cTPROYECTOSTerminalRuleCall_25 = (RuleCall)cGroup.eContents().get(25);
		private final Keyword cXsiSchemaLocationKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final RuleCall cEQUALSTerminalRuleCall_27 = (RuleCall)cGroup.eContents().get(27);
		private final RuleCall cSCHEMALOCATIONTerminalRuleCall_28 = (RuleCall)cGroup.eContents().get(28);
		private final Keyword cNombreKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final RuleCall cEQUALSTerminalRuleCall_30 = (RuleCall)cGroup.eContents().get(30);
		private final Assignment cNombreAssignment_31 = (Assignment)cGroup.eContents().get(31);
		private final RuleCall cNombreEStringParserRuleCall_31_0 = (RuleCall)cNombreAssignment_31.eContents().get(0);
		private final Keyword cPresentacionKeyword_32 = (Keyword)cGroup.eContents().get(32);
		private final RuleCall cEQUALSTerminalRuleCall_33 = (RuleCall)cGroup.eContents().get(33);
		private final Assignment cPresentacionAssignment_34 = (Assignment)cGroup.eContents().get(34);
		private final RuleCall cPresentacionTipoPresentacionEnumRuleCall_34_0 = (RuleCall)cPresentacionAssignment_34.eContents().get(0);
		private final RuleCall cGREATERTerminalRuleCall_35 = (RuleCall)cGroup.eContents().get(35);
		private final Assignment cPaginasAssignment_36 = (Assignment)cGroup.eContents().get(36);
		private final RuleCall cPaginasPaginaParserRuleCall_36_0 = (RuleCall)cPaginasAssignment_36.eContents().get(0);
		private final RuleCall cLESSTerminalRuleCall_37 = (RuleCall)cGroup.eContents().get(37);
		private final RuleCall cSLASHTerminalRuleCall_38 = (RuleCall)cGroup.eContents().get(38);
		private final RuleCall cTMARKETPLACETerminalRuleCall_39 = (RuleCall)cGroup.eContents().get(39);
		private final RuleCall cGREATERTerminalRuleCall_40 = (RuleCall)cGroup.eContents().get(40);
		
		//MarketPlace:
		//	{MarketPlace} LESS QUESTION "xml" "version" EQUALS "\"1.0\"" "encoding" EQUALS "\"ASCII\"" QUESTION GREATER LESS
		//	TMARKETPLACE "xmi:version" EQUALS "\"2.0\"" "xmlns:xmi" EQUALS TXMI "xmlns:xsi" EQUALS TXSI "xmlns:proyectos" EQUALS
		//	TPROYECTOS "xsi:schemaLocation" EQUALS SCHEMALOCATION "nombre" EQUALS nombre=EString "presentacion" EQUALS
		//	presentacion=TipoPresentacion GREATER paginas+=Pagina* LESS SLASH TMARKETPLACE GREATER;
		public ParserRule getRule() { return rule; }

		//{MarketPlace} LESS QUESTION "xml" "version" EQUALS "\"1.0\"" "encoding" EQUALS "\"ASCII\"" QUESTION GREATER LESS
		//TMARKETPLACE "xmi:version" EQUALS "\"2.0\"" "xmlns:xmi" EQUALS TXMI "xmlns:xsi" EQUALS TXSI "xmlns:proyectos" EQUALS
		//TPROYECTOS "xsi:schemaLocation" EQUALS SCHEMALOCATION "nombre" EQUALS nombre=EString "presentacion" EQUALS
		//presentacion=TipoPresentacion GREATER paginas+=Pagina* LESS SLASH TMARKETPLACE GREATER
		public Group getGroup() { return cGroup; }

		//{MarketPlace}
		public Action getMarketPlaceAction_0() { return cMarketPlaceAction_0; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_1() { return cLESSTerminalRuleCall_1; }

		//QUESTION
		public RuleCall getQUESTIONTerminalRuleCall_2() { return cQUESTIONTerminalRuleCall_2; }

		//"xml"
		public Keyword getXmlKeyword_3() { return cXmlKeyword_3; }

		//"version"
		public Keyword getVersionKeyword_4() { return cVersionKeyword_4; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_5() { return cEQUALSTerminalRuleCall_5; }

		//"\"1.0\""
		public Keyword getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6() { return cQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6; }

		//"encoding"
		public Keyword getEncodingKeyword_7() { return cEncodingKeyword_7; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_8() { return cEQUALSTerminalRuleCall_8; }

		//"\"ASCII\""
		public Keyword getASCIIKeyword_9() { return cASCIIKeyword_9; }

		//QUESTION
		public RuleCall getQUESTIONTerminalRuleCall_10() { return cQUESTIONTerminalRuleCall_10; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_11() { return cGREATERTerminalRuleCall_11; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_12() { return cLESSTerminalRuleCall_12; }

		//TMARKETPLACE
		public RuleCall getTMARKETPLACETerminalRuleCall_13() { return cTMARKETPLACETerminalRuleCall_13; }

		//"xmi:version"
		public Keyword getXmiVersionKeyword_14() { return cXmiVersionKeyword_14; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_15() { return cEQUALSTerminalRuleCall_15; }

		//"\"2.0\""
		public Keyword getQuotationMarkDigitTwoFullStopDigitZeroQuotationMarkKeyword_16() { return cQuotationMarkDigitTwoFullStopDigitZeroQuotationMarkKeyword_16; }

		//"xmlns:xmi"
		public Keyword getXmlnsXmiKeyword_17() { return cXmlnsXmiKeyword_17; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_18() { return cEQUALSTerminalRuleCall_18; }

		//TXMI
		public RuleCall getTXMITerminalRuleCall_19() { return cTXMITerminalRuleCall_19; }

		//"xmlns:xsi"
		public Keyword getXmlnsXsiKeyword_20() { return cXmlnsXsiKeyword_20; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_21() { return cEQUALSTerminalRuleCall_21; }

		//TXSI
		public RuleCall getTXSITerminalRuleCall_22() { return cTXSITerminalRuleCall_22; }

		//"xmlns:proyectos"
		public Keyword getXmlnsProyectosKeyword_23() { return cXmlnsProyectosKeyword_23; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_24() { return cEQUALSTerminalRuleCall_24; }

		//TPROYECTOS
		public RuleCall getTPROYECTOSTerminalRuleCall_25() { return cTPROYECTOSTerminalRuleCall_25; }

		//"xsi:schemaLocation"
		public Keyword getXsiSchemaLocationKeyword_26() { return cXsiSchemaLocationKeyword_26; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_27() { return cEQUALSTerminalRuleCall_27; }

		//SCHEMALOCATION
		public RuleCall getSCHEMALOCATIONTerminalRuleCall_28() { return cSCHEMALOCATIONTerminalRuleCall_28; }

		//"nombre"
		public Keyword getNombreKeyword_29() { return cNombreKeyword_29; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_30() { return cEQUALSTerminalRuleCall_30; }

		//nombre=EString
		public Assignment getNombreAssignment_31() { return cNombreAssignment_31; }

		//EString
		public RuleCall getNombreEStringParserRuleCall_31_0() { return cNombreEStringParserRuleCall_31_0; }

		//"presentacion"
		public Keyword getPresentacionKeyword_32() { return cPresentacionKeyword_32; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_33() { return cEQUALSTerminalRuleCall_33; }

		//presentacion=TipoPresentacion
		public Assignment getPresentacionAssignment_34() { return cPresentacionAssignment_34; }

		//TipoPresentacion
		public RuleCall getPresentacionTipoPresentacionEnumRuleCall_34_0() { return cPresentacionTipoPresentacionEnumRuleCall_34_0; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_35() { return cGREATERTerminalRuleCall_35; }

		//paginas+=Pagina*
		public Assignment getPaginasAssignment_36() { return cPaginasAssignment_36; }

		//Pagina
		public RuleCall getPaginasPaginaParserRuleCall_36_0() { return cPaginasPaginaParserRuleCall_36_0; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_37() { return cLESSTerminalRuleCall_37; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_38() { return cSLASHTerminalRuleCall_38; }

		//TMARKETPLACE
		public RuleCall getTMARKETPLACETerminalRuleCall_39() { return cTMARKETPLACETerminalRuleCall_39; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_40() { return cGREATERTerminalRuleCall_40; }
	}

	public class PaginaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Pagina");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPromocionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMapaParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cContactoParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCatalogoParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Pagina:
		//	Promocion | Mapa | Contacto | Catalogo;
		public ParserRule getRule() { return rule; }

		//Promocion | Mapa | Contacto | Catalogo
		public Alternatives getAlternatives() { return cAlternatives; }

		//Promocion
		public RuleCall getPromocionParserRuleCall_0() { return cPromocionParserRuleCall_0; }

		//Mapa
		public RuleCall getMapaParserRuleCall_1() { return cMapaParserRuleCall_1; }

		//Contacto
		public RuleCall getContactoParserRuleCall_2() { return cContactoParserRuleCall_2; }

		//Catalogo
		public RuleCall getCatalogoParserRuleCall_3() { return cCatalogoParserRuleCall_3; }
	}

	public class PromocionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Promocion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTPAGINASTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cXsiTypeProyectosPromocionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNombreKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cEQUALSTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cNombreAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNombreEStringParserRuleCall_5_0 = (RuleCall)cNombreAssignment_5.eContents().get(0);
		private final Keyword cEstiloKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cEQUALSTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Assignment cEstiloAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cEstiloEstiloEnumRuleCall_8_0 = (RuleCall)cEstiloAssignment_8.eContents().get(0);
		private final RuleCall cSLASHTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final RuleCall cGREATERTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		
		//Promocion:
		//	LESS TPAGINAS "xsi:type=\"proyectos:Promocion\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
		//	GREATER;
		public ParserRule getRule() { return rule; }

		//LESS TPAGINAS "xsi:type=\"proyectos:Promocion\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
		//GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TPAGINAS
		public RuleCall getTPAGINASTerminalRuleCall_1() { return cTPAGINASTerminalRuleCall_1; }

		//"xsi:type=\"proyectos:Promocion\""
		public Keyword getXsiTypeProyectosPromocionKeyword_2() { return cXsiTypeProyectosPromocionKeyword_2; }

		//"nombre"
		public Keyword getNombreKeyword_3() { return cNombreKeyword_3; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_4() { return cEQUALSTerminalRuleCall_4; }

		//nombre=EString
		public Assignment getNombreAssignment_5() { return cNombreAssignment_5; }

		//EString
		public RuleCall getNombreEStringParserRuleCall_5_0() { return cNombreEStringParserRuleCall_5_0; }

		//"estilo"
		public Keyword getEstiloKeyword_6() { return cEstiloKeyword_6; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_7() { return cEQUALSTerminalRuleCall_7; }

		//estilo=Estilo
		public Assignment getEstiloAssignment_8() { return cEstiloAssignment_8; }

		//Estilo
		public RuleCall getEstiloEstiloEnumRuleCall_8_0() { return cEstiloEstiloEnumRuleCall_8_0; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_9() { return cSLASHTerminalRuleCall_9; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_10() { return cGREATERTerminalRuleCall_10; }
	}

	public class MapaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Mapa");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTPAGINASTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cXsiTypeProyectosMapaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNombreKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cEQUALSTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cNombreAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNombreEStringParserRuleCall_5_0 = (RuleCall)cNombreAssignment_5.eContents().get(0);
		private final Keyword cEstiloKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cEQUALSTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Assignment cEstiloAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cEstiloEstiloEnumRuleCall_8_0 = (RuleCall)cEstiloAssignment_8.eContents().get(0);
		private final RuleCall cSLASHTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final RuleCall cGREATERTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		
		//Mapa:
		//	LESS TPAGINAS "xsi:type=\"proyectos:Mapa\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
		//	GREATER;
		public ParserRule getRule() { return rule; }

		//LESS TPAGINAS "xsi:type=\"proyectos:Mapa\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TPAGINAS
		public RuleCall getTPAGINASTerminalRuleCall_1() { return cTPAGINASTerminalRuleCall_1; }

		//"xsi:type=\"proyectos:Mapa\""
		public Keyword getXsiTypeProyectosMapaKeyword_2() { return cXsiTypeProyectosMapaKeyword_2; }

		//"nombre"
		public Keyword getNombreKeyword_3() { return cNombreKeyword_3; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_4() { return cEQUALSTerminalRuleCall_4; }

		//nombre=EString
		public Assignment getNombreAssignment_5() { return cNombreAssignment_5; }

		//EString
		public RuleCall getNombreEStringParserRuleCall_5_0() { return cNombreEStringParserRuleCall_5_0; }

		//"estilo"
		public Keyword getEstiloKeyword_6() { return cEstiloKeyword_6; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_7() { return cEQUALSTerminalRuleCall_7; }

		//estilo=Estilo
		public Assignment getEstiloAssignment_8() { return cEstiloAssignment_8; }

		//Estilo
		public RuleCall getEstiloEstiloEnumRuleCall_8_0() { return cEstiloEstiloEnumRuleCall_8_0; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_9() { return cSLASHTerminalRuleCall_9; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_10() { return cGREATERTerminalRuleCall_10; }
	}

	public class ContactoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Contacto");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTPAGINASTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cXsiTypeProyectosContactoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNombreKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cEQUALSTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cNombreAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNombreEStringParserRuleCall_5_0 = (RuleCall)cNombreAssignment_5.eContents().get(0);
		private final Keyword cEstiloKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cEQUALSTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Assignment cEstiloAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cEstiloEstiloEnumRuleCall_8_0 = (RuleCall)cEstiloAssignment_8.eContents().get(0);
		private final RuleCall cSLASHTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final RuleCall cGREATERTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		
		//Contacto:
		//	LESS TPAGINAS "xsi:type=\"proyectos:Contacto\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
		//	GREATER;
		public ParserRule getRule() { return rule; }

		//LESS TPAGINAS "xsi:type=\"proyectos:Contacto\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
		//GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TPAGINAS
		public RuleCall getTPAGINASTerminalRuleCall_1() { return cTPAGINASTerminalRuleCall_1; }

		//"xsi:type=\"proyectos:Contacto\""
		public Keyword getXsiTypeProyectosContactoKeyword_2() { return cXsiTypeProyectosContactoKeyword_2; }

		//"nombre"
		public Keyword getNombreKeyword_3() { return cNombreKeyword_3; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_4() { return cEQUALSTerminalRuleCall_4; }

		//nombre=EString
		public Assignment getNombreAssignment_5() { return cNombreAssignment_5; }

		//EString
		public RuleCall getNombreEStringParserRuleCall_5_0() { return cNombreEStringParserRuleCall_5_0; }

		//"estilo"
		public Keyword getEstiloKeyword_6() { return cEstiloKeyword_6; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_7() { return cEQUALSTerminalRuleCall_7; }

		//estilo=Estilo
		public Assignment getEstiloAssignment_8() { return cEstiloAssignment_8; }

		//Estilo
		public RuleCall getEstiloEstiloEnumRuleCall_8_0() { return cEstiloEstiloEnumRuleCall_8_0; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_9() { return cSLASHTerminalRuleCall_9; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_10() { return cGREATERTerminalRuleCall_10; }
	}

	public class CatalogoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Catalogo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTPAGINASTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cXsiTypeProyectosCatalogoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNombreKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cEQUALSTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cNombreAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNombreEStringParserRuleCall_5_0 = (RuleCall)cNombreAssignment_5.eContents().get(0);
		private final Keyword cEstiloKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cEQUALSTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Assignment cEstiloAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cEstiloEstiloEnumRuleCall_8_0 = (RuleCall)cEstiloAssignment_8.eContents().get(0);
		private final RuleCall cSLASHTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final RuleCall cGREATERTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		
		//Catalogo:
		//	LESS TPAGINAS "xsi:type=\"proyectos:Catalogo\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
		//	GREATER;
		public ParserRule getRule() { return rule; }

		//LESS TPAGINAS "xsi:type=\"proyectos:Catalogo\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
		//GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TPAGINAS
		public RuleCall getTPAGINASTerminalRuleCall_1() { return cTPAGINASTerminalRuleCall_1; }

		//"xsi:type=\"proyectos:Catalogo\""
		public Keyword getXsiTypeProyectosCatalogoKeyword_2() { return cXsiTypeProyectosCatalogoKeyword_2; }

		//"nombre"
		public Keyword getNombreKeyword_3() { return cNombreKeyword_3; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_4() { return cEQUALSTerminalRuleCall_4; }

		//nombre=EString
		public Assignment getNombreAssignment_5() { return cNombreAssignment_5; }

		//EString
		public RuleCall getNombreEStringParserRuleCall_5_0() { return cNombreEStringParserRuleCall_5_0; }

		//"estilo"
		public Keyword getEstiloKeyword_6() { return cEstiloKeyword_6; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_7() { return cEQUALSTerminalRuleCall_7; }

		//estilo=Estilo
		public Assignment getEstiloAssignment_8() { return cEstiloAssignment_8; }

		//Estilo
		public RuleCall getEstiloEstiloEnumRuleCall_8_0() { return cEstiloEstiloEnumRuleCall_8_0; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_9() { return cSLASHTerminalRuleCall_9; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_10() { return cGREATERTerminalRuleCall_10; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	public class EstiloElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Estilo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEmpresarialEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEmpresarialEmpresarialKeyword_0_0 = (Keyword)cEmpresarialEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cClasicoEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cClasicoClasicoKeyword_1_0 = (Keyword)cClasicoEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cModernoEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cModernoModernoKeyword_2_0 = (Keyword)cModernoEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cProfesionalEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cProfesionalProfesionalKeyword_3_0 = (Keyword)cProfesionalEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Estilo:
		//	empresarial="\"empresarial\"" | clasico="\"clasico\"" | moderno="\"moderno\"" | profesional="\"profesional\"";
		public EnumRule getRule() { return rule; }

		//empresarial="\"empresarial\"" | clasico="\"clasico\"" | moderno="\"moderno\"" | profesional="\"profesional\""
		public Alternatives getAlternatives() { return cAlternatives; }

		//empresarial="\"empresarial\""
		public EnumLiteralDeclaration getEmpresarialEnumLiteralDeclaration_0() { return cEmpresarialEnumLiteralDeclaration_0; }

		//"\"empresarial\""
		public Keyword getEmpresarialEmpresarialKeyword_0_0() { return cEmpresarialEmpresarialKeyword_0_0; }

		//clasico="\"clasico\""
		public EnumLiteralDeclaration getClasicoEnumLiteralDeclaration_1() { return cClasicoEnumLiteralDeclaration_1; }

		//"\"clasico\""
		public Keyword getClasicoClasicoKeyword_1_0() { return cClasicoClasicoKeyword_1_0; }

		//moderno="\"moderno\""
		public EnumLiteralDeclaration getModernoEnumLiteralDeclaration_2() { return cModernoEnumLiteralDeclaration_2; }

		//"\"moderno\""
		public Keyword getModernoModernoKeyword_2_0() { return cModernoModernoKeyword_2_0; }

		//profesional="\"profesional\""
		public EnumLiteralDeclaration getProfesionalEnumLiteralDeclaration_3() { return cProfesionalEnumLiteralDeclaration_3; }

		//"\"profesional\""
		public Keyword getProfesionalProfesionalKeyword_3_0() { return cProfesionalProfesionalKeyword_3_0; }
	}

	public class TipoPresentacionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "TipoPresentacion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBasicoEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBasicoBasicoKeyword_0_0 = (Keyword)cBasicoEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPremiumEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPremiumPremiumKeyword_1_0 = (Keyword)cPremiumEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGoldEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGoldGoldKeyword_2_0 = (Keyword)cGoldEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum TipoPresentacion:
		//	basico="\"basico\"" | premium="\"premium\"" | gold="\"gold\"";
		public EnumRule getRule() { return rule; }

		//basico="\"basico\"" | premium="\"premium\"" | gold="\"gold\""
		public Alternatives getAlternatives() { return cAlternatives; }

		//basico="\"basico\""
		public EnumLiteralDeclaration getBasicoEnumLiteralDeclaration_0() { return cBasicoEnumLiteralDeclaration_0; }

		//"\"basico\""
		public Keyword getBasicoBasicoKeyword_0_0() { return cBasicoBasicoKeyword_0_0; }

		//premium="\"premium\""
		public EnumLiteralDeclaration getPremiumEnumLiteralDeclaration_1() { return cPremiumEnumLiteralDeclaration_1; }

		//"\"premium\""
		public Keyword getPremiumPremiumKeyword_1_0() { return cPremiumPremiumKeyword_1_0; }

		//gold="\"gold\""
		public EnumLiteralDeclaration getGoldEnumLiteralDeclaration_2() { return cGoldEnumLiteralDeclaration_2; }

		//"\"gold\""
		public Keyword getGoldGoldKeyword_2_0() { return cGoldGoldKeyword_2_0; }
	}
	
	private final MarketPlaceElements pMarketPlace;
	private final PaginaElements pPagina;
	private final PromocionElements pPromocion;
	private final MapaElements pMapa;
	private final ContactoElements pContacto;
	private final CatalogoElements pCatalogo;
	private final EStringElements pEString;
	private final EstiloElements unknownRuleEstilo;
	private final TipoPresentacionElements unknownRuleTipoPresentacion;
	private final TerminalRule tGREATER;
	private final TerminalRule tLESS;
	private final TerminalRule tSLASH;
	private final TerminalRule tTMARKETPLACE;
	private final TerminalRule tTXMI;
	private final TerminalRule tTXSI;
	private final TerminalRule tTPROYECTOS;
	private final TerminalRule tSCHEMALOCATION;
	private final TerminalRule tTPAGINAS;
	private final TerminalRule tTPROMOCION;
	private final TerminalRule tTMAPA;
	private final TerminalRule tTTIPO;
	private final TerminalRule tEQUALS;
	private final TerminalRule tQUESTION;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMarketPlace = new MarketPlaceElements();
		this.pPagina = new PaginaElements();
		this.pPromocion = new PromocionElements();
		this.pMapa = new MapaElements();
		this.pContacto = new ContactoElements();
		this.pCatalogo = new CatalogoElements();
		this.pEString = new EStringElements();
		this.unknownRuleEstilo = new EstiloElements();
		this.unknownRuleTipoPresentacion = new TipoPresentacionElements();
		this.tGREATER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "GREATER");
		this.tLESS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LESS");
		this.tSLASH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SLASH");
		this.tTMARKETPLACE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TMARKETPLACE");
		this.tTXMI = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TXMI");
		this.tTXSI = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TXSI");
		this.tTPROYECTOS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TPROYECTOS");
		this.tSCHEMALOCATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SCHEMALOCATION");
		this.tTPAGINAS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TPAGINAS");
		this.tTPROMOCION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TPROMOCION");
		this.tTMAPA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TMAPA");
		this.tTTIPO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TTIPO");
		this.tEQUALS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EQUALS");
		this.tQUESTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "QUESTION");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MarketPlace:
	//	{MarketPlace} LESS QUESTION "xml" "version" EQUALS "\"1.0\"" "encoding" EQUALS "\"ASCII\"" QUESTION GREATER LESS
	//	TMARKETPLACE "xmi:version" EQUALS "\"2.0\"" "xmlns:xmi" EQUALS TXMI "xmlns:xsi" EQUALS TXSI "xmlns:proyectos" EQUALS
	//	TPROYECTOS "xsi:schemaLocation" EQUALS SCHEMALOCATION "nombre" EQUALS nombre=EString "presentacion" EQUALS
	//	presentacion=TipoPresentacion GREATER paginas+=Pagina* LESS SLASH TMARKETPLACE GREATER;
	public MarketPlaceElements getMarketPlaceAccess() {
		return pMarketPlace;
	}
	
	public ParserRule getMarketPlaceRule() {
		return getMarketPlaceAccess().getRule();
	}

	//Pagina:
	//	Promocion | Mapa | Contacto | Catalogo;
	public PaginaElements getPaginaAccess() {
		return pPagina;
	}
	
	public ParserRule getPaginaRule() {
		return getPaginaAccess().getRule();
	}

	//Promocion:
	//	LESS TPAGINAS "xsi:type=\"proyectos:Promocion\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
	//	GREATER;
	public PromocionElements getPromocionAccess() {
		return pPromocion;
	}
	
	public ParserRule getPromocionRule() {
		return getPromocionAccess().getRule();
	}

	//Mapa:
	//	LESS TPAGINAS "xsi:type=\"proyectos:Mapa\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
	//	GREATER;
	public MapaElements getMapaAccess() {
		return pMapa;
	}
	
	public ParserRule getMapaRule() {
		return getMapaAccess().getRule();
	}

	//Contacto:
	//	LESS TPAGINAS "xsi:type=\"proyectos:Contacto\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
	//	GREATER;
	public ContactoElements getContactoAccess() {
		return pContacto;
	}
	
	public ParserRule getContactoRule() {
		return getContactoAccess().getRule();
	}

	//Catalogo:
	//	LESS TPAGINAS "xsi:type=\"proyectos:Catalogo\"" "nombre" EQUALS nombre=EString "estilo" EQUALS estilo=Estilo SLASH
	//	GREATER;
	public CatalogoElements getCatalogoAccess() {
		return pCatalogo;
	}
	
	public ParserRule getCatalogoRule() {
		return getCatalogoAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//enum Estilo:
	//	empresarial="\"empresarial\"" | clasico="\"clasico\"" | moderno="\"moderno\"" | profesional="\"profesional\"";
	public EstiloElements getEstiloAccess() {
		return unknownRuleEstilo;
	}
	
	public EnumRule getEstiloRule() {
		return getEstiloAccess().getRule();
	}

	//enum TipoPresentacion:
	//	basico="\"basico\"" | premium="\"premium\"" | gold="\"gold\"";
	public TipoPresentacionElements getTipoPresentacionAccess() {
		return unknownRuleTipoPresentacion;
	}
	
	public EnumRule getTipoPresentacionRule() {
		return getTipoPresentacionAccess().getRule();
	}

	//terminal GREATER:
	//	">";
	public TerminalRule getGREATERRule() {
		return tGREATER;
	} 

	//terminal LESS:
	//	"<";
	public TerminalRule getLESSRule() {
		return tLESS;
	} 

	//terminal SLASH:
	//	"/";
	public TerminalRule getSLASHRule() {
		return tSLASH;
	} 

	//terminal TMARKETPLACE:
	//	"proyectos:MarketPlace";
	public TerminalRule getTMARKETPLACERule() {
		return tTMARKETPLACE;
	} 

	//terminal TXMI:
	//	"\"http://www.omg.org/XMI\"";
	public TerminalRule getTXMIRule() {
		return tTXMI;
	} 

	//terminal TXSI:
	//	"\"http://www.w3.org/2001/XMLSchema-instance\"";
	public TerminalRule getTXSIRule() {
		return tTXSI;
	} 

	//terminal TPROYECTOS:
	//	"\"http://www.example.org/proyectos\"";
	public TerminalRule getTPROYECTOSRule() {
		return tTPROYECTOS;
	} 

	//terminal SCHEMALOCATION:
	//	"\"http://www.example.org/proyectos proyectos.ecore\"";
	public TerminalRule getSCHEMALOCATIONRule() {
		return tSCHEMALOCATION;
	} 

	//terminal TPAGINAS:
	//	"paginas";
	public TerminalRule getTPAGINASRule() {
		return tTPAGINAS;
	} 

	//terminal TPROMOCION:
	//	"proyectos:Promocion";
	public TerminalRule getTPROMOCIONRule() {
		return tTPROMOCION;
	} 

	//terminal TMAPA:
	//	"proyectos:Mapa";
	public TerminalRule getTMAPARule() {
		return tTMAPA;
	} 

	//terminal TTIPO:
	//	"xsi:type";
	public TerminalRule getTTIPORule() {
		return tTTIPO;
	} 

	//terminal EQUALS:
	//	"=";
	public TerminalRule getEQUALSRule() {
		return tEQUALS;
	} 

	//terminal QUESTION:
	//	"?";
	public TerminalRule getQUESTIONRule() {
		return tQUESTION;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
