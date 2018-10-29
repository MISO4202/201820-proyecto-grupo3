package org.xtext.blockchain.parser.antlr.internal;

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
import org.xtext.blockchain.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aplicacion'", "'{'", "','", "'TipoDato'", "'}'", "'SmartContract'", "'Entidad'", "'Operacion'", "'isUd='", "'('", "')'", "':'", "'return'", "'Estado'", "'true'", "'false'", "'ExpresionLogica'", "'id'", "'operador'", "'ladoIzq'", "'ladoDer'", "'ExpArit'", "'Variable'", "'tipodato'", "'Condicional'", "'tipoCondicional'", "'expresionlogica'", "'sentencias'", "'else'", "'ExpresionNumerica'", "'value'", "'ExpresionTexto'", "'ExpresionBoolean'", "'ExpRef'", "'ExpresionRelacional'", "'operadorRelacional'", "'-'", "'.'", "'E'", "'e'", "'Map'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", "'+'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'if'", "'STRING'", "'NUMERICO'", "'BOOLEAN'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Aplicacion";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAplicacion"
    // InternalMyDsl.g:65:1: entryRuleAplicacion returns [EObject current=null] : iv_ruleAplicacion= ruleAplicacion EOF ;
    public final EObject entryRuleAplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAplicacion = null;


        try {
            // InternalMyDsl.g:65:51: (iv_ruleAplicacion= ruleAplicacion EOF )
            // InternalMyDsl.g:66:2: iv_ruleAplicacion= ruleAplicacion EOF
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
    // InternalMyDsl.g:72:1: ruleAplicacion returns [EObject current=null] : ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' ) ;
    public final EObject ruleAplicacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_smartcontract_4_0 = null;

        EObject lv_smartcontract_6_0 = null;

        EObject lv_tipodato_8_0 = null;

        EObject lv_tipodato_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAplicacionAccess().getAplicacionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAplicacionAccess().getAplicacionKeyword_1());
            		
            // InternalMyDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:93:5: lv_name_2_0= ruleEString
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
            						"org.xtext.blockchain.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:114:3: ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )*
                    {
                    // InternalMyDsl.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) )
                    // InternalMyDsl.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    {
                    // InternalMyDsl.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    // InternalMyDsl.g:117:6: lv_smartcontract_4_0= ruleSmartContract
                    {

                    						newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_smartcontract_4_0=ruleSmartContract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
                    						}
                    						add(
                    							current,
                    							"smartcontract",
                    							lv_smartcontract_4_0,
                    							"org.xtext.blockchain.MyDsl.SmartContract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:134:4: (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:135:5: otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAplicacionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMyDsl.g:139:5: ( (lv_smartcontract_6_0= ruleSmartContract ) )
                    	    // InternalMyDsl.g:140:6: (lv_smartcontract_6_0= ruleSmartContract )
                    	    {
                    	    // InternalMyDsl.g:140:6: (lv_smartcontract_6_0= ruleSmartContract )
                    	    // InternalMyDsl.g:141:7: lv_smartcontract_6_0= ruleSmartContract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_smartcontract_6_0=ruleSmartContract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAplicacionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"smartcontract",
                    	    								lv_smartcontract_6_0,
                    	    								"org.xtext.blockchain.MyDsl.SmartContract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            // InternalMyDsl.g:160:3: (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:161:4: otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getAplicacionAccess().getTipoDatoKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:165:4: ( (lv_tipodato_8_0= ruleTipoDato ) )
            	    // InternalMyDsl.g:166:5: (lv_tipodato_8_0= ruleTipoDato )
            	    {
            	    // InternalMyDsl.g:166:5: (lv_tipodato_8_0= ruleTipoDato )
            	    // InternalMyDsl.g:167:6: lv_tipodato_8_0= ruleTipoDato
            	    {

            	    						newCompositeNode(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_tipodato_8_0=ruleTipoDato();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tipodato",
            	    							lv_tipodato_8_0,
            	    							"org.xtext.blockchain.MyDsl.TipoDato");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:184:4: (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==13) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:185:5: otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,13,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getAplicacionAccess().getCommaKeyword_5_2_0());
            	    	    				
            	    	    // InternalMyDsl.g:189:5: ( (lv_tipodato_10_0= ruleTipoDato ) )
            	    	    // InternalMyDsl.g:190:6: (lv_tipodato_10_0= ruleTipoDato )
            	    	    {
            	    	    // InternalMyDsl.g:190:6: (lv_tipodato_10_0= ruleTipoDato )
            	    	    // InternalMyDsl.g:191:7: lv_tipodato_10_0= ruleTipoDato
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_tipodato_10_0=ruleTipoDato();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getAplicacionRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"tipodato",
            	    	    								lv_tipodato_10_0,
            	    	    								"org.xtext.blockchain.MyDsl.TipoDato");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:218:1: entryRuleTipoDato returns [EObject current=null] : iv_ruleTipoDato= ruleTipoDato EOF ;
    public final EObject entryRuleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDato = null;


        try {
            // InternalMyDsl.g:218:49: (iv_ruleTipoDato= ruleTipoDato EOF )
            // InternalMyDsl.g:219:2: iv_ruleTipoDato= ruleTipoDato EOF
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
    // InternalMyDsl.g:225:1: ruleTipoDato returns [EObject current=null] : (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) ;
    public final EObject ruleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject this_Entidad_0 = null;

        EObject this_Primitivo_1 = null;

        EObject this_Mapa_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:231:2: ( (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) )
            // InternalMyDsl.g:232:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            {
            // InternalMyDsl.g:232:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 67:
            case 68:
            case 69:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:233:3: this_Entidad_0= ruleEntidad
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
                    // InternalMyDsl.g:242:3: this_Primitivo_1= rulePrimitivo
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
                    // InternalMyDsl.g:251:3: this_Mapa_2= ruleMapa
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


    // $ANTLR start "entryRuleSentencia"
    // InternalMyDsl.g:263:1: entryRuleSentencia returns [EObject current=null] : iv_ruleSentencia= ruleSentencia EOF ;
    public final EObject entryRuleSentencia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencia = null;


        try {
            // InternalMyDsl.g:263:50: (iv_ruleSentencia= ruleSentencia EOF )
            // InternalMyDsl.g:264:2: iv_ruleSentencia= ruleSentencia EOF
            {
             newCompositeNode(grammarAccess.getSentenciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentencia=ruleSentencia();

            state._fsp--;

             current =iv_ruleSentencia; 
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
    // $ANTLR end "entryRuleSentencia"


    // $ANTLR start "ruleSentencia"
    // InternalMyDsl.g:270:1: ruleSentencia returns [EObject current=null] : (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | this_ExpresionTexto_7= ruleExpresionTexto | this_ExpresionBoolean_8= ruleExpresionBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional ) ;
    public final EObject ruleSentencia() throws RecognitionException {
        EObject current = null;

        EObject this_Parametro_0 = null;

        EObject this_Estado_1 = null;

        EObject this_ExpresionLogica_2 = null;

        EObject this_ExpresionAritmetica_3 = null;

        EObject this_Variable_4 = null;

        EObject this_Condicional_5 = null;

        EObject this_ExpresionNumerica_6 = null;

        EObject this_ExpresionTexto_7 = null;

        EObject this_ExpresionBoolean_8 = null;

        EObject this_ExpresionReferenciada_9 = null;

        EObject this_ExpresionRelacional_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:276:2: ( (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | this_ExpresionTexto_7= ruleExpresionTexto | this_ExpresionBoolean_8= ruleExpresionBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional ) )
            // InternalMyDsl.g:277:2: (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | this_ExpresionTexto_7= ruleExpresionTexto | this_ExpresionBoolean_8= ruleExpresionBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional )
            {
            // InternalMyDsl.g:277:2: (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | this_ExpresionTexto_7= ruleExpresionTexto | this_ExpresionBoolean_8= ruleExpresionBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional )
            int alt6=11;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            case 33:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            case 40:
                {
                alt6=7;
                }
                break;
            case 42:
                {
                alt6=8;
                }
                break;
            case 41:
            case 43:
                {
                alt6=9;
                }
                break;
            case 44:
                {
                alt6=10;
                }
                break;
            case 45:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:278:3: this_Parametro_0= ruleParametro
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getParametroParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parametro_0=ruleParametro();

                    state._fsp--;


                    			current = this_Parametro_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:287:3: this_Estado_1= ruleEstado
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getEstadoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Estado_1=ruleEstado();

                    state._fsp--;


                    			current = this_Estado_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:296:3: this_ExpresionLogica_2= ruleExpresionLogica
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionLogicaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionLogica_2=ruleExpresionLogica();

                    state._fsp--;


                    			current = this_ExpresionLogica_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:305:3: this_ExpresionAritmetica_3= ruleExpresionAritmetica
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionAritmeticaParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionAritmetica_3=ruleExpresionAritmetica();

                    state._fsp--;


                    			current = this_ExpresionAritmetica_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:314:3: this_Variable_4= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:323:3: this_Condicional_5= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getCondicionalParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_5=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:332:3: this_ExpresionNumerica_6= ruleExpresionNumerica
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionNumericaParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionNumerica_6=ruleExpresionNumerica();

                    state._fsp--;


                    			current = this_ExpresionNumerica_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:341:3: this_ExpresionTexto_7= ruleExpresionTexto
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionTextoParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionTexto_7=ruleExpresionTexto();

                    state._fsp--;


                    			current = this_ExpresionTexto_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:350:3: this_ExpresionBoolean_8= ruleExpresionBoolean
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionBooleanParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionBoolean_8=ruleExpresionBoolean();

                    state._fsp--;


                    			current = this_ExpresionBoolean_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:359:3: this_ExpresionReferenciada_9= ruleExpresionReferenciada
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionReferenciadaParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionReferenciada_9=ruleExpresionReferenciada();

                    state._fsp--;


                    			current = this_ExpresionReferenciada_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:368:3: this_ExpresionRelacional_10= ruleExpresionRelacional
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionRelacionalParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionRelacional_10=ruleExpresionRelacional();

                    state._fsp--;


                    			current = this_ExpresionRelacional_10;
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
    // $ANTLR end "ruleSentencia"


    // $ANTLR start "entryRuleSmartContract"
    // InternalMyDsl.g:380:1: entryRuleSmartContract returns [EObject current=null] : iv_ruleSmartContract= ruleSmartContract EOF ;
    public final EObject entryRuleSmartContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartContract = null;


        try {
            // InternalMyDsl.g:380:54: (iv_ruleSmartContract= ruleSmartContract EOF )
            // InternalMyDsl.g:381:2: iv_ruleSmartContract= ruleSmartContract EOF
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
    // InternalMyDsl.g:387:1: ruleSmartContract returns [EObject current=null] : (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )* )* ( ( (lv_estado_6_0= ruleEstado ) ) (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_9_0= ruleOperacion ) ) (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )* )* otherlv_12= '}' ) ;
    public final EObject ruleSmartContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_entidades_3_0 = null;

        EObject lv_entidades_5_0 = null;

        EObject lv_estado_6_0 = null;

        EObject lv_estado_8_0 = null;

        EObject lv_operaciones_9_0 = null;

        EObject lv_operaciones_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:393:2: ( (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )* )* ( ( (lv_estado_6_0= ruleEstado ) ) (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_9_0= ruleOperacion ) ) (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )* )* otherlv_12= '}' ) )
            // InternalMyDsl.g:394:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )* )* ( ( (lv_estado_6_0= ruleEstado ) ) (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_9_0= ruleOperacion ) ) (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )* )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:394:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )* )* ( ( (lv_estado_6_0= ruleEstado ) ) (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_9_0= ruleOperacion ) ) (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )* )* otherlv_12= '}' )
            // InternalMyDsl.g:395:3: otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )* )* ( ( (lv_estado_6_0= ruleEstado ) ) (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_9_0= ruleOperacion ) ) (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )* )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSmartContractAccess().getSmartContractKeyword_0());
            		
            // InternalMyDsl.g:399:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:400:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:400:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:401:5: lv_name_1_0= ruleEString
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
            						"org.xtext.blockchain.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:422:3: ( ( (lv_entidades_3_0= ruleEntidad ) ) (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )* )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:423:4: ( (lv_entidades_3_0= ruleEntidad ) ) (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )*
            	    {
            	    // InternalMyDsl.g:423:4: ( (lv_entidades_3_0= ruleEntidad ) )
            	    // InternalMyDsl.g:424:5: (lv_entidades_3_0= ruleEntidad )
            	    {
            	    // InternalMyDsl.g:424:5: (lv_entidades_3_0= ruleEntidad )
            	    // InternalMyDsl.g:425:6: lv_entidades_3_0= ruleEntidad
            	    {

            	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_entidades_3_0=ruleEntidad();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entidades",
            	    							lv_entidades_3_0,
            	    							"org.xtext.blockchain.MyDsl.Entidad");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:442:4: (otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==13) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:443:5: otherlv_4= ',' ( (lv_entidades_5_0= ruleEntidad ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getSmartContractAccess().getCommaKeyword_3_1_0());
            	    	    				
            	    	    // InternalMyDsl.g:447:5: ( (lv_entidades_5_0= ruleEntidad ) )
            	    	    // InternalMyDsl.g:448:6: (lv_entidades_5_0= ruleEntidad )
            	    	    {
            	    	    // InternalMyDsl.g:448:6: (lv_entidades_5_0= ruleEntidad )
            	    	    // InternalMyDsl.g:449:7: lv_entidades_5_0= ruleEntidad
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_entidades_5_0=ruleEntidad();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"entidades",
            	    	    								lv_entidades_5_0,
            	    	    								"org.xtext.blockchain.MyDsl.Entidad");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:468:3: ( ( (lv_estado_6_0= ruleEstado ) ) (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:469:4: ( (lv_estado_6_0= ruleEstado ) ) (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )*
            	    {
            	    // InternalMyDsl.g:469:4: ( (lv_estado_6_0= ruleEstado ) )
            	    // InternalMyDsl.g:470:5: (lv_estado_6_0= ruleEstado )
            	    {
            	    // InternalMyDsl.g:470:5: (lv_estado_6_0= ruleEstado )
            	    // InternalMyDsl.g:471:6: lv_estado_6_0= ruleEstado
            	    {

            	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_estado_6_0=ruleEstado();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"estado",
            	    							lv_estado_6_0,
            	    							"org.xtext.blockchain.MyDsl.Estado");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:488:4: (otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==13) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:489:5: otherlv_7= ',' ( (lv_estado_8_0= ruleEstado ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,13,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getSmartContractAccess().getCommaKeyword_4_1_0());
            	    	    				
            	    	    // InternalMyDsl.g:493:5: ( (lv_estado_8_0= ruleEstado ) )
            	    	    // InternalMyDsl.g:494:6: (lv_estado_8_0= ruleEstado )
            	    	    {
            	    	    // InternalMyDsl.g:494:6: (lv_estado_8_0= ruleEstado )
            	    	    // InternalMyDsl.g:495:7: lv_estado_8_0= ruleEstado
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_estado_8_0=ruleEstado();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"estado",
            	    	    								lv_estado_8_0,
            	    	    								"org.xtext.blockchain.MyDsl.Estado");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:514:3: ( ( (lv_operaciones_9_0= ruleOperacion ) ) (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )* )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:515:4: ( (lv_operaciones_9_0= ruleOperacion ) ) (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )*
            	    {
            	    // InternalMyDsl.g:515:4: ( (lv_operaciones_9_0= ruleOperacion ) )
            	    // InternalMyDsl.g:516:5: (lv_operaciones_9_0= ruleOperacion )
            	    {
            	    // InternalMyDsl.g:516:5: (lv_operaciones_9_0= ruleOperacion )
            	    // InternalMyDsl.g:517:6: lv_operaciones_9_0= ruleOperacion
            	    {

            	    						newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operaciones_9_0=ruleOperacion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operaciones",
            	    							lv_operaciones_9_0,
            	    							"org.xtext.blockchain.MyDsl.Operacion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:534:4: (otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==13) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:535:5: otherlv_10= ',' ( (lv_operaciones_11_0= ruleOperacion ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,13,FOLLOW_15); 

            	    	    					newLeafNode(otherlv_10, grammarAccess.getSmartContractAccess().getCommaKeyword_5_1_0());
            	    	    				
            	    	    // InternalMyDsl.g:539:5: ( (lv_operaciones_11_0= ruleOperacion ) )
            	    	    // InternalMyDsl.g:540:6: (lv_operaciones_11_0= ruleOperacion )
            	    	    {
            	    	    // InternalMyDsl.g:540:6: (lv_operaciones_11_0= ruleOperacion )
            	    	    // InternalMyDsl.g:541:7: lv_operaciones_11_0= ruleOperacion
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_operaciones_11_0=ruleOperacion();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"operaciones",
            	    	    								lv_operaciones_11_0,
            	    	    								"org.xtext.blockchain.MyDsl.Operacion");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:568:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:568:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:569:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:575:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:581:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:582:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:582:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMyDsl.g:583:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:591:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:602:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalMyDsl.g:602:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalMyDsl.g:603:2: iv_ruleEntidad= ruleEntidad EOF
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
    // InternalMyDsl.g:609:1: ruleEntidad returns [EObject current=null] : ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:615:2: ( ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' ) )
            // InternalMyDsl.g:616:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:616:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' )
            // InternalMyDsl.g:617:3: () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}'
            {
            // InternalMyDsl.g:617:3: ()
            // InternalMyDsl.g:618:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadAccess().getEntidadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadAccess().getEntidadKeyword_1());
            		
            // InternalMyDsl.g:628:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:629:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:629:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:630:5: lv_name_2_0= ruleEString
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
            						"org.xtext.blockchain.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:651:3: ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:652:4: ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )*
            	    {
            	    // InternalMyDsl.g:652:4: ( (lv_atributos_4_0= ruleAtributo ) )
            	    // InternalMyDsl.g:653:5: (lv_atributos_4_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:653:5: (lv_atributos_4_0= ruleAtributo )
            	    // InternalMyDsl.g:654:6: lv_atributos_4_0= ruleAtributo
            	    {

            	    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_atributos_4_0=ruleAtributo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    						}
            	    						add(
            	    							current,
            	    							"atributos",
            	    							lv_atributos_4_0,
            	    							"org.xtext.blockchain.MyDsl.Atributo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:671:4: ( (lv_atributos_5_0= ruleAtributo ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_STRING) ) {
            	            int LA14_2 = input.LA(2);

            	            if ( (LA14_2==RULE_STRING) ) {
            	                alt14=1;
            	            }
            	            else if ( (LA14_2==RULE_ID) ) {
            	                alt14=1;
            	            }


            	        }
            	        else if ( (LA14_0==RULE_ID) ) {
            	            int LA14_3 = input.LA(2);

            	            if ( (LA14_3==RULE_STRING) ) {
            	                alt14=1;
            	            }
            	            else if ( (LA14_3==RULE_ID) ) {
            	                alt14=1;
            	            }


            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:672:5: (lv_atributos_5_0= ruleAtributo )
            	    	    {
            	    	    // InternalMyDsl.g:672:5: (lv_atributos_5_0= ruleAtributo )
            	    	    // InternalMyDsl.g:673:6: lv_atributos_5_0= ruleAtributo
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_atributos_5_0=ruleAtributo();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"atributos",
            	    	    							lv_atributos_5_0,
            	    	    							"org.xtext.blockchain.MyDsl.Atributo");
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

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:699:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalMyDsl.g:699:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalMyDsl.g:700:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalMyDsl.g:706:1: ruleOperacion returns [EObject current=null] : ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' ) ;
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
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_esUserDefined_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_parametros_6_0 = null;

        EObject lv_parametros_8_0 = null;

        EObject lv_sentencia_14_0 = null;

        EObject lv_sentencia_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:712:2: ( ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' ) )
            // InternalMyDsl.g:713:2: ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' )
            {
            // InternalMyDsl.g:713:2: ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' )
            // InternalMyDsl.g:714:3: () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}'
            {
            // InternalMyDsl.g:714:3: ()
            // InternalMyDsl.g:715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperacionAccess().getOperacionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getOperacionAccess().getOperacionKeyword_1());
            		
            // InternalMyDsl.g:725:3: (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:726:4: otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOperacionAccess().getIsUdKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:730:4: ( (lv_esUserDefined_3_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:731:5: (lv_esUserDefined_3_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:731:5: (lv_esUserDefined_3_0= ruleEBoolean )
            	    // InternalMyDsl.g:732:6: lv_esUserDefined_3_0= ruleEBoolean
            	    {

            	    						newCompositeNode(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_esUserDefined_3_0=ruleEBoolean();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperacionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"esUserDefined",
            	    							true,
            	    							"org.xtext.blockchain.MyDsl.EBoolean");
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

            // InternalMyDsl.g:750:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:751:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:751:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:752:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.blockchain.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:773:3: ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:774:4: ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )*
                    {
                    // InternalMyDsl.g:774:4: ( (lv_parametros_6_0= ruleParametro ) )
                    // InternalMyDsl.g:775:5: (lv_parametros_6_0= ruleParametro )
                    {
                    // InternalMyDsl.g:775:5: (lv_parametros_6_0= ruleParametro )
                    // InternalMyDsl.g:776:6: lv_parametros_6_0= ruleParametro
                    {

                    						newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_parametros_6_0=ruleParametro();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    						}
                    						add(
                    							current,
                    							"parametros",
                    							lv_parametros_6_0,
                    							"org.xtext.blockchain.MyDsl.Parametro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:793:4: (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==13) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:794:5: otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOperacionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalMyDsl.g:798:5: ( (lv_parametros_8_0= ruleParametro ) )
                    	    // InternalMyDsl.g:799:6: (lv_parametros_8_0= ruleParametro )
                    	    {
                    	    // InternalMyDsl.g:799:6: (lv_parametros_8_0= ruleParametro )
                    	    // InternalMyDsl.g:800:7: lv_parametros_8_0= ruleParametro
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_parametros_8_0=ruleParametro();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperacionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametros",
                    	    								lv_parametros_8_0,
                    	    								"org.xtext.blockchain.MyDsl.Parametro");
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

            otherlv_9=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getOperacionAccess().getRightParenthesisKeyword_6());
            		
            // InternalMyDsl.g:823:3: (otherlv_10= ':' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:824:4: otherlv_10= ':' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperacionAccess().getColonKeyword_7_0());
                    			
                    // InternalMyDsl.g:828:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:829:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:829:5: ( ruleEString )
                    // InternalMyDsl.g:830:6: ruleEString
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

            otherlv_12=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_12, grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:849:3: (otherlv_13= 'return' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:850:4: otherlv_13= 'return'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getOperacionAccess().getReturnKeyword_9());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:855:3: ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||LA22_0==24||LA22_0==27||(LA22_0>=32 && LA22_0<=33)||LA22_0==35||(LA22_0>=40 && LA22_0<=45)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:856:4: ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )*
                    {
                    // InternalMyDsl.g:856:4: ( (lv_sentencia_14_0= ruleSentencia ) )
                    // InternalMyDsl.g:857:5: (lv_sentencia_14_0= ruleSentencia )
                    {
                    // InternalMyDsl.g:857:5: (lv_sentencia_14_0= ruleSentencia )
                    // InternalMyDsl.g:858:6: lv_sentencia_14_0= ruleSentencia
                    {

                    						newCompositeNode(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_sentencia_14_0=ruleSentencia();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    						}
                    						add(
                    							current,
                    							"sentencia",
                    							lv_sentencia_14_0,
                    							"org.xtext.blockchain.MyDsl.Sentencia");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:875:4: ( (lv_sentencia_15_0= ruleSentencia ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||LA21_0==24||LA21_0==27||(LA21_0>=32 && LA21_0<=33)||LA21_0==35||(LA21_0>=40 && LA21_0<=45)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:876:5: (lv_sentencia_15_0= ruleSentencia )
                    	    {
                    	    // InternalMyDsl.g:876:5: (lv_sentencia_15_0= ruleSentencia )
                    	    // InternalMyDsl.g:877:6: lv_sentencia_15_0= ruleSentencia
                    	    {

                    	    						newCompositeNode(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_sentencia_15_0=ruleSentencia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sentencia",
                    	    							lv_sentencia_15_0,
                    	    							"org.xtext.blockchain.MyDsl.Sentencia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalMyDsl.g:903:1: entryRuleEstado returns [EObject current=null] : iv_ruleEstado= ruleEstado EOF ;
    public final EObject entryRuleEstado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstado = null;


        try {
            // InternalMyDsl.g:903:47: (iv_ruleEstado= ruleEstado EOF )
            // InternalMyDsl.g:904:2: iv_ruleEstado= ruleEstado EOF
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
    // InternalMyDsl.g:910:1: ruleEstado returns [EObject current=null] : (otherlv_0= 'Estado' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEstado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:916:2: ( (otherlv_0= 'Estado' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:917:2: (otherlv_0= 'Estado' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:917:2: (otherlv_0= 'Estado' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:918:3: otherlv_0= 'Estado' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstadoAccess().getEstadoKeyword_0());
            		
            // InternalMyDsl.g:922:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:923:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:923:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:924:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEstadoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.blockchain.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:941:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:942:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:942:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:943:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstadoRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_2_0());
            				

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
    // InternalMyDsl.g:958:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:958:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:959:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalMyDsl.g:965:1: ruleAtributo returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:971:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:972:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:972:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:973:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:973:3: ( ( ruleEString ) )
            // InternalMyDsl.g:974:4: ( ruleEString )
            {
            // InternalMyDsl.g:974:4: ( ruleEString )
            // InternalMyDsl.g:975:5: ruleEString
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

            // InternalMyDsl.g:989:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:990:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:990:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:991:5: lv_name_1_0= ruleEString
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
            						"org.xtext.blockchain.MyDsl.EString");
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
    // InternalMyDsl.g:1012:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalMyDsl.g:1012:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalMyDsl.g:1013:2: iv_ruleParametro= ruleParametro EOF
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
    // InternalMyDsl.g:1019:1: ruleParametro returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1025:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1026:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1026:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:1027:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:1027:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1028:4: ( ruleEString )
            {
            // InternalMyDsl.g:1028:4: ( ruleEString )
            // InternalMyDsl.g:1029:5: ruleEString
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

            // InternalMyDsl.g:1043:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1044:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1044:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1045:5: lv_name_1_0= ruleEString
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
            						"org.xtext.blockchain.MyDsl.EString");
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
    // InternalMyDsl.g:1066:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:1066:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:1067:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalMyDsl.g:1073:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1079:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:1080:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:1080:2: (kw= 'true' | kw= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            else if ( (LA23_0==26) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1081:3: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1087:3: kw= 'false'
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
    // InternalMyDsl.g:1096:1: entryRuleExpresionLogica returns [EObject current=null] : iv_ruleExpresionLogica= ruleExpresionLogica EOF ;
    public final EObject entryRuleExpresionLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLogica = null;


        try {
            // InternalMyDsl.g:1096:56: (iv_ruleExpresionLogica= ruleExpresionLogica EOF )
            // InternalMyDsl.g:1097:2: iv_ruleExpresionLogica= ruleExpresionLogica EOF
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
    // InternalMyDsl.g:1103:1: ruleExpresionLogica returns [EObject current=null] : (otherlv_0= 'ExpresionLogica' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operador' ( (lv_operador_5_0= ruleOperadorLogico ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleExpresionLogica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        Enumerator lv_operador_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1109:2: ( (otherlv_0= 'ExpresionLogica' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operador' ( (lv_operador_5_0= ruleOperadorLogico ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1110:2: (otherlv_0= 'ExpresionLogica' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operador' ( (lv_operador_5_0= ruleOperadorLogico ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1110:2: (otherlv_0= 'ExpresionLogica' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operador' ( (lv_operador_5_0= ruleOperadorLogico ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1111:3: otherlv_0= 'ExpresionLogica' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operador' ( (lv_operador_5_0= ruleOperadorLogico ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionLogicaAccess().getExpresionLogicaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionLogicaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1119:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1120:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionLogicaAccess().getIdKeyword_2_0());
                    			
                    // InternalMyDsl.g:1124:4: ( (lv_id_3_0= ruleEInt ) )
                    // InternalMyDsl.g:1125:5: (lv_id_3_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1125:5: (lv_id_3_0= ruleEInt )
                    // InternalMyDsl.g:1126:6: lv_id_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionLogicaAccess().getIdEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"org.xtext.blockchain.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1144:3: (otherlv_4= 'operador' ( (lv_operador_5_0= ruleOperadorLogico ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1145:4: otherlv_4= 'operador' ( (lv_operador_5_0= ruleOperadorLogico ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpresionLogicaAccess().getOperadorKeyword_3_0());
                    			
                    // InternalMyDsl.g:1149:4: ( (lv_operador_5_0= ruleOperadorLogico ) )
                    // InternalMyDsl.g:1150:5: (lv_operador_5_0= ruleOperadorLogico )
                    {
                    // InternalMyDsl.g:1150:5: (lv_operador_5_0= ruleOperadorLogico )
                    // InternalMyDsl.g:1151:6: lv_operador_5_0= ruleOperadorLogico
                    {

                    						newCompositeNode(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_operador_5_0=ruleOperadorLogico();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
                    						}
                    						set(
                    							current,
                    							"operador",
                    							lv_operador_5_0,
                    							"org.xtext.blockchain.MyDsl.OperadorLogico");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getExpresionLogicaAccess().getLadoIzqKeyword_4());
            		
            // InternalMyDsl.g:1173:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1174:4: ( ruleEString )
            {
            // InternalMyDsl.g:1174:4: ( ruleEString )
            // InternalMyDsl.g:1175:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionLogicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getLadoIzqSentenciaCrossReference_5_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getExpresionLogicaAccess().getLadoDerKeyword_6());
            		
            // InternalMyDsl.g:1193:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1194:4: ( ruleEString )
            {
            // InternalMyDsl.g:1194:4: ( ruleEString )
            // InternalMyDsl.g:1195:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionLogicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getLadoDerSentenciaCrossReference_7_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getExpresionLogicaAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMyDsl.g:1217:1: entryRuleExpresionAritmetica returns [EObject current=null] : iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF ;
    public final EObject entryRuleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionAritmetica = null;


        try {
            // InternalMyDsl.g:1217:60: (iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF )
            // InternalMyDsl.g:1218:2: iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF
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
    // InternalMyDsl.g:1224:1: ruleExpresionAritmetica returns [EObject current=null] : ( () otherlv_1= 'ExpArit' ( ( ruleEString ) ) ( (lv_operador_3_0= ruleOperador ) )+ ( ( ruleEString ) ) ) ;
    public final EObject ruleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_operador_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1230:2: ( ( () otherlv_1= 'ExpArit' ( ( ruleEString ) ) ( (lv_operador_3_0= ruleOperador ) )+ ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:1231:2: ( () otherlv_1= 'ExpArit' ( ( ruleEString ) ) ( (lv_operador_3_0= ruleOperador ) )+ ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:1231:2: ( () otherlv_1= 'ExpArit' ( ( ruleEString ) ) ( (lv_operador_3_0= ruleOperador ) )+ ( ( ruleEString ) ) )
            // InternalMyDsl.g:1232:3: () otherlv_1= 'ExpArit' ( ( ruleEString ) ) ( (lv_operador_3_0= ruleOperador ) )+ ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1232:3: ()
            // InternalMyDsl.g:1233:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1());
            		
            // InternalMyDsl.g:1243:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1244:4: ( ruleEString )
            {
            // InternalMyDsl.g:1244:4: ( ruleEString )
            // InternalMyDsl.g:1245:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionAritmeticaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqSentenciaCrossReference_2_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1259:3: ( (lv_operador_3_0= ruleOperador ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47||(LA26_0>=60 && LA26_0<=65)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1260:4: (lv_operador_3_0= ruleOperador )
            	    {
            	    // InternalMyDsl.g:1260:4: (lv_operador_3_0= ruleOperador )
            	    // InternalMyDsl.g:1261:5: lv_operador_3_0= ruleOperador
            	    {

            	    					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_operador_3_0=ruleOperador();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
            	    					}
            	    					set(
            	    						current,
            	    						"operador",
            	    						lv_operador_3_0,
            	    						"org.xtext.blockchain.MyDsl.Operador");
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

            // InternalMyDsl.g:1278:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1279:4: ( ruleEString )
            {
            // InternalMyDsl.g:1279:4: ( ruleEString )
            // InternalMyDsl.g:1280:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionAritmeticaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getLadoDerSentenciaCrossReference_4_0());
            				
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
    // $ANTLR end "ruleExpresionAritmetica"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:1298:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:1298:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:1299:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMyDsl.g:1305:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tipodato' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1311:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tipodato' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1312:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tipodato' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1312:2: (otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tipodato' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1313:3: otherlv_0= 'Variable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'tipodato' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalMyDsl.g:1317:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1318:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1318:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1319:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.blockchain.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getTipodatoKeyword_3());
            		
            // InternalMyDsl.g:1344:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1345:4: ( ruleEString )
            {
            // InternalMyDsl.g:1345:4: ( ruleEString )
            // InternalMyDsl.g:1346:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:1368:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalMyDsl.g:1368:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalMyDsl.g:1369:2: iv_ruleCondicional= ruleCondicional EOF
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
    // InternalMyDsl.g:1375:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_tipoCondicional_3_0 = null;

        EObject lv_expresionlogica_5_0 = null;

        EObject lv_sentencias_8_0 = null;

        EObject lv_sentencias_10_0 = null;

        EObject lv_else_14_0 = null;

        EObject lv_else_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1381:2: ( (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalMyDsl.g:1382:2: (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalMyDsl.g:1382:2: (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalMyDsl.g:1383:3: otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getCondicionalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1391:3: (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1392:4: otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getCondicionalAccess().getTipoCondicionalKeyword_2_0());
                    			
                    // InternalMyDsl.g:1396:4: ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) )
                    // InternalMyDsl.g:1397:5: (lv_tipoCondicional_3_0= ruleTipoCondicion )
                    {
                    // InternalMyDsl.g:1397:5: (lv_tipoCondicional_3_0= ruleTipoCondicion )
                    // InternalMyDsl.g:1398:6: lv_tipoCondicional_3_0= ruleTipoCondicion
                    {

                    						newCompositeNode(grammarAccess.getCondicionalAccess().getTipoCondicionalTipoCondicionEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_tipoCondicional_3_0=ruleTipoCondicion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    						}
                    						set(
                    							current,
                    							"tipoCondicional",
                    							lv_tipoCondicional_3_0,
                    							"org.xtext.blockchain.MyDsl.TipoCondicion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getCondicionalAccess().getExpresionlogicaKeyword_3());
            		
            // InternalMyDsl.g:1420:3: ( (lv_expresionlogica_5_0= ruleExpresionLogica ) )
            // InternalMyDsl.g:1421:4: (lv_expresionlogica_5_0= ruleExpresionLogica )
            {
            // InternalMyDsl.g:1421:4: (lv_expresionlogica_5_0= ruleExpresionLogica )
            // InternalMyDsl.g:1422:5: lv_expresionlogica_5_0= ruleExpresionLogica
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
            lv_expresionlogica_5_0=ruleExpresionLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"expresionlogica",
            						lv_expresionlogica_5_0,
            						"org.xtext.blockchain.MyDsl.ExpresionLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getSentenciasKeyword_5());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1447:3: ( (lv_sentencias_8_0= ruleSentencia ) )
            // InternalMyDsl.g:1448:4: (lv_sentencias_8_0= ruleSentencia )
            {
            // InternalMyDsl.g:1448:4: (lv_sentencias_8_0= ruleSentencia )
            // InternalMyDsl.g:1449:5: lv_sentencias_8_0= ruleSentencia
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_43);
            lv_sentencias_8_0=ruleSentencia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					add(
            						current,
            						"sentencias",
            						lv_sentencias_8_0,
            						"org.xtext.blockchain.MyDsl.Sentencia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1466:3: (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1467:4: otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_42); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCondicionalAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:1471:4: ( (lv_sentencias_10_0= ruleSentencia ) )
            	    // InternalMyDsl.g:1472:5: (lv_sentencias_10_0= ruleSentencia )
            	    {
            	    // InternalMyDsl.g:1472:5: (lv_sentencias_10_0= ruleSentencia )
            	    // InternalMyDsl.g:1473:6: lv_sentencias_10_0= ruleSentencia
            	    {

            	    						newCompositeNode(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_sentencias_10_0=ruleSentencia();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sentencias",
            	    							lv_sentencias_10_0,
            	    							"org.xtext.blockchain.MyDsl.Sentencia");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_44); 

            			newLeafNode(otherlv_11, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:1495:3: (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1496:4: otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCondicionalAccess().getElseKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_13, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyDsl.g:1504:4: ( (lv_else_14_0= ruleCondicional ) )
                    // InternalMyDsl.g:1505:5: (lv_else_14_0= ruleCondicional )
                    {
                    // InternalMyDsl.g:1505:5: (lv_else_14_0= ruleCondicional )
                    // InternalMyDsl.g:1506:6: lv_else_14_0= ruleCondicional
                    {

                    						newCompositeNode(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_else_14_0=ruleCondicional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    						}
                    						add(
                    							current,
                    							"else",
                    							lv_else_14_0,
                    							"org.xtext.blockchain.MyDsl.Condicional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1523:4: (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==13) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:1524:5: otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_45); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCondicionalAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMyDsl.g:1528:5: ( (lv_else_16_0= ruleCondicional ) )
                    	    // InternalMyDsl.g:1529:6: (lv_else_16_0= ruleCondicional )
                    	    {
                    	    // InternalMyDsl.g:1529:6: (lv_else_16_0= ruleCondicional )
                    	    // InternalMyDsl.g:1530:7: lv_else_16_0= ruleCondicional
                    	    {

                    	    							newCompositeNode(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    lv_else_16_0=ruleCondicional();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"else",
                    	    								lv_else_16_0,
                    	    								"org.xtext.blockchain.MyDsl.Condicional");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_17, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalMyDsl.g:1561:1: entryRuleExpresionNumerica returns [EObject current=null] : iv_ruleExpresionNumerica= ruleExpresionNumerica EOF ;
    public final EObject entryRuleExpresionNumerica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionNumerica = null;


        try {
            // InternalMyDsl.g:1561:58: (iv_ruleExpresionNumerica= ruleExpresionNumerica EOF )
            // InternalMyDsl.g:1562:2: iv_ruleExpresionNumerica= ruleExpresionNumerica EOF
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
    // InternalMyDsl.g:1568:1: ruleExpresionNumerica returns [EObject current=null] : ( () otherlv_1= 'ExpresionNumerica' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleExpresionNumerica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1574:2: ( ( () otherlv_1= 'ExpresionNumerica' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1575:2: ( () otherlv_1= 'ExpresionNumerica' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1575:2: ( () otherlv_1= 'ExpresionNumerica' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1576:3: () otherlv_1= 'ExpresionNumerica' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1576:3: ()
            // InternalMyDsl.g:1577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionNumericaAccess().getExpresionNumericaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getExpresionNumericaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1591:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1592:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpresionNumericaAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDsl.g:1596:4: ( (lv_value_4_0= ruleEDouble ) )
                    // InternalMyDsl.g:1597:5: (lv_value_4_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:1597:5: (lv_value_4_0= ruleEDouble )
                    // InternalMyDsl.g:1598:6: lv_value_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_value_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionNumericaRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.blockchain.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExpresionNumericaAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:1624:1: entryRuleExpresionTexto returns [EObject current=null] : iv_ruleExpresionTexto= ruleExpresionTexto EOF ;
    public final EObject entryRuleExpresionTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionTexto = null;


        try {
            // InternalMyDsl.g:1624:55: (iv_ruleExpresionTexto= ruleExpresionTexto EOF )
            // InternalMyDsl.g:1625:2: iv_ruleExpresionTexto= ruleExpresionTexto EOF
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
    // InternalMyDsl.g:1631:1: ruleExpresionTexto returns [EObject current=null] : ( () otherlv_1= 'ExpresionTexto' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleExpresionTexto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1637:2: ( ( () otherlv_1= 'ExpresionTexto' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1638:2: ( () otherlv_1= 'ExpresionTexto' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1638:2: ( () otherlv_1= 'ExpresionTexto' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1639:3: () otherlv_1= 'ExpresionTexto' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1639:3: ()
            // InternalMyDsl.g:1640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionTextoAccess().getExpresionTextoKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getExpresionTextoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1654:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1655:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpresionTextoAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDsl.g:1659:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalMyDsl.g:1660:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1660:5: (lv_value_4_0= ruleEString )
                    // InternalMyDsl.g:1661:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionTextoRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.blockchain.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExpresionTextoAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:1687:1: entryRuleExpresionBoolean returns [EObject current=null] : iv_ruleExpresionBoolean= ruleExpresionBoolean EOF ;
    public final EObject entryRuleExpresionBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionBoolean = null;


        try {
            // InternalMyDsl.g:1687:57: (iv_ruleExpresionBoolean= ruleExpresionBoolean EOF )
            // InternalMyDsl.g:1688:2: iv_ruleExpresionBoolean= ruleExpresionBoolean EOF
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
    // InternalMyDsl.g:1694:1: ruleExpresionBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'ExpresionBoolean' ) ;
    public final EObject ruleExpresionBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1700:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'ExpresionBoolean' ) )
            // InternalMyDsl.g:1701:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'ExpresionBoolean' )
            {
            // InternalMyDsl.g:1701:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'ExpresionBoolean' )
            // InternalMyDsl.g:1702:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'ExpresionBoolean'
            {
            // InternalMyDsl.g:1702:3: ()
            // InternalMyDsl.g:1703:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1709:3: ( (lv_value_1_0= 'value' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1710:4: (lv_value_1_0= 'value' )
                    {
                    // InternalMyDsl.g:1710:4: (lv_value_1_0= 'value' )
                    // InternalMyDsl.g:1711:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,41,FOLLOW_48); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getExpresionBooleanAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionBooleanRule());
                    					}
                    					setWithLastConsumed(current, "value", true, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExpresionBooleanAccess().getExpresionBooleanKeyword_2());
            		

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
    // InternalMyDsl.g:1731:1: entryRuleExpresionReferenciada returns [EObject current=null] : iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF ;
    public final EObject entryRuleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionReferenciada = null;


        try {
            // InternalMyDsl.g:1731:62: (iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF )
            // InternalMyDsl.g:1732:2: iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF
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
    // InternalMyDsl.g:1738:1: ruleExpresionReferenciada returns [EObject current=null] : ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? ) ;
    public final EObject ruleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1744:2: ( ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? ) )
            // InternalMyDsl.g:1745:2: ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? )
            {
            // InternalMyDsl.g:1745:2: ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? )
            // InternalMyDsl.g:1746:3: () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )?
            {
            // InternalMyDsl.g:1746:3: ()
            // InternalMyDsl.g:1747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionReferenciadaAccess().getExpresionReferenciadaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_1());
            		
            // InternalMyDsl.g:1757:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1758:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0());
                    			
                    // InternalMyDsl.g:1762:4: ( (lv_id_3_0= ruleEInt ) )
                    // InternalMyDsl.g:1763:5: (lv_id_3_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1763:5: (lv_id_3_0= ruleEInt )
                    // InternalMyDsl.g:1764:6: lv_id_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionReferenciadaRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"org.xtext.blockchain.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1782:3: ( ( ruleEString ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1783:4: ( ruleEString )
                    {
                    // InternalMyDsl.g:1783:4: ( ruleEString )
                    // InternalMyDsl.g:1784:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionReferenciadaRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaEntidadCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_50);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1798:3: ( ( ruleEString ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1799:4: ( ruleEString )
                    {
                    // InternalMyDsl.g:1799:4: ( ruleEString )
                    // InternalMyDsl.g:1800:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionReferenciadaRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAtributoCrossReference_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleExpresionReferenciada"


    // $ANTLR start "entryRuleExpresionRelacional"
    // InternalMyDsl.g:1818:1: entryRuleExpresionRelacional returns [EObject current=null] : iv_ruleExpresionRelacional= ruleExpresionRelacional EOF ;
    public final EObject entryRuleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionRelacional = null;


        try {
            // InternalMyDsl.g:1818:60: (iv_ruleExpresionRelacional= ruleExpresionRelacional EOF )
            // InternalMyDsl.g:1819:2: iv_ruleExpresionRelacional= ruleExpresionRelacional EOF
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
    // InternalMyDsl.g:1825:1: ruleExpresionRelacional returns [EObject current=null] : (otherlv_0= 'ExpresionRelacional' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operadorRelacional' ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        Enumerator lv_operadorRelacional_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1831:2: ( (otherlv_0= 'ExpresionRelacional' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operadorRelacional' ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1832:2: (otherlv_0= 'ExpresionRelacional' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operadorRelacional' ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1832:2: (otherlv_0= 'ExpresionRelacional' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operadorRelacional' ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1833:3: otherlv_0= 'ExpresionRelacional' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? (otherlv_4= 'operadorRelacional' ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) ) )? otherlv_6= 'ladoIzq' ( ( ruleEString ) ) otherlv_8= 'ladoDer' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionRelacionalAccess().getExpresionRelacionalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionRelacionalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1841:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1842:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionRelacionalAccess().getIdKeyword_2_0());
                    			
                    // InternalMyDsl.g:1846:4: ( (lv_id_3_0= ruleEInt ) )
                    // InternalMyDsl.g:1847:5: (lv_id_3_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1847:5: (lv_id_3_0= ruleEInt )
                    // InternalMyDsl.g:1848:6: lv_id_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getIdEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"org.xtext.blockchain.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1866:3: (otherlv_4= 'operadorRelacional' ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1867:4: otherlv_4= 'operadorRelacional' ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_53); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalKeyword_3_0());
                    			
                    // InternalMyDsl.g:1871:4: ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )
                    // InternalMyDsl.g:1872:5: (lv_operadorRelacional_5_0= ruleOperadorRelacion )
                    {
                    // InternalMyDsl.g:1872:5: (lv_operadorRelacional_5_0= ruleOperadorRelacion )
                    // InternalMyDsl.g:1873:6: lv_operadorRelacional_5_0= ruleOperadorRelacion
                    {

                    						newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_operadorRelacional_5_0=ruleOperadorRelacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
                    						}
                    						set(
                    							current,
                    							"operadorRelacional",
                    							lv_operadorRelacional_5_0,
                    							"org.xtext.blockchain.MyDsl.OperadorRelacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getExpresionRelacionalAccess().getLadoIzqKeyword_4());
            		
            // InternalMyDsl.g:1895:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1896:4: ( ruleEString )
            {
            // InternalMyDsl.g:1896:4: ( ruleEString )
            // InternalMyDsl.g:1897:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionRelacionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getLadoIzqSentenciaCrossReference_5_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getExpresionRelacionalAccess().getLadoDerKeyword_6());
            		
            // InternalMyDsl.g:1915:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1916:4: ( ruleEString )
            {
            // InternalMyDsl.g:1916:4: ( ruleEString )
            // InternalMyDsl.g:1917:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionRelacionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getLadoDerSentenciaCrossReference_7_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getExpresionRelacionalAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1939:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1939:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1940:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1946:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1952:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1953:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1953:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1954:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1954:3: (kw= '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1955:4: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_54); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:1972:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:1972:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:1973:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalMyDsl.g:1979:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1985:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:1986:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:1986:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:1987:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:1987:3: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1988:4: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1994:3: (this_INT_1= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1995:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_53); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_54); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_56); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:2015:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=49 && LA44_0<=50)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2016:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:2016:4: (kw= 'E' | kw= 'e' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==49) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==50) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMyDsl.g:2017:5: kw= 'E'
                            {
                            kw=(Token)match(input,49,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:2023:5: kw= 'e'
                            {
                            kw=(Token)match(input,50,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:2029:4: (kw= '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==47) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyDsl.g:2030:5: kw= '-'
                            {
                            kw=(Token)match(input,47,FOLLOW_54); 

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
    // InternalMyDsl.g:2048:1: entryRulePrimitivo returns [EObject current=null] : iv_rulePrimitivo= rulePrimitivo EOF ;
    public final EObject entryRulePrimitivo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivo = null;


        try {
            // InternalMyDsl.g:2048:50: (iv_rulePrimitivo= rulePrimitivo EOF )
            // InternalMyDsl.g:2049:2: iv_rulePrimitivo= rulePrimitivo EOF
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
    // InternalMyDsl.g:2055:1: rulePrimitivo returns [EObject current=null] : ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePrimitivo() throws RecognitionException {
        EObject current = null;

        Enumerator lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2061:2: ( ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:2062:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:2062:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:2063:3: () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:2063:3: ()
            // InternalMyDsl.g:2064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitivoAccess().getPrimitivoAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2070:3: ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=67 && LA45_0<=69)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:2071:4: (lv_tipo_1_0= ruleDatoPrimitivo )
            	    {
            	    // InternalMyDsl.g:2071:4: (lv_tipo_1_0= ruleDatoPrimitivo )
            	    // InternalMyDsl.g:2072:5: lv_tipo_1_0= ruleDatoPrimitivo
            	    {

            	    					newCompositeNode(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_57);
            	    lv_tipo_1_0=ruleDatoPrimitivo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrimitivoRule());
            	    					}
            	    					set(
            	    						current,
            	    						"tipo",
            	    						lv_tipo_1_0,
            	    						"org.xtext.blockchain.MyDsl.DatoPrimitivo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // InternalMyDsl.g:2089:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2090:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2090:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2091:5: lv_name_2_0= ruleEString
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
            						"org.xtext.blockchain.MyDsl.EString");
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
    // InternalMyDsl.g:2112:1: entryRuleMapa returns [EObject current=null] : iv_ruleMapa= ruleMapa EOF ;
    public final EObject entryRuleMapa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapa = null;


        try {
            // InternalMyDsl.g:2112:45: (iv_ruleMapa= ruleMapa EOF )
            // InternalMyDsl.g:2113:2: iv_ruleMapa= ruleMapa EOF
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
    // InternalMyDsl.g:2119:1: ruleMapa returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' ) ;
    public final EObject ruleMapa() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2125:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' ) )
            // InternalMyDsl.g:2126:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' )
            {
            // InternalMyDsl.g:2126:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' )
            // InternalMyDsl.g:2127:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>'
            {
            // InternalMyDsl.g:2127:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:2128:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:2128:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:2129:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_58);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.blockchain.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getMapaAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getMapaAccess().getMapKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMapaAccess().getLessThanSignKeyword_3());
            		
            // InternalMyDsl.g:2158:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2159:4: ( ruleEString )
            {
            // InternalMyDsl.g:2159:4: ( ruleEString )
            // InternalMyDsl.g:2160:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_4_0());
            				
            pushFollow(FOLLOW_61);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMapaAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:2178:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2179:4: ( ruleEString )
            {
            // InternalMyDsl.g:2179:4: ( ruleEString )
            // InternalMyDsl.g:2180:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_6_0());
            				
            pushFollow(FOLLOW_62);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMapaAccess().getGreaterThanSignKeyword_7());
            		

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
    // InternalMyDsl.g:2202:1: ruleOperadorLogico returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) ;
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
            // InternalMyDsl.g:2208:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) )
            // InternalMyDsl.g:2209:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            {
            // InternalMyDsl.g:2209:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            int alt46=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt46=1;
                }
                break;
            case 55:
                {
                alt46=2;
                }
                break;
            case 53:
                {
                alt46=3;
                }
                break;
            case 52:
                {
                alt46=4;
                }
                break;
            case 56:
                {
                alt46=5;
                }
                break;
            case 57:
                {
                alt46=6;
                }
                break;
            case 58:
                {
                alt46=7;
                }
                break;
            case 59:
                {
                alt46=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2210:3: (enumLiteral_0= '==' )
                    {
                    // InternalMyDsl.g:2210:3: (enumLiteral_0= '==' )
                    // InternalMyDsl.g:2211:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2218:3: (enumLiteral_1= '!=' )
                    {
                    // InternalMyDsl.g:2218:3: (enumLiteral_1= '!=' )
                    // InternalMyDsl.g:2219:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2226:3: (enumLiteral_2= '>' )
                    {
                    // InternalMyDsl.g:2226:3: (enumLiteral_2= '>' )
                    // InternalMyDsl.g:2227:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2234:3: (enumLiteral_3= '<' )
                    {
                    // InternalMyDsl.g:2234:3: (enumLiteral_3= '<' )
                    // InternalMyDsl.g:2235:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2242:3: (enumLiteral_4= '>=' )
                    {
                    // InternalMyDsl.g:2242:3: (enumLiteral_4= '>=' )
                    // InternalMyDsl.g:2243:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2250:3: (enumLiteral_5= '<=' )
                    {
                    // InternalMyDsl.g:2250:3: (enumLiteral_5= '<=' )
                    // InternalMyDsl.g:2251:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2258:3: (enumLiteral_6= '&&' )
                    {
                    // InternalMyDsl.g:2258:3: (enumLiteral_6= '&&' )
                    // InternalMyDsl.g:2259:4: enumLiteral_6= '&&'
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2266:3: (enumLiteral_7= '||' )
                    {
                    // InternalMyDsl.g:2266:3: (enumLiteral_7= '||' )
                    // InternalMyDsl.g:2267:4: enumLiteral_7= '||'
                    {
                    enumLiteral_7=(Token)match(input,59,FOLLOW_2); 

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
    // InternalMyDsl.g:2277:1: ruleOperador returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) ) ;
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
            // InternalMyDsl.g:2283:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) ) )
            // InternalMyDsl.g:2284:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) )
            {
            // InternalMyDsl.g:2284:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) )
            int alt47=7;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt47=1;
                }
                break;
            case 47:
                {
                alt47=2;
                }
                break;
            case 61:
                {
                alt47=3;
                }
                break;
            case 62:
                {
                alt47=4;
                }
                break;
            case 63:
                {
                alt47=5;
                }
                break;
            case 64:
                {
                alt47=6;
                }
                break;
            case 65:
                {
                alt47=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2285:3: (enumLiteral_0= '+' )
                    {
                    // InternalMyDsl.g:2285:3: (enumLiteral_0= '+' )
                    // InternalMyDsl.g:2286:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2293:3: (enumLiteral_1= '-' )
                    {
                    // InternalMyDsl.g:2293:3: (enumLiteral_1= '-' )
                    // InternalMyDsl.g:2294:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2301:3: (enumLiteral_2= '*' )
                    {
                    // InternalMyDsl.g:2301:3: (enumLiteral_2= '*' )
                    // InternalMyDsl.g:2302:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2309:3: (enumLiteral_3= '/' )
                    {
                    // InternalMyDsl.g:2309:3: (enumLiteral_3= '/' )
                    // InternalMyDsl.g:2310:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2317:3: (enumLiteral_4= '=' )
                    {
                    // InternalMyDsl.g:2317:3: (enumLiteral_4= '=' )
                    // InternalMyDsl.g:2318:4: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2325:3: (enumLiteral_5= 'GET' )
                    {
                    // InternalMyDsl.g:2325:3: (enumLiteral_5= 'GET' )
                    // InternalMyDsl.g:2326:4: enumLiteral_5= 'GET'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2333:3: (enumLiteral_6= 'DELETE' )
                    {
                    // InternalMyDsl.g:2333:3: (enumLiteral_6= 'DELETE' )
                    // InternalMyDsl.g:2334:4: enumLiteral_6= 'DELETE'
                    {
                    enumLiteral_6=(Token)match(input,65,FOLLOW_2); 

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


    // $ANTLR start "ruleTipoCondicion"
    // InternalMyDsl.g:2344:1: ruleTipoCondicion returns [Enumerator current=null] : ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) ) ;
    public final Enumerator ruleTipoCondicion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2350:2: ( ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) ) )
            // InternalMyDsl.g:2351:2: ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) )
            {
            // InternalMyDsl.g:2351:2: ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==66) ) {
                alt48=1;
            }
            else if ( (LA48_0==39) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2352:3: (enumLiteral_0= 'if' )
                    {
                    // InternalMyDsl.g:2352:3: (enumLiteral_0= 'if' )
                    // InternalMyDsl.g:2353:4: enumLiteral_0= 'if'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTipoCondicionAccess().getIFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoCondicionAccess().getIFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2360:3: (enumLiteral_1= 'else' )
                    {
                    // InternalMyDsl.g:2360:3: (enumLiteral_1= 'else' )
                    // InternalMyDsl.g:2361:4: enumLiteral_1= 'else'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTipoCondicionAccess().getELSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoCondicionAccess().getELSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTipoCondicion"


    // $ANTLR start "ruleOperadorRelacion"
    // InternalMyDsl.g:2371:1: ruleOperadorRelacion returns [Enumerator current=null] : (enumLiteral_0= '.' ) ;
    public final Enumerator ruleOperadorRelacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2377:2: ( (enumLiteral_0= '.' ) )
            // InternalMyDsl.g:2378:2: (enumLiteral_0= '.' )
            {
            // InternalMyDsl.g:2378:2: (enumLiteral_0= '.' )
            // InternalMyDsl.g:2379:3: enumLiteral_0= '.'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

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
    // InternalMyDsl.g:2388:1: ruleDatoPrimitivo returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) ) ;
    public final Enumerator ruleDatoPrimitivo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2394:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) ) )
            // InternalMyDsl.g:2395:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) )
            {
            // InternalMyDsl.g:2395:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt49=1;
                }
                break;
            case 68:
                {
                alt49=2;
                }
                break;
            case 69:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2396:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalMyDsl.g:2396:3: (enumLiteral_0= 'STRING' )
                    // InternalMyDsl.g:2397:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2404:3: (enumLiteral_1= 'NUMERICO' )
                    {
                    // InternalMyDsl.g:2404:3: (enumLiteral_1= 'NUMERICO' )
                    // InternalMyDsl.g:2405:4: enumLiteral_1= 'NUMERICO'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2412:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalMyDsl.g:2412:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalMyDsl.g:2413:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

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


    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\3\2\4\6\uffff";
    static final String dfa_3s = "\3\4\2\uffff\4\4";
    static final String dfa_4s = "\3\55\2\uffff\4\55";
    static final String dfa_5s = "\3\uffff\1\2\1\1\4\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\7\uffff\1\3\1\uffff\1\3\10\uffff\1\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3\4\uffff\6\3",
            "\1\5\1\6\7\uffff\1\4\1\uffff\1\4\10\uffff\1\4\2\uffff\1\4\4\uffff\2\4\1\uffff\1\4\4\uffff\6\4",
            "\1\5\1\6\7\uffff\1\4\1\uffff\1\4\10\uffff\1\4\2\uffff\1\4\4\uffff\2\4\1\uffff\1\4\4\uffff\6\4",
            "",
            "",
            "\1\7\1\10\11\uffff\1\3\10\uffff\1\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3\4\uffff\6\3",
            "\1\7\1\10\11\uffff\1\3\10\uffff\1\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3\4\uffff\6\3",
            "\1\5\1\6\11\uffff\1\4\10\uffff\1\4\2\uffff\1\4\4\uffff\2\4\1\uffff\1\4\4\uffff\6\4",
            "\1\5\1\6\11\uffff\1\4\10\uffff\1\4\2\uffff\1\4\4\uffff\2\4\1\uffff\1\4\4\uffff\6\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1798:3: ( ( ruleEString ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020030L,0x0000000000000038L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000106A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000104A000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00003F0B09808030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00003F0B09008030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0FF0000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF000800000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xF000800000000030L,0x0000000000000003L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00003F0B09000030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001800000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400050000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000038L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000000000L});

}