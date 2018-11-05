package uniandes.mdd.aplicacion.blockchain.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uniandes.mdd.aplicacion.blockchain.services.BlockchainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlockchainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aplicacion'", "'{'", "'tipodato'", "'}'", "'SmartContract'", "'Entidad'", "'Operacion'", "'isUd='", "'('", "','", "')'", "':'", "'return'", "'Estado'", "'true'", "'false'", "'ExpLog'", "'ExpArit'", "'var'", "'if'", "'else'", "'ExpNum'", "'ExpTex'", "'ExpBool'", "'ExpRef'", "'ExpRel'", "'-'", "'.'", "'E'", "'e'", "'Map'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", "'+'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'String'", "'uint'", "'Boolean'", "'address'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBlockchainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlockchainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlockchainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlockchain.g"; }



     	private BlockchainGrammarAccess grammarAccess;

        public InternalBlockchainParser(TokenStream input, BlockchainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Aplicacion";
       	}

       	@Override
       	protected BlockchainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAplicacion"
    // InternalBlockchain.g:65:1: entryRuleAplicacion returns [EObject current=null] : iv_ruleAplicacion= ruleAplicacion EOF ;
    public final EObject entryRuleAplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAplicacion = null;


        try {
            // InternalBlockchain.g:65:51: (iv_ruleAplicacion= ruleAplicacion EOF )
            // InternalBlockchain.g:66:2: iv_ruleAplicacion= ruleAplicacion EOF
            {
             newCompositeNode(grammarAccess.getAplicacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAplicacion=ruleAplicacion();

            state._fsp--;

             current =iv_ruleAplicacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAplicacion"


    // $ANTLR start "ruleAplicacion"
    // InternalBlockchain.g:72:1: ruleAplicacion returns [EObject current=null] : ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleAplicacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_smartcontract_4_0 = null;

        EObject lv_smartcontract_5_0 = null;

        EObject lv_tipodato_7_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:78:2: ( ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' ) )
            // InternalBlockchain.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' )
            {
            // InternalBlockchain.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' )
            // InternalBlockchain.g:80:3: () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}'
            {
            // InternalBlockchain.g:80:3: ()
            // InternalBlockchain.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAplicacionAccess().getAplicacionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAplicacionAccess().getAplicacionKeyword_1());
            		
            // InternalBlockchain.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:92:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAplicacionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBlockchain.g:114:3: ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )*
                    {
                    // InternalBlockchain.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) )
                    // InternalBlockchain.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    {
                    // InternalBlockchain.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    // InternalBlockchain.g:117:6: lv_smartcontract_4_0= ruleSmartContract
                    {

                    						newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_smartcontract_4_0=ruleSmartContract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
                    						}
                    						add(
                    							current,
                    							"smartcontract",
                    							lv_smartcontract_4_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.SmartContract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:134:4: ( (lv_smartcontract_5_0= ruleSmartContract ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBlockchain.g:135:5: (lv_smartcontract_5_0= ruleSmartContract )
                    	    {
                    	    // InternalBlockchain.g:135:5: (lv_smartcontract_5_0= ruleSmartContract )
                    	    // InternalBlockchain.g:136:6: lv_smartcontract_5_0= ruleSmartContract
                    	    {

                    	    						newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_smartcontract_5_0=ruleSmartContract();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"smartcontract",
                    	    							lv_smartcontract_5_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.SmartContract");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBlockchain.g:154:3: (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBlockchain.g:155:4: otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) )
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0());
            	    			
            	    // InternalBlockchain.g:159:4: ( (lv_tipodato_7_0= ruleTipoDato ) )
            	    // InternalBlockchain.g:160:5: (lv_tipodato_7_0= ruleTipoDato )
            	    {
            	    // InternalBlockchain.g:160:5: (lv_tipodato_7_0= ruleTipoDato )
            	    // InternalBlockchain.g:161:6: lv_tipodato_7_0= ruleTipoDato
            	    {

            	    						newCompositeNode(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tipodato_7_0=ruleTipoDato();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tipodato",
            	    							lv_tipodato_7_0,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.TipoDato");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAplicacion"


    // $ANTLR start "entryRuleTipoDato"
    // InternalBlockchain.g:187:1: entryRuleTipoDato returns [EObject current=null] : iv_ruleTipoDato= ruleTipoDato EOF ;
    public final EObject entryRuleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDato = null;


        try {
            // InternalBlockchain.g:187:49: (iv_ruleTipoDato= ruleTipoDato EOF )
            // InternalBlockchain.g:188:2: iv_ruleTipoDato= ruleTipoDato EOF
            {
             newCompositeNode(grammarAccess.getTipoDatoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoDato=ruleTipoDato();

            state._fsp--;

             current =iv_ruleTipoDato; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoDato"


    // $ANTLR start "ruleTipoDato"
    // InternalBlockchain.g:194:1: ruleTipoDato returns [EObject current=null] : (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) ;
    public final EObject ruleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject this_Entidad_0 = null;

        EObject this_Primitivo_1 = null;

        EObject this_Mapa_2 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:200:2: ( (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) )
            // InternalBlockchain.g:201:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            {
            // InternalBlockchain.g:201:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBlockchain.g:202:3: this_Entidad_0= ruleEntidad
                    {

                    			newCompositeNode(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entidad_0=ruleEntidad();

                    state._fsp--;


                    			current = this_Entidad_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:211:3: this_Primitivo_1= rulePrimitivo
                    {

                    			newCompositeNode(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primitivo_1=rulePrimitivo();

                    state._fsp--;


                    			current = this_Primitivo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:220:3: this_Mapa_2= ruleMapa
                    {

                    			newCompositeNode(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapa_2=ruleMapa();

                    state._fsp--;


                    			current = this_Mapa_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "entryRuleLinea"
    // InternalBlockchain.g:232:1: entryRuleLinea returns [EObject current=null] : iv_ruleLinea= ruleLinea EOF ;
    public final EObject entryRuleLinea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinea = null;


        try {
            // InternalBlockchain.g:232:46: (iv_ruleLinea= ruleLinea EOF )
            // InternalBlockchain.g:233:2: iv_ruleLinea= ruleLinea EOF
            {
             newCompositeNode(grammarAccess.getLineaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinea=ruleLinea();

            state._fsp--;

             current =iv_ruleLinea; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinea"


    // $ANTLR start "ruleLinea"
    // InternalBlockchain.g:239:1: ruleLinea returns [EObject current=null] : (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_Variable_2= ruleVariable | this_Condicional_3= ruleCondicional | this_ExpresionNumerica_4= ruleExpresionNumerica | this_ExpresionTexto_5= ruleExpresionTexto | this_ExpresionBoolean_6= ruleExpresionBoolean | this_ExpresionReferenciada_7= ruleExpresionReferenciada | this_ExpresionRelacional_8= ruleExpresionRelacional ) ;
    public final EObject ruleLinea() throws RecognitionException {
        EObject current = null;

        EObject this_ExpresionLogica_0 = null;

        EObject this_ExpresionAritmetica_1 = null;

        EObject this_Variable_2 = null;

        EObject this_Condicional_3 = null;

        EObject this_ExpresionNumerica_4 = null;

        EObject this_ExpresionTexto_5 = null;

        EObject this_ExpresionBoolean_6 = null;

        EObject this_ExpresionReferenciada_7 = null;

        EObject this_ExpresionRelacional_8 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:245:2: ( (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_Variable_2= ruleVariable | this_Condicional_3= ruleCondicional | this_ExpresionNumerica_4= ruleExpresionNumerica | this_ExpresionTexto_5= ruleExpresionTexto | this_ExpresionBoolean_6= ruleExpresionBoolean | this_ExpresionReferenciada_7= ruleExpresionReferenciada | this_ExpresionRelacional_8= ruleExpresionRelacional ) )
            // InternalBlockchain.g:246:2: (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_Variable_2= ruleVariable | this_Condicional_3= ruleCondicional | this_ExpresionNumerica_4= ruleExpresionNumerica | this_ExpresionTexto_5= ruleExpresionTexto | this_ExpresionBoolean_6= ruleExpresionBoolean | this_ExpresionReferenciada_7= ruleExpresionReferenciada | this_ExpresionRelacional_8= ruleExpresionRelacional )
            {
            // InternalBlockchain.g:246:2: (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_Variable_2= ruleVariable | this_Condicional_3= ruleCondicional | this_ExpresionNumerica_4= ruleExpresionNumerica | this_ExpresionTexto_5= ruleExpresionTexto | this_ExpresionBoolean_6= ruleExpresionBoolean | this_ExpresionReferenciada_7= ruleExpresionReferenciada | this_ExpresionRelacional_8= ruleExpresionRelacional )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 32:
                {
                alt5=5;
                }
                break;
            case 33:
                {
                alt5=6;
                }
                break;
            case 34:
                {
                alt5=7;
                }
                break;
            case 35:
                {
                alt5=8;
                }
                break;
            case 36:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBlockchain.g:247:3: this_ExpresionLogica_0= ruleExpresionLogica
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionLogicaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionLogica_0=ruleExpresionLogica();

                    state._fsp--;


                    			current = this_ExpresionLogica_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:256:3: this_ExpresionAritmetica_1= ruleExpresionAritmetica
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionAritmeticaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionAritmetica_1=ruleExpresionAritmetica();

                    state._fsp--;


                    			current = this_ExpresionAritmetica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:265:3: this_Variable_2= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:274:3: this_Condicional_3= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_3=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:283:3: this_ExpresionNumerica_4= ruleExpresionNumerica
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionNumericaParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionNumerica_4=ruleExpresionNumerica();

                    state._fsp--;


                    			current = this_ExpresionNumerica_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:292:3: this_ExpresionTexto_5= ruleExpresionTexto
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionTextoParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionTexto_5=ruleExpresionTexto();

                    state._fsp--;


                    			current = this_ExpresionTexto_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:301:3: this_ExpresionBoolean_6= ruleExpresionBoolean
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionBooleanParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionBoolean_6=ruleExpresionBoolean();

                    state._fsp--;


                    			current = this_ExpresionBoolean_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:310:3: this_ExpresionReferenciada_7= ruleExpresionReferenciada
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionReferenciadaParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionReferenciada_7=ruleExpresionReferenciada();

                    state._fsp--;


                    			current = this_ExpresionReferenciada_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBlockchain.g:319:3: this_ExpresionRelacional_8= ruleExpresionRelacional
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionRelacionalParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionRelacional_8=ruleExpresionRelacional();

                    state._fsp--;


                    			current = this_ExpresionRelacional_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinea"


    // $ANTLR start "entryRuleExpresion"
    // InternalBlockchain.g:331:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalBlockchain.g:331:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalBlockchain.g:332:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalBlockchain.g:338:1: ruleExpresion returns [EObject current=null] : (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumerica_2= ruleExpresionNumerica | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject this_ExpresionLogica_0 = null;

        EObject this_ExpresionAritmetica_1 = null;

        EObject this_ExpresionNumerica_2 = null;

        EObject this_ExpresionTexto_3 = null;

        EObject this_ExpresionBoolean_4 = null;

        EObject this_ExpresionReferenciada_5 = null;

        EObject this_ExpresionRelacional_6 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:344:2: ( (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumerica_2= ruleExpresionNumerica | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional ) )
            // InternalBlockchain.g:345:2: (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumerica_2= ruleExpresionNumerica | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional )
            {
            // InternalBlockchain.g:345:2: (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumerica_2= ruleExpresionNumerica | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            case 34:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            case 36:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBlockchain.g:346:3: this_ExpresionLogica_0= ruleExpresionLogica
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionLogica_0=ruleExpresionLogica();

                    state._fsp--;


                    			current = this_ExpresionLogica_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:355:3: this_ExpresionAritmetica_1= ruleExpresionAritmetica
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionAritmetica_1=ruleExpresionAritmetica();

                    state._fsp--;


                    			current = this_ExpresionAritmetica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:364:3: this_ExpresionNumerica_2= ruleExpresionNumerica
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionNumericaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionNumerica_2=ruleExpresionNumerica();

                    state._fsp--;


                    			current = this_ExpresionNumerica_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:373:3: this_ExpresionTexto_3= ruleExpresionTexto
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionTexto_3=ruleExpresionTexto();

                    state._fsp--;


                    			current = this_ExpresionTexto_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:382:3: this_ExpresionBoolean_4= ruleExpresionBoolean
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionBoolean_4=ruleExpresionBoolean();

                    state._fsp--;


                    			current = this_ExpresionBoolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:391:3: this_ExpresionReferenciada_5= ruleExpresionReferenciada
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionReferenciada_5=ruleExpresionReferenciada();

                    state._fsp--;


                    			current = this_ExpresionReferenciada_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:400:3: this_ExpresionRelacional_6= ruleExpresionRelacional
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionRelacional_6=ruleExpresionRelacional();

                    state._fsp--;


                    			current = this_ExpresionRelacional_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleSmartContract"
    // InternalBlockchain.g:412:1: entryRuleSmartContract returns [EObject current=null] : iv_ruleSmartContract= ruleSmartContract EOF ;
    public final EObject entryRuleSmartContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartContract = null;


        try {
            // InternalBlockchain.g:412:54: (iv_ruleSmartContract= ruleSmartContract EOF )
            // InternalBlockchain.g:413:2: iv_ruleSmartContract= ruleSmartContract EOF
            {
             newCompositeNode(grammarAccess.getSmartContractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartContract=ruleSmartContract();

            state._fsp--;

             current =iv_ruleSmartContract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartContract"


    // $ANTLR start "ruleSmartContract"
    // InternalBlockchain.g:419:1: ruleSmartContract returns [EObject current=null] : (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleSmartContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_entidades_3_0 = null;

        EObject lv_entidades_4_0 = null;

        EObject lv_estado_5_0 = null;

        EObject lv_estado_6_0 = null;

        EObject lv_operaciones_7_0 = null;

        EObject lv_operaciones_8_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:425:2: ( (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' ) )
            // InternalBlockchain.g:426:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' )
            {
            // InternalBlockchain.g:426:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' )
            // InternalBlockchain.g:427:3: otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSmartContractAccess().getSmartContractKeyword_0());
            		
            // InternalBlockchain.g:431:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:432:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:432:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:433:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmartContractRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlockchain.g:454:3: ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:455:4: ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )*
                    {
                    // InternalBlockchain.g:455:4: ( (lv_entidades_3_0= ruleEntidad ) )
                    // InternalBlockchain.g:456:5: (lv_entidades_3_0= ruleEntidad )
                    {
                    // InternalBlockchain.g:456:5: (lv_entidades_3_0= ruleEntidad )
                    // InternalBlockchain.g:457:6: lv_entidades_3_0= ruleEntidad
                    {

                    						newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_entidades_3_0=ruleEntidad();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    						}
                    						add(
                    							current,
                    							"entidades",
                    							lv_entidades_3_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Entidad");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:474:4: ( (lv_entidades_4_0= ruleEntidad ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBlockchain.g:475:5: (lv_entidades_4_0= ruleEntidad )
                    	    {
                    	    // InternalBlockchain.g:475:5: (lv_entidades_4_0= ruleEntidad )
                    	    // InternalBlockchain.g:476:6: lv_entidades_4_0= ruleEntidad
                    	    {

                    	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_entidades_4_0=ruleEntidad();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entidades",
                    	    							lv_entidades_4_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Entidad");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBlockchain.g:494:3: ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:495:4: ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )*
                    {
                    // InternalBlockchain.g:495:4: ( (lv_estado_5_0= ruleEstado ) )
                    // InternalBlockchain.g:496:5: (lv_estado_5_0= ruleEstado )
                    {
                    // InternalBlockchain.g:496:5: (lv_estado_5_0= ruleEstado )
                    // InternalBlockchain.g:497:6: lv_estado_5_0= ruleEstado
                    {

                    						newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_estado_5_0=ruleEstado();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    						}
                    						add(
                    							current,
                    							"estado",
                    							lv_estado_5_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Estado");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:514:4: ( (lv_estado_6_0= ruleEstado ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBlockchain.g:515:5: (lv_estado_6_0= ruleEstado )
                    	    {
                    	    // InternalBlockchain.g:515:5: (lv_estado_6_0= ruleEstado )
                    	    // InternalBlockchain.g:516:6: lv_estado_6_0= ruleEstado
                    	    {

                    	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_estado_6_0=ruleEstado();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"estado",
                    	    							lv_estado_6_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Estado");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBlockchain.g:534:3: ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBlockchain.g:535:4: ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )*
                    {
                    // InternalBlockchain.g:535:4: ( (lv_operaciones_7_0= ruleOperacion ) )
                    // InternalBlockchain.g:536:5: (lv_operaciones_7_0= ruleOperacion )
                    {
                    // InternalBlockchain.g:536:5: (lv_operaciones_7_0= ruleOperacion )
                    // InternalBlockchain.g:537:6: lv_operaciones_7_0= ruleOperacion
                    {

                    						newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operaciones_7_0=ruleOperacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    						}
                    						add(
                    							current,
                    							"operaciones",
                    							lv_operaciones_7_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Operacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:554:4: ( (lv_operaciones_8_0= ruleOperacion ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBlockchain.g:555:5: (lv_operaciones_8_0= ruleOperacion )
                    	    {
                    	    // InternalBlockchain.g:555:5: (lv_operaciones_8_0= ruleOperacion )
                    	    // InternalBlockchain.g:556:6: lv_operaciones_8_0= ruleOperacion
                    	    {

                    	    						newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_operaciones_8_0=ruleOperacion();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"operaciones",
                    	    							lv_operaciones_8_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Operacion");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartContract"


    // $ANTLR start "entryRuleEString"
    // InternalBlockchain.g:582:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBlockchain.g:582:47: (iv_ruleEString= ruleEString EOF )
            // InternalBlockchain.g:583:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBlockchain.g:589:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBlockchain.g:595:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBlockchain.g:596:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBlockchain.g:596:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlockchain.g:597:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:605:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalBlockchain.g:616:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalBlockchain.g:616:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalBlockchain.g:617:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalBlockchain.g:623:1: ruleEntidad returns [EObject current=null] : ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_atributos_4_0 = null;

        EObject lv_atributos_5_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:629:2: ( ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' ) )
            // InternalBlockchain.g:630:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' )
            {
            // InternalBlockchain.g:630:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' )
            // InternalBlockchain.g:631:3: () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}'
            {
            // InternalBlockchain.g:631:3: ()
            // InternalBlockchain.g:632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadAccess().getEntidadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadAccess().getEntidadKeyword_1());
            		
            // InternalBlockchain.g:642:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:643:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:643:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:644:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBlockchain.g:665:3: ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlockchain.g:666:4: ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )*
                    {
                    // InternalBlockchain.g:666:4: ( (lv_atributos_4_0= ruleAtributo ) )
                    // InternalBlockchain.g:667:5: (lv_atributos_4_0= ruleAtributo )
                    {
                    // InternalBlockchain.g:667:5: (lv_atributos_4_0= ruleAtributo )
                    // InternalBlockchain.g:668:6: lv_atributos_4_0= ruleAtributo
                    {

                    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_atributos_4_0=ruleAtributo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntidadRule());
                    						}
                    						add(
                    							current,
                    							"atributos",
                    							lv_atributos_4_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Atributo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:685:4: ( (lv_atributos_5_0= ruleAtributo ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBlockchain.g:686:5: (lv_atributos_5_0= ruleAtributo )
                    	    {
                    	    // InternalBlockchain.g:686:5: (lv_atributos_5_0= ruleAtributo )
                    	    // InternalBlockchain.g:687:6: lv_atributos_5_0= ruleAtributo
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_atributos_5_0=ruleAtributo();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntidadRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"atributos",
                    	    							lv_atributos_5_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Atributo");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleOperacion"
    // InternalBlockchain.g:713:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalBlockchain.g:713:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalBlockchain.g:714:2: iv_ruleOperacion= ruleOperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacion=ruleOperacion();

            state._fsp--;

             current =iv_ruleOperacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalBlockchain.g:720:1: ruleOperacion returns [EObject current=null] : ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( (lv_lineas_14_0= ruleLinea ) )* otherlv_15= '}' ) ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_esUserDefined_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_parametros_6_0 = null;

        EObject lv_parametros_8_0 = null;

        EObject lv_lineas_14_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:726:2: ( ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( (lv_lineas_14_0= ruleLinea ) )* otherlv_15= '}' ) )
            // InternalBlockchain.g:727:2: ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( (lv_lineas_14_0= ruleLinea ) )* otherlv_15= '}' )
            {
            // InternalBlockchain.g:727:2: ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( (lv_lineas_14_0= ruleLinea ) )* otherlv_15= '}' )
            // InternalBlockchain.g:728:3: () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( (lv_lineas_14_0= ruleLinea ) )* otherlv_15= '}'
            {
            // InternalBlockchain.g:728:3: ()
            // InternalBlockchain.g:729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperacionAccess().getOperacionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOperacionAccess().getOperacionKeyword_1());
            		
            // InternalBlockchain.g:739:3: (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:740:4: otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOperacionAccess().getIsUdKeyword_2_0());
            	    			
            	    // InternalBlockchain.g:744:4: ( (lv_esUserDefined_3_0= ruleEBoolean ) )
            	    // InternalBlockchain.g:745:5: (lv_esUserDefined_3_0= ruleEBoolean )
            	    {
            	    // InternalBlockchain.g:745:5: (lv_esUserDefined_3_0= ruleEBoolean )
            	    // InternalBlockchain.g:746:6: lv_esUserDefined_3_0= ruleEBoolean
            	    {

            	    						newCompositeNode(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_esUserDefined_3_0=ruleEBoolean();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperacionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"esUserDefined",
            	    							true,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.EBoolean");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalBlockchain.g:764:3: ( (lv_name_4_0= ruleEString ) )
            // InternalBlockchain.g:765:4: (lv_name_4_0= ruleEString )
            {
            // InternalBlockchain.g:765:4: (lv_name_4_0= ruleEString )
            // InternalBlockchain.g:766:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBlockchain.g:787:3: ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBlockchain.g:788:4: ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )*
                    {
                    // InternalBlockchain.g:788:4: ( (lv_parametros_6_0= ruleParametro ) )
                    // InternalBlockchain.g:789:5: (lv_parametros_6_0= ruleParametro )
                    {
                    // InternalBlockchain.g:789:5: (lv_parametros_6_0= ruleParametro )
                    // InternalBlockchain.g:790:6: lv_parametros_6_0= ruleParametro
                    {

                    						newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_parametros_6_0=ruleParametro();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    						}
                    						add(
                    							current,
                    							"parametros",
                    							lv_parametros_6_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Parametro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:807:4: (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalBlockchain.g:808:5: otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOperacionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalBlockchain.g:812:5: ( (lv_parametros_8_0= ruleParametro ) )
                    	    // InternalBlockchain.g:813:6: (lv_parametros_8_0= ruleParametro )
                    	    {
                    	    // InternalBlockchain.g:813:6: (lv_parametros_8_0= ruleParametro )
                    	    // InternalBlockchain.g:814:7: lv_parametros_8_0= ruleParametro
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_parametros_8_0=ruleParametro();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperacionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametros",
                    	    								lv_parametros_8_0,
                    	    								"uniandes.mdd.aplicacion.blockchain.Blockchain.Parametro");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getOperacionAccess().getRightParenthesisKeyword_6());
            		
            // InternalBlockchain.g:837:3: (otherlv_10= ':' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:838:4: otherlv_10= ':' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperacionAccess().getColonKeyword_7_0());
                    			
                    // InternalBlockchain.g:842:4: ( ( ruleEString ) )
                    // InternalBlockchain.g:843:5: ( ruleEString )
                    {
                    // InternalBlockchain.g:843:5: ( ruleEString )
                    // InternalBlockchain.g:844:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBlockchain.g:863:3: (otherlv_13= 'return' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBlockchain.g:864:4: otherlv_13= 'return'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getOperacionAccess().getReturnKeyword_9());
                    			

                    }
                    break;

            }

            // InternalBlockchain.g:869:3: ( (lv_lineas_14_0= ruleLinea ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=27 && LA21_0<=30)||(LA21_0>=32 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBlockchain.g:870:4: (lv_lineas_14_0= ruleLinea )
            	    {
            	    // InternalBlockchain.g:870:4: (lv_lineas_14_0= ruleLinea )
            	    // InternalBlockchain.g:871:5: lv_lineas_14_0= ruleLinea
            	    {

            	    					newCompositeNode(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_lineas_14_0=ruleLinea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperacionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lineas",
            	    						lv_lineas_14_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Linea");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleEstado"
    // InternalBlockchain.g:896:1: entryRuleEstado returns [EObject current=null] : iv_ruleEstado= ruleEstado EOF ;
    public final EObject entryRuleEstado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstado = null;


        try {
            // InternalBlockchain.g:896:47: (iv_ruleEstado= ruleEstado EOF )
            // InternalBlockchain.g:897:2: iv_ruleEstado= ruleEstado EOF
            {
             newCompositeNode(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstado=ruleEstado();

            state._fsp--;

             current =iv_ruleEstado; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalBlockchain.g:903:1: ruleEstado returns [EObject current=null] : (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEstado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:909:2: ( (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBlockchain.g:910:2: (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:910:2: (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalBlockchain.g:911:3: otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstadoAccess().getEstadoKeyword_0());
            		
            // InternalBlockchain.g:915:3: ( ( ruleEString ) )
            // InternalBlockchain.g:916:4: ( ruleEString )
            {
            // InternalBlockchain.g:916:4: ( ruleEString )
            // InternalBlockchain.g:917:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstadoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:931:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:932:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:932:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:933:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEstadoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleAtributo"
    // InternalBlockchain.g:954:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalBlockchain.g:954:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalBlockchain.g:955:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalBlockchain.g:961:1: ruleAtributo returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:967:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBlockchain.g:968:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:968:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalBlockchain.g:969:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBlockchain.g:969:3: ( ( ruleEString ) )
            // InternalBlockchain.g:970:4: ( ruleEString )
            {
            // InternalBlockchain.g:970:4: ( ruleEString )
            // InternalBlockchain.g:971:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:985:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:986:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:986:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:987:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleParametro"
    // InternalBlockchain.g:1008:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalBlockchain.g:1008:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalBlockchain.g:1009:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalBlockchain.g:1015:1: ruleParametro returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1021:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBlockchain.g:1022:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:1022:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalBlockchain.g:1023:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBlockchain.g:1023:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1024:4: ( ruleEString )
            {
            // InternalBlockchain.g:1024:4: ( ruleEString )
            // InternalBlockchain.g:1025:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParametroRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1039:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:1040:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:1040:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:1041:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametroRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBlockchain.g:1062:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalBlockchain.g:1062:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalBlockchain.g:1063:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBlockchain.g:1069:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1075:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalBlockchain.g:1076:2: (kw= 'true' | kw= 'false' )
            {
            // InternalBlockchain.g:1076:2: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            else if ( (LA22_0==26) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlockchain.g:1077:3: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1083:3: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalBlockchain.g:1092:1: entryRuleExpresionLogica returns [EObject current=null] : iv_ruleExpresionLogica= ruleExpresionLogica EOF ;
    public final EObject entryRuleExpresionLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLogica = null;


        try {
            // InternalBlockchain.g:1092:56: (iv_ruleExpresionLogica= ruleExpresionLogica EOF )
            // InternalBlockchain.g:1093:2: iv_ruleExpresionLogica= ruleExpresionLogica EOF
            {
             newCompositeNode(grammarAccess.getExpresionLogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionLogica=ruleExpresionLogica();

            state._fsp--;

             current =iv_ruleExpresionLogica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionLogica"


    // $ANTLR start "ruleExpresionLogica"
    // InternalBlockchain.g:1099:1: ruleExpresionLogica returns [EObject current=null] : (otherlv_0= 'ExpLog' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperadorLogico ) )? ( (lv_der_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionLogica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_izq_1_0 = null;

        Enumerator lv_operador_2_0 = null;

        EObject lv_der_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1105:2: ( (otherlv_0= 'ExpLog' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperadorLogico ) )? ( (lv_der_3_0= ruleExpresion ) ) ) )
            // InternalBlockchain.g:1106:2: (otherlv_0= 'ExpLog' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperadorLogico ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            {
            // InternalBlockchain.g:1106:2: (otherlv_0= 'ExpLog' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperadorLogico ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            // InternalBlockchain.g:1107:3: otherlv_0= 'ExpLog' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperadorLogico ) )? ( (lv_der_3_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0());
            		
            // InternalBlockchain.g:1111:3: ( (lv_izq_1_0= ruleExpresion ) )
            // InternalBlockchain.g:1112:4: (lv_izq_1_0= ruleExpresion )
            {
            // InternalBlockchain.g:1112:4: (lv_izq_1_0= ruleExpresion )
            // InternalBlockchain.g:1113:5: lv_izq_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_izq_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1130:3: ( (lv_operador_2_0= ruleOperadorLogico ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=42 && LA23_0<=49)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:1131:4: (lv_operador_2_0= ruleOperadorLogico )
                    {
                    // InternalBlockchain.g:1131:4: (lv_operador_2_0= ruleOperadorLogico )
                    // InternalBlockchain.g:1132:5: lv_operador_2_0= ruleOperadorLogico
                    {

                    					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_operador_2_0=ruleOperadorLogico();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
                    					}
                    					set(
                    						current,
                    						"operador",
                    						lv_operador_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.OperadorLogico");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1149:3: ( (lv_der_3_0= ruleExpresion ) )
            // InternalBlockchain.g:1150:4: (lv_der_3_0= ruleExpresion )
            {
            // InternalBlockchain.g:1150:4: (lv_der_3_0= ruleExpresion )
            // InternalBlockchain.g:1151:5: lv_der_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_3_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionLogica"


    // $ANTLR start "entryRuleExpresionAritmetica"
    // InternalBlockchain.g:1172:1: entryRuleExpresionAritmetica returns [EObject current=null] : iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF ;
    public final EObject entryRuleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionAritmetica = null;


        try {
            // InternalBlockchain.g:1172:60: (iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF )
            // InternalBlockchain.g:1173:2: iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpresionAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionAritmetica=ruleExpresionAritmetica();

            state._fsp--;

             current =iv_ruleExpresionAritmetica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionAritmetica"


    // $ANTLR start "ruleExpresionAritmetica"
    // InternalBlockchain.g:1179:1: ruleExpresionAritmetica returns [EObject current=null] : (otherlv_0= 'ExpArit' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperador ) )? ( (lv_der_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_izq_1_0 = null;

        Enumerator lv_operador_2_0 = null;

        EObject lv_der_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1185:2: ( (otherlv_0= 'ExpArit' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperador ) )? ( (lv_der_3_0= ruleExpresion ) ) ) )
            // InternalBlockchain.g:1186:2: (otherlv_0= 'ExpArit' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperador ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            {
            // InternalBlockchain.g:1186:2: (otherlv_0= 'ExpArit' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperador ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            // InternalBlockchain.g:1187:3: otherlv_0= 'ExpArit' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operador_2_0= ruleOperador ) )? ( (lv_der_3_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_0());
            		
            // InternalBlockchain.g:1191:3: ( (lv_izq_1_0= ruleExpresion ) )
            // InternalBlockchain.g:1192:4: (lv_izq_1_0= ruleExpresion )
            {
            // InternalBlockchain.g:1192:4: (lv_izq_1_0= ruleExpresion )
            // InternalBlockchain.g:1193:5: lv_izq_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_izq_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1210:3: ( (lv_operador_2_0= ruleOperador ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37||(LA24_0>=50 && LA24_0<=55)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlockchain.g:1211:4: (lv_operador_2_0= ruleOperador )
                    {
                    // InternalBlockchain.g:1211:4: (lv_operador_2_0= ruleOperador )
                    // InternalBlockchain.g:1212:5: lv_operador_2_0= ruleOperador
                    {

                    					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_operador_2_0=ruleOperador();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
                    					}
                    					set(
                    						current,
                    						"operador",
                    						lv_operador_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Operador");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1229:3: ( (lv_der_3_0= ruleExpresion ) )
            // InternalBlockchain.g:1230:4: (lv_der_3_0= ruleExpresion )
            {
            // InternalBlockchain.g:1230:4: (lv_der_3_0= ruleExpresion )
            // InternalBlockchain.g:1231:5: lv_der_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_3_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionAritmetica"


    // $ANTLR start "entryRuleVariable"
    // InternalBlockchain.g:1252:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBlockchain.g:1252:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBlockchain.g:1253:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBlockchain.g:1259:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1265:2: ( (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? ) )
            // InternalBlockchain.g:1266:2: (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? )
            {
            // InternalBlockchain.g:1266:2: (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? )
            // InternalBlockchain.g:1267:3: otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalBlockchain.g:1271:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1272:4: ( ruleEString )
            {
            // InternalBlockchain.g:1272:4: ( ruleEString )
            // InternalBlockchain.g:1273:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1287:3: ( (lv_name_2_0= ruleEString ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBlockchain.g:1288:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalBlockchain.g:1288:4: (lv_name_2_0= ruleEString )
                    // InternalBlockchain.g:1289:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondicional"
    // InternalBlockchain.g:1310:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalBlockchain.g:1310:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalBlockchain.g:1311:2: iv_ruleCondicional= ruleCondicional EOF
            {
             newCompositeNode(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicional=ruleCondicional();

            state._fsp--;

             current =iv_ruleCondicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalBlockchain.g:1317:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expresionlogica_2_0= ruleExpresionLogica ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_linea_5_0= ruleLinea ) )+ otherlv_6= '}' ( (lv_else_7_0= ruleElse ) )? ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expresionlogica_2_0 = null;

        EObject lv_linea_5_0 = null;

        EObject lv_else_7_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1323:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expresionlogica_2_0= ruleExpresionLogica ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_linea_5_0= ruleLinea ) )+ otherlv_6= '}' ( (lv_else_7_0= ruleElse ) )? ) )
            // InternalBlockchain.g:1324:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expresionlogica_2_0= ruleExpresionLogica ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_linea_5_0= ruleLinea ) )+ otherlv_6= '}' ( (lv_else_7_0= ruleElse ) )? )
            {
            // InternalBlockchain.g:1324:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expresionlogica_2_0= ruleExpresionLogica ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_linea_5_0= ruleLinea ) )+ otherlv_6= '}' ( (lv_else_7_0= ruleElse ) )? )
            // InternalBlockchain.g:1325:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expresionlogica_2_0= ruleExpresionLogica ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_linea_5_0= ruleLinea ) )+ otherlv_6= '}' ( (lv_else_7_0= ruleElse ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getCondicionalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBlockchain.g:1333:3: ( (lv_expresionlogica_2_0= ruleExpresionLogica ) )
            // InternalBlockchain.g:1334:4: (lv_expresionlogica_2_0= ruleExpresionLogica )
            {
            // InternalBlockchain.g:1334:4: (lv_expresionlogica_2_0= ruleExpresionLogica )
            // InternalBlockchain.g:1335:5: lv_expresionlogica_2_0= ruleExpresionLogica
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_expresionlogica_2_0=ruleExpresionLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"expresionlogica",
            						lv_expresionlogica_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.ExpresionLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCondicionalAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBlockchain.g:1360:3: ( (lv_linea_5_0= ruleLinea ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=27 && LA26_0<=30)||(LA26_0>=32 && LA26_0<=36)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBlockchain.g:1361:4: (lv_linea_5_0= ruleLinea )
            	    {
            	    // InternalBlockchain.g:1361:4: (lv_linea_5_0= ruleLinea )
            	    // InternalBlockchain.g:1362:5: lv_linea_5_0= ruleLinea
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getLineaLineaParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_linea_5_0=ruleLinea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"linea",
            	    						lv_linea_5_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Linea");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalBlockchain.g:1383:3: ( (lv_else_7_0= ruleElse ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBlockchain.g:1384:4: (lv_else_7_0= ruleElse )
                    {
                    // InternalBlockchain.g:1384:4: (lv_else_7_0= ruleElse )
                    // InternalBlockchain.g:1385:5: lv_else_7_0= ruleElse
                    {

                    					newCompositeNode(grammarAccess.getCondicionalAccess().getElseElseParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_else_7_0=ruleElse();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    					}
                    					set(
                    						current,
                    						"else",
                    						lv_else_7_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Else");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleElse"
    // InternalBlockchain.g:1406:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // InternalBlockchain.g:1406:45: (iv_ruleElse= ruleElse EOF )
            // InternalBlockchain.g:1407:2: iv_ruleElse= ruleElse EOF
            {
             newCompositeNode(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElse=ruleElse();

            state._fsp--;

             current =iv_ruleElse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalBlockchain.g:1413:1: ruleElse returns [EObject current=null] : ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_linea_3_0= ruleLinea ) )+ otherlv_4= '}' ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linea_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1419:2: ( ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_linea_3_0= ruleLinea ) )+ otherlv_4= '}' ) )
            // InternalBlockchain.g:1420:2: ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_linea_3_0= ruleLinea ) )+ otherlv_4= '}' )
            {
            // InternalBlockchain.g:1420:2: ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_linea_3_0= ruleLinea ) )+ otherlv_4= '}' )
            // InternalBlockchain.g:1421:3: () otherlv_1= 'else' otherlv_2= '{' ( (lv_linea_3_0= ruleLinea ) )+ otherlv_4= '}'
            {
            // InternalBlockchain.g:1421:3: ()
            // InternalBlockchain.g:1422:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseAccess().getCondicionalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getElseAccess().getElseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlockchain.g:1436:3: ( (lv_linea_3_0= ruleLinea ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=27 && LA28_0<=30)||(LA28_0>=32 && LA28_0<=36)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBlockchain.g:1437:4: (lv_linea_3_0= ruleLinea )
            	    {
            	    // InternalBlockchain.g:1437:4: (lv_linea_3_0= ruleLinea )
            	    // InternalBlockchain.g:1438:5: lv_linea_3_0= ruleLinea
            	    {

            	    					newCompositeNode(grammarAccess.getElseAccess().getLineaLineaParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_linea_3_0=ruleLinea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"linea",
            	    						lv_linea_3_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Linea");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getElseAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalBlockchain.g:1463:1: entryRuleExpresionNumerica returns [EObject current=null] : iv_ruleExpresionNumerica= ruleExpresionNumerica EOF ;
    public final EObject entryRuleExpresionNumerica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionNumerica = null;


        try {
            // InternalBlockchain.g:1463:58: (iv_ruleExpresionNumerica= ruleExpresionNumerica EOF )
            // InternalBlockchain.g:1464:2: iv_ruleExpresionNumerica= ruleExpresionNumerica EOF
            {
             newCompositeNode(grammarAccess.getExpresionNumericaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionNumerica=ruleExpresionNumerica();

            state._fsp--;

             current =iv_ruleExpresionNumerica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionNumerica"


    // $ANTLR start "ruleExpresionNumerica"
    // InternalBlockchain.g:1470:1: ruleExpresionNumerica returns [EObject current=null] : ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? ) ;
    public final EObject ruleExpresionNumerica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1476:2: ( ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? ) )
            // InternalBlockchain.g:1477:2: ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? )
            {
            // InternalBlockchain.g:1477:2: ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? )
            // InternalBlockchain.g:1478:3: () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )?
            {
            // InternalBlockchain.g:1478:3: ()
            // InternalBlockchain.g:1479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1());
            		
            // InternalBlockchain.g:1489:3: ( (lv_value_2_0= ruleEDouble ) )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_INT||LA29_1==38) ) {
                        alt29=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt29=1;
                    }
                    break;
                case 38:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (LA29_3==RULE_INT) ) {
                        alt29=1;
                    }
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // InternalBlockchain.g:1490:4: (lv_value_2_0= ruleEDouble )
                    {
                    // InternalBlockchain.g:1490:4: (lv_value_2_0= ruleEDouble )
                    // InternalBlockchain.g:1491:5: lv_value_2_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionNumericaRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionNumerica"


    // $ANTLR start "entryRuleExpresionTexto"
    // InternalBlockchain.g:1512:1: entryRuleExpresionTexto returns [EObject current=null] : iv_ruleExpresionTexto= ruleExpresionTexto EOF ;
    public final EObject entryRuleExpresionTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionTexto = null;


        try {
            // InternalBlockchain.g:1512:55: (iv_ruleExpresionTexto= ruleExpresionTexto EOF )
            // InternalBlockchain.g:1513:2: iv_ruleExpresionTexto= ruleExpresionTexto EOF
            {
             newCompositeNode(grammarAccess.getExpresionTextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionTexto=ruleExpresionTexto();

            state._fsp--;

             current =iv_ruleExpresionTexto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionTexto"


    // $ANTLR start "ruleExpresionTexto"
    // InternalBlockchain.g:1519:1: ruleExpresionTexto returns [EObject current=null] : ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? ) ;
    public final EObject ruleExpresionTexto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1525:2: ( ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? ) )
            // InternalBlockchain.g:1526:2: ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? )
            {
            // InternalBlockchain.g:1526:2: ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? )
            // InternalBlockchain.g:1527:3: () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )?
            {
            // InternalBlockchain.g:1527:3: ()
            // InternalBlockchain.g:1528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1());
            		
            // InternalBlockchain.g:1538:3: ( (lv_value_2_0= ruleEString ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBlockchain.g:1539:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalBlockchain.g:1539:4: (lv_value_2_0= ruleEString )
                    // InternalBlockchain.g:1540:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionTextoRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionTexto"


    // $ANTLR start "entryRuleExpresionBoolean"
    // InternalBlockchain.g:1561:1: entryRuleExpresionBoolean returns [EObject current=null] : iv_ruleExpresionBoolean= ruleExpresionBoolean EOF ;
    public final EObject entryRuleExpresionBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionBoolean = null;


        try {
            // InternalBlockchain.g:1561:57: (iv_ruleExpresionBoolean= ruleExpresionBoolean EOF )
            // InternalBlockchain.g:1562:2: iv_ruleExpresionBoolean= ruleExpresionBoolean EOF
            {
             newCompositeNode(grammarAccess.getExpresionBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionBoolean=ruleExpresionBoolean();

            state._fsp--;

             current =iv_ruleExpresionBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionBoolean"


    // $ANTLR start "ruleExpresionBoolean"
    // InternalBlockchain.g:1568:1: ruleExpresionBoolean returns [EObject current=null] : ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? ) ;
    public final EObject ruleExpresionBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1574:2: ( ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? ) )
            // InternalBlockchain.g:1575:2: ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? )
            {
            // InternalBlockchain.g:1575:2: ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? )
            // InternalBlockchain.g:1576:3: () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )?
            {
            // InternalBlockchain.g:1576:3: ()
            // InternalBlockchain.g:1577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1());
            		
            // InternalBlockchain.g:1587:3: ( (lv_value_2_0= ruleEBoolean ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=25 && LA31_0<=26)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBlockchain.g:1588:4: (lv_value_2_0= ruleEBoolean )
                    {
                    // InternalBlockchain.g:1588:4: (lv_value_2_0= ruleEBoolean )
                    // InternalBlockchain.g:1589:5: lv_value_2_0= ruleEBoolean
                    {

                    					newCompositeNode(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionBooleanRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						true,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EBoolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionBoolean"


    // $ANTLR start "entryRuleExpresionReferenciada"
    // InternalBlockchain.g:1610:1: entryRuleExpresionReferenciada returns [EObject current=null] : iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF ;
    public final EObject entryRuleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionReferenciada = null;


        try {
            // InternalBlockchain.g:1610:62: (iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:1611:2: iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF
            {
             newCompositeNode(grammarAccess.getExpresionReferenciadaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionReferenciada=ruleExpresionReferenciada();

            state._fsp--;

             current =iv_ruleExpresionReferenciada; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionReferenciada"


    // $ANTLR start "ruleExpresionReferenciada"
    // InternalBlockchain.g:1617:1: ruleExpresionReferenciada returns [EObject current=null] : (otherlv_0= 'ExpRef' ( ( ruleEString ) ) ) ;
    public final EObject ruleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1623:2: ( (otherlv_0= 'ExpRef' ( ( ruleEString ) ) ) )
            // InternalBlockchain.g:1624:2: (otherlv_0= 'ExpRef' ( ( ruleEString ) ) )
            {
            // InternalBlockchain.g:1624:2: (otherlv_0= 'ExpRef' ( ( ruleEString ) ) )
            // InternalBlockchain.g:1625:3: otherlv_0= 'ExpRef' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0());
            		
            // InternalBlockchain.g:1629:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1630:4: ( ruleEString )
            {
            // InternalBlockchain.g:1630:4: ( ruleEString )
            // InternalBlockchain.g:1631:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionReferenciadaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionReferenciada"


    // $ANTLR start "entryRuleExpresionRelacional"
    // InternalBlockchain.g:1649:1: entryRuleExpresionRelacional returns [EObject current=null] : iv_ruleExpresionRelacional= ruleExpresionRelacional EOF ;
    public final EObject entryRuleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionRelacional = null;


        try {
            // InternalBlockchain.g:1649:60: (iv_ruleExpresionRelacional= ruleExpresionRelacional EOF )
            // InternalBlockchain.g:1650:2: iv_ruleExpresionRelacional= ruleExpresionRelacional EOF
            {
             newCompositeNode(grammarAccess.getExpresionRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionRelacional=ruleExpresionRelacional();

            state._fsp--;

             current =iv_ruleExpresionRelacional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionRelacional"


    // $ANTLR start "ruleExpresionRelacional"
    // InternalBlockchain.g:1656:1: ruleExpresionRelacional returns [EObject current=null] : (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_izq_1_0 = null;

        Enumerator lv_operadorRelacional_2_0 = null;

        EObject lv_der_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1662:2: ( (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) ) )
            // InternalBlockchain.g:1663:2: (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            {
            // InternalBlockchain.g:1663:2: (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            // InternalBlockchain.g:1664:3: otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0());
            		
            // InternalBlockchain.g:1668:3: ( (lv_izq_1_0= ruleExpresion ) )
            // InternalBlockchain.g:1669:4: (lv_izq_1_0= ruleExpresion )
            {
            // InternalBlockchain.g:1669:4: (lv_izq_1_0= ruleExpresion )
            // InternalBlockchain.g:1670:5: lv_izq_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_izq_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1687:3: ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBlockchain.g:1688:4: (lv_operadorRelacional_2_0= ruleOperadorRelacion )
                    {
                    // InternalBlockchain.g:1688:4: (lv_operadorRelacional_2_0= ruleOperadorRelacion )
                    // InternalBlockchain.g:1689:5: lv_operadorRelacional_2_0= ruleOperadorRelacion
                    {

                    					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_operadorRelacional_2_0=ruleOperadorRelacion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
                    					}
                    					set(
                    						current,
                    						"operadorRelacional",
                    						lv_operadorRelacional_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.OperadorRelacion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1706:3: ( (lv_der_3_0= ruleExpresion ) )
            // InternalBlockchain.g:1707:4: (lv_der_3_0= ruleExpresion )
            {
            // InternalBlockchain.g:1707:4: (lv_der_3_0= ruleExpresion )
            // InternalBlockchain.g:1708:5: lv_der_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_3_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionRelacional"


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:1729:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalBlockchain.g:1729:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalBlockchain.g:1730:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalBlockchain.g:1736:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1742:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBlockchain.g:1743:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBlockchain.g:1743:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBlockchain.g:1744:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBlockchain.g:1744:3: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBlockchain.g:1745:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBlockchain.g:1751:3: (this_INT_1= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBlockchain.g:1752:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_32); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,38,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_34); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalBlockchain.g:1772:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=39 && LA37_0<=40)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBlockchain.g:1773:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBlockchain.g:1773:4: (kw= 'E' | kw= 'e' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==39) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==40) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalBlockchain.g:1774:5: kw= 'E'
                            {
                            kw=(Token)match(input,39,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBlockchain.g:1780:5: kw= 'e'
                            {
                            kw=(Token)match(input,40,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBlockchain.g:1786:4: (kw= '-' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==37) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalBlockchain.g:1787:5: kw= '-'
                            {
                            kw=(Token)match(input,37,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:1805:1: entryRulePrimitivo returns [EObject current=null] : iv_rulePrimitivo= rulePrimitivo EOF ;
    public final EObject entryRulePrimitivo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivo = null;


        try {
            // InternalBlockchain.g:1805:50: (iv_rulePrimitivo= rulePrimitivo EOF )
            // InternalBlockchain.g:1806:2: iv_rulePrimitivo= rulePrimitivo EOF
            {
             newCompositeNode(grammarAccess.getPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitivo=rulePrimitivo();

            state._fsp--;

             current =iv_rulePrimitivo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitivo"


    // $ANTLR start "rulePrimitivo"
    // InternalBlockchain.g:1812:1: rulePrimitivo returns [EObject current=null] : ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePrimitivo() throws RecognitionException {
        EObject current = null;

        Enumerator lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1818:2: ( ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBlockchain.g:1819:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:1819:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) )
            // InternalBlockchain.g:1820:3: () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBlockchain.g:1820:3: ()
            // InternalBlockchain.g:1821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitivoAccess().getPrimitivoAction_0(),
            					current);
            			

            }

            // InternalBlockchain.g:1827:3: ( (lv_tipo_1_0= ruleDatoPrimitivo ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=56 && LA38_0<=59)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBlockchain.g:1828:4: (lv_tipo_1_0= ruleDatoPrimitivo )
                    {
                    // InternalBlockchain.g:1828:4: (lv_tipo_1_0= ruleDatoPrimitivo )
                    // InternalBlockchain.g:1829:5: lv_tipo_1_0= ruleDatoPrimitivo
                    {

                    					newCompositeNode(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_tipo_1_0=ruleDatoPrimitivo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitivoRule());
                    					}
                    					set(
                    						current,
                    						"tipo",
                    						lv_tipo_1_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.DatoPrimitivo");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1846:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:1847:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:1847:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:1848:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitivoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitivo"


    // $ANTLR start "entryRuleMapa"
    // InternalBlockchain.g:1869:1: entryRuleMapa returns [EObject current=null] : iv_ruleMapa= ruleMapa EOF ;
    public final EObject entryRuleMapa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapa = null;


        try {
            // InternalBlockchain.g:1869:45: (iv_ruleMapa= ruleMapa EOF )
            // InternalBlockchain.g:1870:2: iv_ruleMapa= ruleMapa EOF
            {
             newCompositeNode(grammarAccess.getMapaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapa=ruleMapa();

            state._fsp--;

             current =iv_ruleMapa; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapa"


    // $ANTLR start "ruleMapa"
    // InternalBlockchain.g:1876:1: ruleMapa returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) ) ;
    public final EObject ruleMapa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1882:2: ( (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) ) )
            // InternalBlockchain.g:1883:2: (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:1883:2: (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) )
            // InternalBlockchain.g:1884:3: otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getMapaAccess().getMapKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMapaAccess().getLessThanSignKeyword_1());
            		
            // InternalBlockchain.g:1892:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1893:4: ( ruleEString )
            {
            // InternalBlockchain.g:1893:4: ( ruleEString )
            // InternalBlockchain.g:1894:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMapaAccess().getCommaKeyword_3());
            		
            // InternalBlockchain.g:1912:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1913:4: ( ruleEString )
            {
            // InternalBlockchain.g:1913:4: ( ruleEString )
            // InternalBlockchain.g:1914:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMapaAccess().getColonKeyword_6());
            		
            // InternalBlockchain.g:1936:3: ( (lv_name_7_0= ruleEString ) )
            // InternalBlockchain.g:1937:4: (lv_name_7_0= ruleEString )
            {
            // InternalBlockchain.g:1937:4: (lv_name_7_0= ruleEString )
            // InternalBlockchain.g:1938:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapa"


    // $ANTLR start "ruleOperadorLogico"
    // InternalBlockchain.g:1959:1: ruleOperadorLogico returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) ;
    public final Enumerator ruleOperadorLogico() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1965:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) )
            // InternalBlockchain.g:1966:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            {
            // InternalBlockchain.g:1966:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            int alt39=8;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt39=1;
                }
                break;
            case 45:
                {
                alt39=2;
                }
                break;
            case 43:
                {
                alt39=3;
                }
                break;
            case 42:
                {
                alt39=4;
                }
                break;
            case 46:
                {
                alt39=5;
                }
                break;
            case 47:
                {
                alt39=6;
                }
                break;
            case 48:
                {
                alt39=7;
                }
                break;
            case 49:
                {
                alt39=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:1967:3: (enumLiteral_0= '==' )
                    {
                    // InternalBlockchain.g:1967:3: (enumLiteral_0= '==' )
                    // InternalBlockchain.g:1968:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1975:3: (enumLiteral_1= '!=' )
                    {
                    // InternalBlockchain.g:1975:3: (enumLiteral_1= '!=' )
                    // InternalBlockchain.g:1976:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1983:3: (enumLiteral_2= '>' )
                    {
                    // InternalBlockchain.g:1983:3: (enumLiteral_2= '>' )
                    // InternalBlockchain.g:1984:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1991:3: (enumLiteral_3= '<' )
                    {
                    // InternalBlockchain.g:1991:3: (enumLiteral_3= '<' )
                    // InternalBlockchain.g:1992:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:1999:3: (enumLiteral_4= '>=' )
                    {
                    // InternalBlockchain.g:1999:3: (enumLiteral_4= '>=' )
                    // InternalBlockchain.g:2000:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:2007:3: (enumLiteral_5= '<=' )
                    {
                    // InternalBlockchain.g:2007:3: (enumLiteral_5= '<=' )
                    // InternalBlockchain.g:2008:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:2015:3: (enumLiteral_6= '&&' )
                    {
                    // InternalBlockchain.g:2015:3: (enumLiteral_6= '&&' )
                    // InternalBlockchain.g:2016:4: enumLiteral_6= '&&'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:2023:3: (enumLiteral_7= '||' )
                    {
                    // InternalBlockchain.g:2023:3: (enumLiteral_7= '||' )
                    // InternalBlockchain.g:2024:4: enumLiteral_7= '||'
                    {
                    enumLiteral_7=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperadorLogico"


    // $ANTLR start "ruleOperador"
    // InternalBlockchain.g:2034:1: ruleOperador returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) ) ;
    public final Enumerator ruleOperador() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2040:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) ) )
            // InternalBlockchain.g:2041:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) )
            {
            // InternalBlockchain.g:2041:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt40=1;
                }
                break;
            case 37:
                {
                alt40=2;
                }
                break;
            case 51:
                {
                alt40=3;
                }
                break;
            case 52:
                {
                alt40=4;
                }
                break;
            case 53:
                {
                alt40=5;
                }
                break;
            case 54:
                {
                alt40=6;
                }
                break;
            case 55:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:2042:3: (enumLiteral_0= '+' )
                    {
                    // InternalBlockchain.g:2042:3: (enumLiteral_0= '+' )
                    // InternalBlockchain.g:2043:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2050:3: (enumLiteral_1= '-' )
                    {
                    // InternalBlockchain.g:2050:3: (enumLiteral_1= '-' )
                    // InternalBlockchain.g:2051:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2058:3: (enumLiteral_2= '*' )
                    {
                    // InternalBlockchain.g:2058:3: (enumLiteral_2= '*' )
                    // InternalBlockchain.g:2059:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:2066:3: (enumLiteral_3= '/' )
                    {
                    // InternalBlockchain.g:2066:3: (enumLiteral_3= '/' )
                    // InternalBlockchain.g:2067:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:2074:3: (enumLiteral_4= '=' )
                    {
                    // InternalBlockchain.g:2074:3: (enumLiteral_4= '=' )
                    // InternalBlockchain.g:2075:4: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:2082:3: (enumLiteral_5= 'GET' )
                    {
                    // InternalBlockchain.g:2082:3: (enumLiteral_5= 'GET' )
                    // InternalBlockchain.g:2083:4: enumLiteral_5= 'GET'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:2090:3: (enumLiteral_6= 'DELETE' )
                    {
                    // InternalBlockchain.g:2090:3: (enumLiteral_6= 'DELETE' )
                    // InternalBlockchain.g:2091:4: enumLiteral_6= 'DELETE'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleOperadorRelacion"
    // InternalBlockchain.g:2101:1: ruleOperadorRelacion returns [Enumerator current=null] : (enumLiteral_0= '.' ) ;
    public final Enumerator ruleOperadorRelacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2107:2: ( (enumLiteral_0= '.' ) )
            // InternalBlockchain.g:2108:2: (enumLiteral_0= '.' )
            {
            // InternalBlockchain.g:2108:2: (enumLiteral_0= '.' )
            // InternalBlockchain.g:2109:3: enumLiteral_0= '.'
            {
            enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

            			current = grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperadorRelacion"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalBlockchain.g:2118:1: ruleDatoPrimitivo returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'address' ) ) ;
    public final Enumerator ruleDatoPrimitivo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2124:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'address' ) ) )
            // InternalBlockchain.g:2125:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'address' ) )
            {
            // InternalBlockchain.g:2125:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'address' ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt41=1;
                }
                break;
            case 57:
                {
                alt41=2;
                }
                break;
            case 58:
                {
                alt41=3;
                }
                break;
            case 59:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalBlockchain.g:2126:3: (enumLiteral_0= 'String' )
                    {
                    // InternalBlockchain.g:2126:3: (enumLiteral_0= 'String' )
                    // InternalBlockchain.g:2127:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2134:3: (enumLiteral_1= 'uint' )
                    {
                    // InternalBlockchain.g:2134:3: (enumLiteral_1= 'uint' )
                    // InternalBlockchain.g:2135:4: enumLiteral_1= 'uint'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2142:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalBlockchain.g:2142:3: (enumLiteral_2= 'Boolean' )
                    // InternalBlockchain.g:2143:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:2150:3: (enumLiteral_3= 'address' )
                    {
                    // InternalBlockchain.g:2150:3: (enumLiteral_3= 'address' )
                    // InternalBlockchain.g:2151:4: enumLiteral_3= 'address'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatoPrimitivo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0F00020000010030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001034000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001F78804000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001F78004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001F78000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0003FC1F78000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00FC003F78000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000000042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000005F78000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400000L});

}