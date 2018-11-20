package uniandes.mdd.aplicacion.blockchain.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uniandes.mdd.aplicacion.blockchain.services.BlockchainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlockchainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'true'", "'false'", "'E'", "'e'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'PUT'", "'String'", "'Integer'", "'Boolean'", "'ADDRESS'", "'Double'", "'Aplicacion'", "'{'", "'}'", "'tipodato'", "'SmartContract'", "'Entidad'", "'Operacion'", "'('", "')'", "'isUd='", "','", "':'", "'Estado'", "'ExpLog'", "'ExpArit'", "'var'", "'if'", "'else'", "'ExpNum'", "'ExpNumDouble'", "'ExpTex'", "'ExpBool'", "'ExpRef'", "'id'", "'ExpRel'", "'return'", "'Map'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
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

    	public void setGrammarAccess(BlockchainGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAplicacion"
    // InternalBlockchain.g:53:1: entryRuleAplicacion : ruleAplicacion EOF ;
    public final void entryRuleAplicacion() throws RecognitionException {
        try {
            // InternalBlockchain.g:54:1: ( ruleAplicacion EOF )
            // InternalBlockchain.g:55:1: ruleAplicacion EOF
            {
             before(grammarAccess.getAplicacionRule()); 
            pushFollow(FOLLOW_1);
            ruleAplicacion();

            state._fsp--;

             after(grammarAccess.getAplicacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAplicacion"


    // $ANTLR start "ruleAplicacion"
    // InternalBlockchain.g:62:1: ruleAplicacion : ( ( rule__Aplicacion__Group__0 ) ) ;
    public final void ruleAplicacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:66:2: ( ( ( rule__Aplicacion__Group__0 ) ) )
            // InternalBlockchain.g:67:2: ( ( rule__Aplicacion__Group__0 ) )
            {
            // InternalBlockchain.g:67:2: ( ( rule__Aplicacion__Group__0 ) )
            // InternalBlockchain.g:68:3: ( rule__Aplicacion__Group__0 )
            {
             before(grammarAccess.getAplicacionAccess().getGroup()); 
            // InternalBlockchain.g:69:3: ( rule__Aplicacion__Group__0 )
            // InternalBlockchain.g:69:4: rule__Aplicacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAplicacion"


    // $ANTLR start "entryRuleTipoDato"
    // InternalBlockchain.g:78:1: entryRuleTipoDato : ruleTipoDato EOF ;
    public final void entryRuleTipoDato() throws RecognitionException {
        try {
            // InternalBlockchain.g:79:1: ( ruleTipoDato EOF )
            // InternalBlockchain.g:80:1: ruleTipoDato EOF
            {
             before(grammarAccess.getTipoDatoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getTipoDatoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoDato"


    // $ANTLR start "ruleTipoDato"
    // InternalBlockchain.g:87:1: ruleTipoDato : ( ( rule__TipoDato__Alternatives ) ) ;
    public final void ruleTipoDato() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:91:2: ( ( ( rule__TipoDato__Alternatives ) ) )
            // InternalBlockchain.g:92:2: ( ( rule__TipoDato__Alternatives ) )
            {
            // InternalBlockchain.g:92:2: ( ( rule__TipoDato__Alternatives ) )
            // InternalBlockchain.g:93:3: ( rule__TipoDato__Alternatives )
            {
             before(grammarAccess.getTipoDatoAccess().getAlternatives()); 
            // InternalBlockchain.g:94:3: ( rule__TipoDato__Alternatives )
            // InternalBlockchain.g:94:4: rule__TipoDato__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoDato__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoDatoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "entryRuleLinea"
    // InternalBlockchain.g:103:1: entryRuleLinea : ruleLinea EOF ;
    public final void entryRuleLinea() throws RecognitionException {
        try {
            // InternalBlockchain.g:104:1: ( ruleLinea EOF )
            // InternalBlockchain.g:105:1: ruleLinea EOF
            {
             before(grammarAccess.getLineaRule()); 
            pushFollow(FOLLOW_1);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getLineaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinea"


    // $ANTLR start "ruleLinea"
    // InternalBlockchain.g:112:1: ruleLinea : ( ( rule__Linea__Alternatives ) ) ;
    public final void ruleLinea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:116:2: ( ( ( rule__Linea__Alternatives ) ) )
            // InternalBlockchain.g:117:2: ( ( rule__Linea__Alternatives ) )
            {
            // InternalBlockchain.g:117:2: ( ( rule__Linea__Alternatives ) )
            // InternalBlockchain.g:118:3: ( rule__Linea__Alternatives )
            {
             before(grammarAccess.getLineaAccess().getAlternatives()); 
            // InternalBlockchain.g:119:3: ( rule__Linea__Alternatives )
            // InternalBlockchain.g:119:4: rule__Linea__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Linea__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinea"


    // $ANTLR start "entryRuleExpresion"
    // InternalBlockchain.g:128:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalBlockchain.g:129:1: ( ruleExpresion EOF )
            // InternalBlockchain.g:130:1: ruleExpresion EOF
            {
             before(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalBlockchain.g:137:1: ruleExpresion : ( ( rule__Expresion__Alternatives ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:141:2: ( ( ( rule__Expresion__Alternatives ) ) )
            // InternalBlockchain.g:142:2: ( ( rule__Expresion__Alternatives ) )
            {
            // InternalBlockchain.g:142:2: ( ( rule__Expresion__Alternatives ) )
            // InternalBlockchain.g:143:3: ( rule__Expresion__Alternatives )
            {
             before(grammarAccess.getExpresionAccess().getAlternatives()); 
            // InternalBlockchain.g:144:3: ( rule__Expresion__Alternatives )
            // InternalBlockchain.g:144:4: rule__Expresion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleSmartContract"
    // InternalBlockchain.g:153:1: entryRuleSmartContract : ruleSmartContract EOF ;
    public final void entryRuleSmartContract() throws RecognitionException {
        try {
            // InternalBlockchain.g:154:1: ( ruleSmartContract EOF )
            // InternalBlockchain.g:155:1: ruleSmartContract EOF
            {
             before(grammarAccess.getSmartContractRule()); 
            pushFollow(FOLLOW_1);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getSmartContractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmartContract"


    // $ANTLR start "ruleSmartContract"
    // InternalBlockchain.g:162:1: ruleSmartContract : ( ( rule__SmartContract__Group__0 ) ) ;
    public final void ruleSmartContract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:166:2: ( ( ( rule__SmartContract__Group__0 ) ) )
            // InternalBlockchain.g:167:2: ( ( rule__SmartContract__Group__0 ) )
            {
            // InternalBlockchain.g:167:2: ( ( rule__SmartContract__Group__0 ) )
            // InternalBlockchain.g:168:3: ( rule__SmartContract__Group__0 )
            {
             before(grammarAccess.getSmartContractAccess().getGroup()); 
            // InternalBlockchain.g:169:3: ( rule__SmartContract__Group__0 )
            // InternalBlockchain.g:169:4: rule__SmartContract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartContract"


    // $ANTLR start "entryRuleEString"
    // InternalBlockchain.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBlockchain.g:179:1: ( ruleEString EOF )
            // InternalBlockchain.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBlockchain.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBlockchain.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBlockchain.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalBlockchain.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBlockchain.g:194:3: ( rule__EString__Alternatives )
            // InternalBlockchain.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalBlockchain.g:203:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalBlockchain.g:204:1: ( ruleEntidad EOF )
            // InternalBlockchain.g:205:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalBlockchain.g:212:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:216:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalBlockchain.g:217:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalBlockchain.g:217:2: ( ( rule__Entidad__Group__0 ) )
            // InternalBlockchain.g:218:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalBlockchain.g:219:3: ( rule__Entidad__Group__0 )
            // InternalBlockchain.g:219:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleOperacion"
    // InternalBlockchain.g:228:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalBlockchain.g:229:1: ( ruleOperacion EOF )
            // InternalBlockchain.g:230:1: ruleOperacion EOF
            {
             before(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getOperacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalBlockchain.g:237:1: ruleOperacion : ( ( rule__Operacion__Group__0 ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:241:2: ( ( ( rule__Operacion__Group__0 ) ) )
            // InternalBlockchain.g:242:2: ( ( rule__Operacion__Group__0 ) )
            {
            // InternalBlockchain.g:242:2: ( ( rule__Operacion__Group__0 ) )
            // InternalBlockchain.g:243:3: ( rule__Operacion__Group__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup()); 
            // InternalBlockchain.g:244:3: ( rule__Operacion__Group__0 )
            // InternalBlockchain.g:244:4: rule__Operacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleEstado"
    // InternalBlockchain.g:253:1: entryRuleEstado : ruleEstado EOF ;
    public final void entryRuleEstado() throws RecognitionException {
        try {
            // InternalBlockchain.g:254:1: ( ruleEstado EOF )
            // InternalBlockchain.g:255:1: ruleEstado EOF
            {
             before(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getEstadoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalBlockchain.g:262:1: ruleEstado : ( ( rule__Estado__Group__0 ) ) ;
    public final void ruleEstado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:266:2: ( ( ( rule__Estado__Group__0 ) ) )
            // InternalBlockchain.g:267:2: ( ( rule__Estado__Group__0 ) )
            {
            // InternalBlockchain.g:267:2: ( ( rule__Estado__Group__0 ) )
            // InternalBlockchain.g:268:3: ( rule__Estado__Group__0 )
            {
             before(grammarAccess.getEstadoAccess().getGroup()); 
            // InternalBlockchain.g:269:3: ( rule__Estado__Group__0 )
            // InternalBlockchain.g:269:4: rule__Estado__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Estado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleAtributo"
    // InternalBlockchain.g:278:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalBlockchain.g:279:1: ( ruleAtributo EOF )
            // InternalBlockchain.g:280:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalBlockchain.g:287:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:291:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalBlockchain.g:292:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalBlockchain.g:292:2: ( ( rule__Atributo__Group__0 ) )
            // InternalBlockchain.g:293:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalBlockchain.g:294:3: ( rule__Atributo__Group__0 )
            // InternalBlockchain.g:294:4: rule__Atributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleParametro"
    // InternalBlockchain.g:303:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalBlockchain.g:304:1: ( ruleParametro EOF )
            // InternalBlockchain.g:305:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalBlockchain.g:312:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:316:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalBlockchain.g:317:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalBlockchain.g:317:2: ( ( rule__Parametro__Group__0 ) )
            // InternalBlockchain.g:318:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalBlockchain.g:319:3: ( rule__Parametro__Group__0 )
            // InternalBlockchain.g:319:4: rule__Parametro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBlockchain.g:328:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:329:1: ( ruleEBoolean EOF )
            // InternalBlockchain.g:330:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBlockchain.g:337:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:341:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalBlockchain.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalBlockchain.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalBlockchain.g:343:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalBlockchain.g:344:3: ( rule__EBoolean__Alternatives )
            // InternalBlockchain.g:344:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalBlockchain.g:353:1: entryRuleExpresionLogica : ruleExpresionLogica EOF ;
    public final void entryRuleExpresionLogica() throws RecognitionException {
        try {
            // InternalBlockchain.g:354:1: ( ruleExpresionLogica EOF )
            // InternalBlockchain.g:355:1: ruleExpresionLogica EOF
            {
             before(grammarAccess.getExpresionLogicaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionLogica"


    // $ANTLR start "ruleExpresionLogica"
    // InternalBlockchain.g:362:1: ruleExpresionLogica : ( ( rule__ExpresionLogica__Group__0 ) ) ;
    public final void ruleExpresionLogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:366:2: ( ( ( rule__ExpresionLogica__Group__0 ) ) )
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            {
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            // InternalBlockchain.g:368:3: ( rule__ExpresionLogica__Group__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup()); 
            // InternalBlockchain.g:369:3: ( rule__ExpresionLogica__Group__0 )
            // InternalBlockchain.g:369:4: rule__ExpresionLogica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionLogica"


    // $ANTLR start "entryRuleExpresionAritmetica"
    // InternalBlockchain.g:378:1: entryRuleExpresionAritmetica : ruleExpresionAritmetica EOF ;
    public final void entryRuleExpresionAritmetica() throws RecognitionException {
        try {
            // InternalBlockchain.g:379:1: ( ruleExpresionAritmetica EOF )
            // InternalBlockchain.g:380:1: ruleExpresionAritmetica EOF
            {
             before(grammarAccess.getExpresionAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionAritmetica();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionAritmetica"


    // $ANTLR start "ruleExpresionAritmetica"
    // InternalBlockchain.g:387:1: ruleExpresionAritmetica : ( ( rule__ExpresionAritmetica__Group__0 ) ) ;
    public final void ruleExpresionAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:391:2: ( ( ( rule__ExpresionAritmetica__Group__0 ) ) )
            // InternalBlockchain.g:392:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            {
            // InternalBlockchain.g:392:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            // InternalBlockchain.g:393:3: ( rule__ExpresionAritmetica__Group__0 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getGroup()); 
            // InternalBlockchain.g:394:3: ( rule__ExpresionAritmetica__Group__0 )
            // InternalBlockchain.g:394:4: rule__ExpresionAritmetica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionAritmetica"


    // $ANTLR start "entryRuleVariable"
    // InternalBlockchain.g:403:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBlockchain.g:404:1: ( ruleVariable EOF )
            // InternalBlockchain.g:405:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBlockchain.g:412:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:416:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalBlockchain.g:417:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalBlockchain.g:417:2: ( ( rule__Variable__Group__0 ) )
            // InternalBlockchain.g:418:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalBlockchain.g:419:3: ( rule__Variable__Group__0 )
            // InternalBlockchain.g:419:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondicional"
    // InternalBlockchain.g:428:1: entryRuleCondicional : ruleCondicional EOF ;
    public final void entryRuleCondicional() throws RecognitionException {
        try {
            // InternalBlockchain.g:429:1: ( ruleCondicional EOF )
            // InternalBlockchain.g:430:1: ruleCondicional EOF
            {
             before(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            ruleCondicional();

            state._fsp--;

             after(grammarAccess.getCondicionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalBlockchain.g:437:1: ruleCondicional : ( ( rule__Condicional__Group__0 ) ) ;
    public final void ruleCondicional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:441:2: ( ( ( rule__Condicional__Group__0 ) ) )
            // InternalBlockchain.g:442:2: ( ( rule__Condicional__Group__0 ) )
            {
            // InternalBlockchain.g:442:2: ( ( rule__Condicional__Group__0 ) )
            // InternalBlockchain.g:443:3: ( rule__Condicional__Group__0 )
            {
             before(grammarAccess.getCondicionalAccess().getGroup()); 
            // InternalBlockchain.g:444:3: ( rule__Condicional__Group__0 )
            // InternalBlockchain.g:444:4: rule__Condicional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleElse"
    // InternalBlockchain.g:453:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // InternalBlockchain.g:454:1: ( ruleElse EOF )
            // InternalBlockchain.g:455:1: ruleElse EOF
            {
             before(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getElseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalBlockchain.g:462:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:466:2: ( ( ( rule__Else__Group__0 ) ) )
            // InternalBlockchain.g:467:2: ( ( rule__Else__Group__0 ) )
            {
            // InternalBlockchain.g:467:2: ( ( rule__Else__Group__0 ) )
            // InternalBlockchain.g:468:3: ( rule__Else__Group__0 )
            {
             before(grammarAccess.getElseAccess().getGroup()); 
            // InternalBlockchain.g:469:3: ( rule__Else__Group__0 )
            // InternalBlockchain.g:469:4: rule__Else__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleExpresionNumericaInt"
    // InternalBlockchain.g:478:1: entryRuleExpresionNumericaInt : ruleExpresionNumericaInt EOF ;
    public final void entryRuleExpresionNumericaInt() throws RecognitionException {
        try {
            // InternalBlockchain.g:479:1: ( ruleExpresionNumericaInt EOF )
            // InternalBlockchain.g:480:1: ruleExpresionNumericaInt EOF
            {
             before(grammarAccess.getExpresionNumericaIntRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionNumericaInt();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionNumericaInt"


    // $ANTLR start "ruleExpresionNumericaInt"
    // InternalBlockchain.g:487:1: ruleExpresionNumericaInt : ( ( rule__ExpresionNumericaInt__Group__0 ) ) ;
    public final void ruleExpresionNumericaInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:491:2: ( ( ( rule__ExpresionNumericaInt__Group__0 ) ) )
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumericaInt__Group__0 ) )
            {
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumericaInt__Group__0 ) )
            // InternalBlockchain.g:493:3: ( rule__ExpresionNumericaInt__Group__0 )
            {
             before(grammarAccess.getExpresionNumericaIntAccess().getGroup()); 
            // InternalBlockchain.g:494:3: ( rule__ExpresionNumericaInt__Group__0 )
            // InternalBlockchain.g:494:4: rule__ExpresionNumericaInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionNumericaIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionNumericaInt"


    // $ANTLR start "entryRuleExpresionNumericaDouble"
    // InternalBlockchain.g:503:1: entryRuleExpresionNumericaDouble : ruleExpresionNumericaDouble EOF ;
    public final void entryRuleExpresionNumericaDouble() throws RecognitionException {
        try {
            // InternalBlockchain.g:504:1: ( ruleExpresionNumericaDouble EOF )
            // InternalBlockchain.g:505:1: ruleExpresionNumericaDouble EOF
            {
             before(grammarAccess.getExpresionNumericaDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionNumericaDouble();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionNumericaDouble"


    // $ANTLR start "ruleExpresionNumericaDouble"
    // InternalBlockchain.g:512:1: ruleExpresionNumericaDouble : ( ( rule__ExpresionNumericaDouble__Group__0 ) ) ;
    public final void ruleExpresionNumericaDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:516:2: ( ( ( rule__ExpresionNumericaDouble__Group__0 ) ) )
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionNumericaDouble__Group__0 ) )
            {
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionNumericaDouble__Group__0 ) )
            // InternalBlockchain.g:518:3: ( rule__ExpresionNumericaDouble__Group__0 )
            {
             before(grammarAccess.getExpresionNumericaDoubleAccess().getGroup()); 
            // InternalBlockchain.g:519:3: ( rule__ExpresionNumericaDouble__Group__0 )
            // InternalBlockchain.g:519:4: rule__ExpresionNumericaDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionNumericaDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionNumericaDouble"


    // $ANTLR start "entryRuleExpresionTexto"
    // InternalBlockchain.g:528:1: entryRuleExpresionTexto : ruleExpresionTexto EOF ;
    public final void entryRuleExpresionTexto() throws RecognitionException {
        try {
            // InternalBlockchain.g:529:1: ( ruleExpresionTexto EOF )
            // InternalBlockchain.g:530:1: ruleExpresionTexto EOF
            {
             before(grammarAccess.getExpresionTextoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionTexto();

            state._fsp--;

             after(grammarAccess.getExpresionTextoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionTexto"


    // $ANTLR start "ruleExpresionTexto"
    // InternalBlockchain.g:537:1: ruleExpresionTexto : ( ( rule__ExpresionTexto__Group__0 ) ) ;
    public final void ruleExpresionTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:541:2: ( ( ( rule__ExpresionTexto__Group__0 ) ) )
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionTexto__Group__0 ) )
            {
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionTexto__Group__0 ) )
            // InternalBlockchain.g:543:3: ( rule__ExpresionTexto__Group__0 )
            {
             before(grammarAccess.getExpresionTextoAccess().getGroup()); 
            // InternalBlockchain.g:544:3: ( rule__ExpresionTexto__Group__0 )
            // InternalBlockchain.g:544:4: rule__ExpresionTexto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionTextoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionTexto"


    // $ANTLR start "entryRuleExpresionBoolean"
    // InternalBlockchain.g:553:1: entryRuleExpresionBoolean : ruleExpresionBoolean EOF ;
    public final void entryRuleExpresionBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:554:1: ( ruleExpresionBoolean EOF )
            // InternalBlockchain.g:555:1: ruleExpresionBoolean EOF
            {
             before(grammarAccess.getExpresionBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionBoolean();

            state._fsp--;

             after(grammarAccess.getExpresionBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionBoolean"


    // $ANTLR start "ruleExpresionBoolean"
    // InternalBlockchain.g:562:1: ruleExpresionBoolean : ( ( rule__ExpresionBoolean__Group__0 ) ) ;
    public final void ruleExpresionBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:566:2: ( ( ( rule__ExpresionBoolean__Group__0 ) ) )
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            {
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            // InternalBlockchain.g:568:3: ( rule__ExpresionBoolean__Group__0 )
            {
             before(grammarAccess.getExpresionBooleanAccess().getGroup()); 
            // InternalBlockchain.g:569:3: ( rule__ExpresionBoolean__Group__0 )
            // InternalBlockchain.g:569:4: rule__ExpresionBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionBoolean"


    // $ANTLR start "entryRuleExpresionReferenciada"
    // InternalBlockchain.g:578:1: entryRuleExpresionReferenciada : ruleExpresionReferenciada EOF ;
    public final void entryRuleExpresionReferenciada() throws RecognitionException {
        try {
            // InternalBlockchain.g:579:1: ( ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:580:1: ruleExpresionReferenciada EOF
            {
             before(grammarAccess.getExpresionReferenciadaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionReferenciada();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionReferenciada"


    // $ANTLR start "ruleExpresionReferenciada"
    // InternalBlockchain.g:587:1: ruleExpresionReferenciada : ( ( rule__ExpresionReferenciada__Group__0 ) ) ;
    public final void ruleExpresionReferenciada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:591:2: ( ( ( rule__ExpresionReferenciada__Group__0 ) ) )
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            {
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            // InternalBlockchain.g:593:3: ( rule__ExpresionReferenciada__Group__0 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 
            // InternalBlockchain.g:594:3: ( rule__ExpresionReferenciada__Group__0 )
            // InternalBlockchain.g:594:4: rule__ExpresionReferenciada__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionReferenciada"


    // $ANTLR start "entryRuleExpresionRelacional"
    // InternalBlockchain.g:603:1: entryRuleExpresionRelacional : ruleExpresionRelacional EOF ;
    public final void entryRuleExpresionRelacional() throws RecognitionException {
        try {
            // InternalBlockchain.g:604:1: ( ruleExpresionRelacional EOF )
            // InternalBlockchain.g:605:1: ruleExpresionRelacional EOF
            {
             before(grammarAccess.getExpresionRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionRelacional();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionRelacional"


    // $ANTLR start "ruleExpresionRelacional"
    // InternalBlockchain.g:612:1: ruleExpresionRelacional : ( ( rule__ExpresionRelacional__Group__0 ) ) ;
    public final void ruleExpresionRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:616:2: ( ( ( rule__ExpresionRelacional__Group__0 ) ) )
            // InternalBlockchain.g:617:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            {
            // InternalBlockchain.g:617:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            // InternalBlockchain.g:618:3: ( rule__ExpresionRelacional__Group__0 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getGroup()); 
            // InternalBlockchain.g:619:3: ( rule__ExpresionRelacional__Group__0 )
            // InternalBlockchain.g:619:4: rule__ExpresionRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionRelacional"


    // $ANTLR start "entryRuleRetorno"
    // InternalBlockchain.g:628:1: entryRuleRetorno : ruleRetorno EOF ;
    public final void entryRuleRetorno() throws RecognitionException {
        try {
            // InternalBlockchain.g:629:1: ( ruleRetorno EOF )
            // InternalBlockchain.g:630:1: ruleRetorno EOF
            {
             before(grammarAccess.getRetornoRule()); 
            pushFollow(FOLLOW_1);
            ruleRetorno();

            state._fsp--;

             after(grammarAccess.getRetornoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRetorno"


    // $ANTLR start "ruleRetorno"
    // InternalBlockchain.g:637:1: ruleRetorno : ( ( rule__Retorno__Group__0 ) ) ;
    public final void ruleRetorno() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:641:2: ( ( ( rule__Retorno__Group__0 ) ) )
            // InternalBlockchain.g:642:2: ( ( rule__Retorno__Group__0 ) )
            {
            // InternalBlockchain.g:642:2: ( ( rule__Retorno__Group__0 ) )
            // InternalBlockchain.g:643:3: ( rule__Retorno__Group__0 )
            {
             before(grammarAccess.getRetornoAccess().getGroup()); 
            // InternalBlockchain.g:644:3: ( rule__Retorno__Group__0 )
            // InternalBlockchain.g:644:4: rule__Retorno__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Retorno__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRetornoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRetorno"


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:653:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalBlockchain.g:654:1: ( ruleEDouble EOF )
            // InternalBlockchain.g:655:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalBlockchain.g:662:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:666:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalBlockchain.g:667:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalBlockchain.g:667:2: ( ( rule__EDouble__Group__0 ) )
            // InternalBlockchain.g:668:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalBlockchain.g:669:3: ( rule__EDouble__Group__0 )
            // InternalBlockchain.g:669:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalBlockchain.g:678:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBlockchain.g:679:1: ( ruleEInt EOF )
            // InternalBlockchain.g:680:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBlockchain.g:687:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:691:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBlockchain.g:692:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBlockchain.g:692:2: ( ( rule__EInt__Group__0 ) )
            // InternalBlockchain.g:693:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBlockchain.g:694:3: ( rule__EInt__Group__0 )
            // InternalBlockchain.g:694:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:703:1: entryRulePrimitivo : rulePrimitivo EOF ;
    public final void entryRulePrimitivo() throws RecognitionException {
        try {
            // InternalBlockchain.g:704:1: ( rulePrimitivo EOF )
            // InternalBlockchain.g:705:1: rulePrimitivo EOF
            {
             before(grammarAccess.getPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitivo();

            state._fsp--;

             after(grammarAccess.getPrimitivoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitivo"


    // $ANTLR start "rulePrimitivo"
    // InternalBlockchain.g:712:1: rulePrimitivo : ( ( rule__Primitivo__Group__0 ) ) ;
    public final void rulePrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:716:2: ( ( ( rule__Primitivo__Group__0 ) ) )
            // InternalBlockchain.g:717:2: ( ( rule__Primitivo__Group__0 ) )
            {
            // InternalBlockchain.g:717:2: ( ( rule__Primitivo__Group__0 ) )
            // InternalBlockchain.g:718:3: ( rule__Primitivo__Group__0 )
            {
             before(grammarAccess.getPrimitivoAccess().getGroup()); 
            // InternalBlockchain.g:719:3: ( rule__Primitivo__Group__0 )
            // InternalBlockchain.g:719:4: rule__Primitivo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitivo"


    // $ANTLR start "entryRuleMapa"
    // InternalBlockchain.g:728:1: entryRuleMapa : ruleMapa EOF ;
    public final void entryRuleMapa() throws RecognitionException {
        try {
            // InternalBlockchain.g:729:1: ( ruleMapa EOF )
            // InternalBlockchain.g:730:1: ruleMapa EOF
            {
             before(grammarAccess.getMapaRule()); 
            pushFollow(FOLLOW_1);
            ruleMapa();

            state._fsp--;

             after(grammarAccess.getMapaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapa"


    // $ANTLR start "ruleMapa"
    // InternalBlockchain.g:737:1: ruleMapa : ( ( rule__Mapa__Group__0 ) ) ;
    public final void ruleMapa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:741:2: ( ( ( rule__Mapa__Group__0 ) ) )
            // InternalBlockchain.g:742:2: ( ( rule__Mapa__Group__0 ) )
            {
            // InternalBlockchain.g:742:2: ( ( rule__Mapa__Group__0 ) )
            // InternalBlockchain.g:743:3: ( rule__Mapa__Group__0 )
            {
             before(grammarAccess.getMapaAccess().getGroup()); 
            // InternalBlockchain.g:744:3: ( rule__Mapa__Group__0 )
            // InternalBlockchain.g:744:4: rule__Mapa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapa"


    // $ANTLR start "ruleOperadorLogico"
    // InternalBlockchain.g:753:1: ruleOperadorLogico : ( ( rule__OperadorLogico__Alternatives ) ) ;
    public final void ruleOperadorLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:757:1: ( ( ( rule__OperadorLogico__Alternatives ) ) )
            // InternalBlockchain.g:758:2: ( ( rule__OperadorLogico__Alternatives ) )
            {
            // InternalBlockchain.g:758:2: ( ( rule__OperadorLogico__Alternatives ) )
            // InternalBlockchain.g:759:3: ( rule__OperadorLogico__Alternatives )
            {
             before(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 
            // InternalBlockchain.g:760:3: ( rule__OperadorLogico__Alternatives )
            // InternalBlockchain.g:760:4: rule__OperadorLogico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperadorLogico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperadorLogico"


    // $ANTLR start "ruleOperador"
    // InternalBlockchain.g:769:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:773:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalBlockchain.g:774:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalBlockchain.g:774:2: ( ( rule__Operador__Alternatives ) )
            // InternalBlockchain.g:775:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalBlockchain.g:776:3: ( rule__Operador__Alternatives )
            // InternalBlockchain.g:776:4: rule__Operador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleOperadorRelacion"
    // InternalBlockchain.g:785:1: ruleOperadorRelacion : ( ( '.' ) ) ;
    public final void ruleOperadorRelacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:789:1: ( ( ( '.' ) ) )
            // InternalBlockchain.g:790:2: ( ( '.' ) )
            {
            // InternalBlockchain.g:790:2: ( ( '.' ) )
            // InternalBlockchain.g:791:3: ( '.' )
            {
             before(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 
            // InternalBlockchain.g:792:3: ( '.' )
            // InternalBlockchain.g:792:4: '.'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperadorRelacion"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalBlockchain.g:801:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:805:1: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalBlockchain.g:806:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalBlockchain.g:806:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalBlockchain.g:807:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalBlockchain.g:808:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalBlockchain.g:808:4: rule__DatoPrimitivo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatoPrimitivo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatoPrimitivo"


    // $ANTLR start "rule__TipoDato__Alternatives"
    // InternalBlockchain.g:816:1: rule__TipoDato__Alternatives : ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:820:1: ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt1=2;
                }
                break;
            case 63:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBlockchain.g:821:2: ( ruleEntidad )
                    {
                    // InternalBlockchain.g:821:2: ( ruleEntidad )
                    // InternalBlockchain.g:822:3: ruleEntidad
                    {
                     before(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntidad();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:827:2: ( rulePrimitivo )
                    {
                    // InternalBlockchain.g:827:2: ( rulePrimitivo )
                    // InternalBlockchain.g:828:3: rulePrimitivo
                    {
                     before(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivo();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:833:2: ( ruleMapa )
                    {
                    // InternalBlockchain.g:833:2: ( ruleMapa )
                    // InternalBlockchain.g:834:3: ruleMapa
                    {
                     before(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMapa();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoDato__Alternatives"


    // $ANTLR start "rule__Linea__Alternatives"
    // InternalBlockchain.g:843:1: rule__Linea__Alternatives : ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleRetorno ) );
    public final void rule__Linea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:847:1: ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleRetorno ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 61:
                {
                alt2=1;
                }
                break;
            case 52:
                {
                alt2=2;
                }
                break;
            case 53:
                {
                alt2=3;
                }
                break;
            case 62:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:848:2: ( ruleExpresion )
                    {
                    // InternalBlockchain.g:848:2: ( ruleExpresion )
                    // InternalBlockchain.g:849:3: ruleExpresion
                    {
                     before(grammarAccess.getLineaAccess().getExpresionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresion();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:854:2: ( ruleVariable )
                    {
                    // InternalBlockchain.g:854:2: ( ruleVariable )
                    // InternalBlockchain.g:855:3: ruleVariable
                    {
                     before(grammarAccess.getLineaAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:860:2: ( ruleCondicional )
                    {
                    // InternalBlockchain.g:860:2: ( ruleCondicional )
                    // InternalBlockchain.g:861:3: ruleCondicional
                    {
                     before(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCondicional();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:866:2: ( ruleRetorno )
                    {
                    // InternalBlockchain.g:866:2: ( ruleRetorno )
                    // InternalBlockchain.g:867:3: ruleRetorno
                    {
                     before(grammarAccess.getLineaAccess().getRetornoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRetorno();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getRetornoParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linea__Alternatives"


    // $ANTLR start "rule__Expresion__Alternatives"
    // InternalBlockchain.g:876:1: rule__Expresion__Alternatives : ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumericaInt ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) | ( ruleExpresionNumericaDouble ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:880:1: ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumericaInt ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) | ( ruleExpresionNumericaDouble ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt3=1;
                }
                break;
            case 51:
                {
                alt3=2;
                }
                break;
            case 55:
                {
                alt3=3;
                }
                break;
            case 57:
                {
                alt3=4;
                }
                break;
            case 58:
                {
                alt3=5;
                }
                break;
            case 59:
                {
                alt3=6;
                }
                break;
            case 61:
                {
                alt3=7;
                }
                break;
            case 56:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBlockchain.g:881:2: ( ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:881:2: ( ruleExpresionLogica )
                    // InternalBlockchain.g:882:3: ruleExpresionLogica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionLogica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:887:2: ( ruleExpresionAritmetica )
                    {
                    // InternalBlockchain.g:887:2: ( ruleExpresionAritmetica )
                    // InternalBlockchain.g:888:3: ruleExpresionAritmetica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionAritmetica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:893:2: ( ruleExpresionNumericaInt )
                    {
                    // InternalBlockchain.g:893:2: ( ruleExpresionNumericaInt )
                    // InternalBlockchain.g:894:3: ruleExpresionNumericaInt
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionNumericaIntParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionNumericaInt();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionNumericaIntParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:899:2: ( ruleExpresionTexto )
                    {
                    // InternalBlockchain.g:899:2: ( ruleExpresionTexto )
                    // InternalBlockchain.g:900:3: ruleExpresionTexto
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionTexto();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:905:2: ( ruleExpresionBoolean )
                    {
                    // InternalBlockchain.g:905:2: ( ruleExpresionBoolean )
                    // InternalBlockchain.g:906:3: ruleExpresionBoolean
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionBoolean();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:911:2: ( ruleExpresionReferenciada )
                    {
                    // InternalBlockchain.g:911:2: ( ruleExpresionReferenciada )
                    // InternalBlockchain.g:912:3: ruleExpresionReferenciada
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionReferenciada();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:917:2: ( ruleExpresionRelacional )
                    {
                    // InternalBlockchain.g:917:2: ( ruleExpresionRelacional )
                    // InternalBlockchain.g:918:3: ruleExpresionRelacional
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionRelacional();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:923:2: ( ruleExpresionNumericaDouble )
                    {
                    // InternalBlockchain.g:923:2: ( ruleExpresionNumericaDouble )
                    // InternalBlockchain.g:924:3: ruleExpresionNumericaDouble
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionNumericaDoubleParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionNumericaDouble();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionNumericaDoubleParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBlockchain.g:933:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:937:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlockchain.g:938:2: ( RULE_STRING )
                    {
                    // InternalBlockchain.g:938:2: ( RULE_STRING )
                    // InternalBlockchain.g:939:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:944:2: ( RULE_ID )
                    {
                    // InternalBlockchain.g:944:2: ( RULE_ID )
                    // InternalBlockchain.g:945:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalBlockchain.g:954:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:958:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlockchain.g:959:2: ( 'true' )
                    {
                    // InternalBlockchain.g:959:2: ( 'true' )
                    // InternalBlockchain.g:960:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:965:2: ( 'false' )
                    {
                    // InternalBlockchain.g:965:2: ( 'false' )
                    // InternalBlockchain.g:966:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalBlockchain.g:975:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:979:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBlockchain.g:980:2: ( 'E' )
                    {
                    // InternalBlockchain.g:980:2: ( 'E' )
                    // InternalBlockchain.g:981:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:986:2: ( 'e' )
                    {
                    // InternalBlockchain.g:986:2: ( 'e' )
                    // InternalBlockchain.g:987:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__OperadorLogico__Alternatives"
    // InternalBlockchain.g:996:1: rule__OperadorLogico__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__OperadorLogico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1000:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBlockchain.g:1001:2: ( ( '==' ) )
                    {
                    // InternalBlockchain.g:1001:2: ( ( '==' ) )
                    // InternalBlockchain.g:1002:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1003:3: ( '==' )
                    // InternalBlockchain.g:1003:4: '=='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1007:2: ( ( '!=' ) )
                    {
                    // InternalBlockchain.g:1007:2: ( ( '!=' ) )
                    // InternalBlockchain.g:1008:3: ( '!=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1009:3: ( '!=' )
                    // InternalBlockchain.g:1009:4: '!='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1013:2: ( ( '>' ) )
                    {
                    // InternalBlockchain.g:1013:2: ( ( '>' ) )
                    // InternalBlockchain.g:1014:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1015:3: ( '>' )
                    // InternalBlockchain.g:1015:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1019:2: ( ( '<' ) )
                    {
                    // InternalBlockchain.g:1019:2: ( ( '<' ) )
                    // InternalBlockchain.g:1020:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1021:3: ( '<' )
                    // InternalBlockchain.g:1021:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:1025:2: ( ( '>=' ) )
                    {
                    // InternalBlockchain.g:1025:2: ( ( '>=' ) )
                    // InternalBlockchain.g:1026:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:1027:3: ( '>=' )
                    // InternalBlockchain.g:1027:4: '>='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:1031:2: ( ( '<=' ) )
                    {
                    // InternalBlockchain.g:1031:2: ( ( '<=' ) )
                    // InternalBlockchain.g:1032:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:1033:3: ( '<=' )
                    // InternalBlockchain.g:1033:4: '<='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:1037:2: ( ( '&&' ) )
                    {
                    // InternalBlockchain.g:1037:2: ( ( '&&' ) )
                    // InternalBlockchain.g:1038:3: ( '&&' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:1039:3: ( '&&' )
                    // InternalBlockchain.g:1039:4: '&&'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:1043:2: ( ( '||' ) )
                    {
                    // InternalBlockchain.g:1043:2: ( ( '||' ) )
                    // InternalBlockchain.g:1044:3: ( '||' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:1045:3: ( '||' )
                    // InternalBlockchain.g:1045:4: '||'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperadorLogico__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // InternalBlockchain.g:1053:1: rule__Operador__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) | ( ( 'PUT' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1057:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) | ( ( 'PUT' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 29:
                {
                alt8=6;
                }
                break;
            case 30:
                {
                alt8=7;
                }
                break;
            case 31:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:1058:2: ( ( '+' ) )
                    {
                    // InternalBlockchain.g:1058:2: ( ( '+' ) )
                    // InternalBlockchain.g:1059:3: ( '+' )
                    {
                     before(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1060:3: ( '+' )
                    // InternalBlockchain.g:1060:4: '+'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1064:2: ( ( '-' ) )
                    {
                    // InternalBlockchain.g:1064:2: ( ( '-' ) )
                    // InternalBlockchain.g:1065:3: ( '-' )
                    {
                     before(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1066:3: ( '-' )
                    // InternalBlockchain.g:1066:4: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1070:2: ( ( '*' ) )
                    {
                    // InternalBlockchain.g:1070:2: ( ( '*' ) )
                    // InternalBlockchain.g:1071:3: ( '*' )
                    {
                     before(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1072:3: ( '*' )
                    // InternalBlockchain.g:1072:4: '*'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1076:2: ( ( '/' ) )
                    {
                    // InternalBlockchain.g:1076:2: ( ( '/' ) )
                    // InternalBlockchain.g:1077:3: ( '/' )
                    {
                     before(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1078:3: ( '/' )
                    // InternalBlockchain.g:1078:4: '/'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:1082:2: ( ( '=' ) )
                    {
                    // InternalBlockchain.g:1082:2: ( ( '=' ) )
                    // InternalBlockchain.g:1083:3: ( '=' )
                    {
                     before(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:1084:3: ( '=' )
                    // InternalBlockchain.g:1084:4: '='
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:1088:2: ( ( 'GET' ) )
                    {
                    // InternalBlockchain.g:1088:2: ( ( 'GET' ) )
                    // InternalBlockchain.g:1089:3: ( 'GET' )
                    {
                     before(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:1090:3: ( 'GET' )
                    // InternalBlockchain.g:1090:4: 'GET'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:1094:2: ( ( 'DELETE' ) )
                    {
                    // InternalBlockchain.g:1094:2: ( ( 'DELETE' ) )
                    // InternalBlockchain.g:1095:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:1096:3: ( 'DELETE' )
                    // InternalBlockchain.g:1096:4: 'DELETE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:1100:2: ( ( 'PUT' ) )
                    {
                    // InternalBlockchain.g:1100:2: ( ( 'PUT' ) )
                    // InternalBlockchain.g:1101:3: ( 'PUT' )
                    {
                     before(grammarAccess.getOperadorAccess().getPUTEnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:1102:3: ( 'PUT' )
                    // InternalBlockchain.g:1102:4: 'PUT'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPUTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__DatoPrimitivo__Alternatives"
    // InternalBlockchain.g:1110:1: rule__DatoPrimitivo__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'ADDRESS' ) ) | ( ( 'Double' ) ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1114:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'ADDRESS' ) ) | ( ( 'Double' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBlockchain.g:1115:2: ( ( 'String' ) )
                    {
                    // InternalBlockchain.g:1115:2: ( ( 'String' ) )
                    // InternalBlockchain.g:1116:3: ( 'String' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1117:3: ( 'String' )
                    // InternalBlockchain.g:1117:4: 'String'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1121:2: ( ( 'Integer' ) )
                    {
                    // InternalBlockchain.g:1121:2: ( ( 'Integer' ) )
                    // InternalBlockchain.g:1122:3: ( 'Integer' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1123:3: ( 'Integer' )
                    // InternalBlockchain.g:1123:4: 'Integer'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1127:2: ( ( 'Boolean' ) )
                    {
                    // InternalBlockchain.g:1127:2: ( ( 'Boolean' ) )
                    // InternalBlockchain.g:1128:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1129:3: ( 'Boolean' )
                    // InternalBlockchain.g:1129:4: 'Boolean'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1133:2: ( ( 'ADDRESS' ) )
                    {
                    // InternalBlockchain.g:1133:2: ( ( 'ADDRESS' ) )
                    // InternalBlockchain.g:1134:3: ( 'ADDRESS' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1135:3: ( 'ADDRESS' )
                    // InternalBlockchain.g:1135:4: 'ADDRESS'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:1139:2: ( ( 'Double' ) )
                    {
                    // InternalBlockchain.g:1139:2: ( ( 'Double' ) )
                    // InternalBlockchain.g:1140:3: ( 'Double' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getDOUBLEEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:1141:3: ( 'Double' )
                    // InternalBlockchain.g:1141:4: 'Double'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getDOUBLEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatoPrimitivo__Alternatives"


    // $ANTLR start "rule__Aplicacion__Group__0"
    // InternalBlockchain.g:1149:1: rule__Aplicacion__Group__0 : rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 ;
    public final void rule__Aplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1153:1: ( rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 )
            // InternalBlockchain.g:1154:2: rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Aplicacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__0"


    // $ANTLR start "rule__Aplicacion__Group__0__Impl"
    // InternalBlockchain.g:1161:1: rule__Aplicacion__Group__0__Impl : ( () ) ;
    public final void rule__Aplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1165:1: ( ( () ) )
            // InternalBlockchain.g:1166:1: ( () )
            {
            // InternalBlockchain.g:1166:1: ( () )
            // InternalBlockchain.g:1167:2: ()
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 
            // InternalBlockchain.g:1168:2: ()
            // InternalBlockchain.g:1168:3: 
            {
            }

             after(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group__1"
    // InternalBlockchain.g:1176:1: rule__Aplicacion__Group__1 : rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 ;
    public final void rule__Aplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1180:1: ( rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 )
            // InternalBlockchain.g:1181:2: rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Aplicacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__1"


    // $ANTLR start "rule__Aplicacion__Group__1__Impl"
    // InternalBlockchain.g:1188:1: rule__Aplicacion__Group__1__Impl : ( 'Aplicacion' ) ;
    public final void rule__Aplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1192:1: ( ( 'Aplicacion' ) )
            // InternalBlockchain.g:1193:1: ( 'Aplicacion' )
            {
            // InternalBlockchain.g:1193:1: ( 'Aplicacion' )
            // InternalBlockchain.g:1194:2: 'Aplicacion'
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group__2"
    // InternalBlockchain.g:1203:1: rule__Aplicacion__Group__2 : rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 ;
    public final void rule__Aplicacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1207:1: ( rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 )
            // InternalBlockchain.g:1208:2: rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Aplicacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__2"


    // $ANTLR start "rule__Aplicacion__Group__2__Impl"
    // InternalBlockchain.g:1215:1: rule__Aplicacion__Group__2__Impl : ( ( rule__Aplicacion__NameAssignment_2 ) ) ;
    public final void rule__Aplicacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1219:1: ( ( ( rule__Aplicacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1220:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1220:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            // InternalBlockchain.g:1221:2: ( rule__Aplicacion__NameAssignment_2 )
            {
             before(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1222:2: ( rule__Aplicacion__NameAssignment_2 )
            // InternalBlockchain.g:1222:3: rule__Aplicacion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__2__Impl"


    // $ANTLR start "rule__Aplicacion__Group__3"
    // InternalBlockchain.g:1230:1: rule__Aplicacion__Group__3 : rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 ;
    public final void rule__Aplicacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1234:1: ( rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 )
            // InternalBlockchain.g:1235:2: rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__3"


    // $ANTLR start "rule__Aplicacion__Group__3__Impl"
    // InternalBlockchain.g:1242:1: rule__Aplicacion__Group__3__Impl : ( '{' ) ;
    public final void rule__Aplicacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1246:1: ( ( '{' ) )
            // InternalBlockchain.g:1247:1: ( '{' )
            {
            // InternalBlockchain.g:1247:1: ( '{' )
            // InternalBlockchain.g:1248:2: '{'
            {
             before(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__3__Impl"


    // $ANTLR start "rule__Aplicacion__Group__4"
    // InternalBlockchain.g:1257:1: rule__Aplicacion__Group__4 : rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 ;
    public final void rule__Aplicacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1261:1: ( rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 )
            // InternalBlockchain.g:1262:2: rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__4"


    // $ANTLR start "rule__Aplicacion__Group__4__Impl"
    // InternalBlockchain.g:1269:1: rule__Aplicacion__Group__4__Impl : ( ( rule__Aplicacion__Group_4__0 )? ) ;
    public final void rule__Aplicacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1273:1: ( ( ( rule__Aplicacion__Group_4__0 )? ) )
            // InternalBlockchain.g:1274:1: ( ( rule__Aplicacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:1274:1: ( ( rule__Aplicacion__Group_4__0 )? )
            // InternalBlockchain.g:1275:2: ( rule__Aplicacion__Group_4__0 )?
            {
             before(grammarAccess.getAplicacionAccess().getGroup_4()); 
            // InternalBlockchain.g:1276:2: ( rule__Aplicacion__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:1276:3: rule__Aplicacion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicacion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAplicacionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__4__Impl"


    // $ANTLR start "rule__Aplicacion__Group__5"
    // InternalBlockchain.g:1284:1: rule__Aplicacion__Group__5 : rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 ;
    public final void rule__Aplicacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1288:1: ( rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 )
            // InternalBlockchain.g:1289:2: rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__5"


    // $ANTLR start "rule__Aplicacion__Group__5__Impl"
    // InternalBlockchain.g:1296:1: rule__Aplicacion__Group__5__Impl : ( ( rule__Aplicacion__Group_5__0 )* ) ;
    public final void rule__Aplicacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1300:1: ( ( ( rule__Aplicacion__Group_5__0 )* ) )
            // InternalBlockchain.g:1301:1: ( ( rule__Aplicacion__Group_5__0 )* )
            {
            // InternalBlockchain.g:1301:1: ( ( rule__Aplicacion__Group_5__0 )* )
            // InternalBlockchain.g:1302:2: ( rule__Aplicacion__Group_5__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_5()); 
            // InternalBlockchain.g:1303:2: ( rule__Aplicacion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBlockchain.g:1303:3: rule__Aplicacion__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Aplicacion__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__5__Impl"


    // $ANTLR start "rule__Aplicacion__Group__6"
    // InternalBlockchain.g:1311:1: rule__Aplicacion__Group__6 : rule__Aplicacion__Group__6__Impl ;
    public final void rule__Aplicacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1315:1: ( rule__Aplicacion__Group__6__Impl )
            // InternalBlockchain.g:1316:2: rule__Aplicacion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__6"


    // $ANTLR start "rule__Aplicacion__Group__6__Impl"
    // InternalBlockchain.g:1322:1: rule__Aplicacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Aplicacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1326:1: ( ( '}' ) )
            // InternalBlockchain.g:1327:1: ( '}' )
            {
            // InternalBlockchain.g:1327:1: ( '}' )
            // InternalBlockchain.g:1328:2: '}'
            {
             before(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__6__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4__0"
    // InternalBlockchain.g:1338:1: rule__Aplicacion__Group_4__0 : rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 ;
    public final void rule__Aplicacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1342:1: ( rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 )
            // InternalBlockchain.g:1343:2: rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Aplicacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__0"


    // $ANTLR start "rule__Aplicacion__Group_4__0__Impl"
    // InternalBlockchain.g:1350:1: rule__Aplicacion__Group_4__0__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) ;
    public final void rule__Aplicacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1354:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) )
            // InternalBlockchain.g:1355:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1355:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            // InternalBlockchain.g:1356:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 
            // InternalBlockchain.g:1357:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            // InternalBlockchain.g:1357:3: rule__Aplicacion__SmartcontractAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__SmartcontractAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4__1"
    // InternalBlockchain.g:1365:1: rule__Aplicacion__Group_4__1 : rule__Aplicacion__Group_4__1__Impl ;
    public final void rule__Aplicacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1369:1: ( rule__Aplicacion__Group_4__1__Impl )
            // InternalBlockchain.g:1370:2: rule__Aplicacion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__1"


    // $ANTLR start "rule__Aplicacion__Group_4__1__Impl"
    // InternalBlockchain.g:1376:1: rule__Aplicacion__Group_4__1__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) ;
    public final void rule__Aplicacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1380:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) )
            // InternalBlockchain.g:1381:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1381:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            // InternalBlockchain.g:1382:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 
            // InternalBlockchain.g:1383:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlockchain.g:1383:3: rule__Aplicacion__SmartcontractAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Aplicacion__SmartcontractAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5__0"
    // InternalBlockchain.g:1392:1: rule__Aplicacion__Group_5__0 : rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 ;
    public final void rule__Aplicacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1396:1: ( rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 )
            // InternalBlockchain.g:1397:2: rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Aplicacion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__0"


    // $ANTLR start "rule__Aplicacion__Group_5__0__Impl"
    // InternalBlockchain.g:1404:1: rule__Aplicacion__Group_5__0__Impl : ( 'tipodato' ) ;
    public final void rule__Aplicacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1408:1: ( ( 'tipodato' ) )
            // InternalBlockchain.g:1409:1: ( 'tipodato' )
            {
            // InternalBlockchain.g:1409:1: ( 'tipodato' )
            // InternalBlockchain.g:1410:2: 'tipodato'
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5__1"
    // InternalBlockchain.g:1419:1: rule__Aplicacion__Group_5__1 : rule__Aplicacion__Group_5__1__Impl ;
    public final void rule__Aplicacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1423:1: ( rule__Aplicacion__Group_5__1__Impl )
            // InternalBlockchain.g:1424:2: rule__Aplicacion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__1"


    // $ANTLR start "rule__Aplicacion__Group_5__1__Impl"
    // InternalBlockchain.g:1430:1: rule__Aplicacion__Group_5__1__Impl : ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) ;
    public final void rule__Aplicacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1434:1: ( ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) )
            // InternalBlockchain.g:1435:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            {
            // InternalBlockchain.g:1435:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            // InternalBlockchain.g:1436:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 
            // InternalBlockchain.g:1437:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            // InternalBlockchain.g:1437:3: rule__Aplicacion__TipodatoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__TipodatoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__1__Impl"


    // $ANTLR start "rule__SmartContract__Group__0"
    // InternalBlockchain.g:1446:1: rule__SmartContract__Group__0 : rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 ;
    public final void rule__SmartContract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1450:1: ( rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 )
            // InternalBlockchain.g:1451:2: rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SmartContract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0"


    // $ANTLR start "rule__SmartContract__Group__0__Impl"
    // InternalBlockchain.g:1458:1: rule__SmartContract__Group__0__Impl : ( 'SmartContract' ) ;
    public final void rule__SmartContract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1462:1: ( ( 'SmartContract' ) )
            // InternalBlockchain.g:1463:1: ( 'SmartContract' )
            {
            // InternalBlockchain.g:1463:1: ( 'SmartContract' )
            // InternalBlockchain.g:1464:2: 'SmartContract'
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0__Impl"


    // $ANTLR start "rule__SmartContract__Group__1"
    // InternalBlockchain.g:1473:1: rule__SmartContract__Group__1 : rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 ;
    public final void rule__SmartContract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1477:1: ( rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 )
            // InternalBlockchain.g:1478:2: rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SmartContract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1"


    // $ANTLR start "rule__SmartContract__Group__1__Impl"
    // InternalBlockchain.g:1485:1: rule__SmartContract__Group__1__Impl : ( ( rule__SmartContract__NameAssignment_1 ) ) ;
    public final void rule__SmartContract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1489:1: ( ( ( rule__SmartContract__NameAssignment_1 ) ) )
            // InternalBlockchain.g:1490:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:1490:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            // InternalBlockchain.g:1491:2: ( rule__SmartContract__NameAssignment_1 )
            {
             before(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:1492:2: ( rule__SmartContract__NameAssignment_1 )
            // InternalBlockchain.g:1492:3: rule__SmartContract__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1__Impl"


    // $ANTLR start "rule__SmartContract__Group__2"
    // InternalBlockchain.g:1500:1: rule__SmartContract__Group__2 : rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 ;
    public final void rule__SmartContract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1504:1: ( rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 )
            // InternalBlockchain.g:1505:2: rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2"


    // $ANTLR start "rule__SmartContract__Group__2__Impl"
    // InternalBlockchain.g:1512:1: rule__SmartContract__Group__2__Impl : ( '{' ) ;
    public final void rule__SmartContract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1516:1: ( ( '{' ) )
            // InternalBlockchain.g:1517:1: ( '{' )
            {
            // InternalBlockchain.g:1517:1: ( '{' )
            // InternalBlockchain.g:1518:2: '{'
            {
             before(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2__Impl"


    // $ANTLR start "rule__SmartContract__Group__3"
    // InternalBlockchain.g:1527:1: rule__SmartContract__Group__3 : rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 ;
    public final void rule__SmartContract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1531:1: ( rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 )
            // InternalBlockchain.g:1532:2: rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3"


    // $ANTLR start "rule__SmartContract__Group__3__Impl"
    // InternalBlockchain.g:1539:1: rule__SmartContract__Group__3__Impl : ( ( rule__SmartContract__Group_3__0 )? ) ;
    public final void rule__SmartContract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1543:1: ( ( ( rule__SmartContract__Group_3__0 )? ) )
            // InternalBlockchain.g:1544:1: ( ( rule__SmartContract__Group_3__0 )? )
            {
            // InternalBlockchain.g:1544:1: ( ( rule__SmartContract__Group_3__0 )? )
            // InternalBlockchain.g:1545:2: ( rule__SmartContract__Group_3__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_3()); 
            // InternalBlockchain.g:1546:2: ( rule__SmartContract__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlockchain.g:1546:3: rule__SmartContract__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartContractAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3__Impl"


    // $ANTLR start "rule__SmartContract__Group__4"
    // InternalBlockchain.g:1554:1: rule__SmartContract__Group__4 : rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 ;
    public final void rule__SmartContract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1558:1: ( rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 )
            // InternalBlockchain.g:1559:2: rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4"


    // $ANTLR start "rule__SmartContract__Group__4__Impl"
    // InternalBlockchain.g:1566:1: rule__SmartContract__Group__4__Impl : ( ( rule__SmartContract__Group_4__0 )? ) ;
    public final void rule__SmartContract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1570:1: ( ( ( rule__SmartContract__Group_4__0 )? ) )
            // InternalBlockchain.g:1571:1: ( ( rule__SmartContract__Group_4__0 )? )
            {
            // InternalBlockchain.g:1571:1: ( ( rule__SmartContract__Group_4__0 )? )
            // InternalBlockchain.g:1572:2: ( rule__SmartContract__Group_4__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_4()); 
            // InternalBlockchain.g:1573:2: ( rule__SmartContract__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBlockchain.g:1573:3: rule__SmartContract__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartContractAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4__Impl"


    // $ANTLR start "rule__SmartContract__Group__5"
    // InternalBlockchain.g:1581:1: rule__SmartContract__Group__5 : rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 ;
    public final void rule__SmartContract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1585:1: ( rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 )
            // InternalBlockchain.g:1586:2: rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5"


    // $ANTLR start "rule__SmartContract__Group__5__Impl"
    // InternalBlockchain.g:1593:1: rule__SmartContract__Group__5__Impl : ( ( rule__SmartContract__Group_5__0 )? ) ;
    public final void rule__SmartContract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1597:1: ( ( ( rule__SmartContract__Group_5__0 )? ) )
            // InternalBlockchain.g:1598:1: ( ( rule__SmartContract__Group_5__0 )? )
            {
            // InternalBlockchain.g:1598:1: ( ( rule__SmartContract__Group_5__0 )? )
            // InternalBlockchain.g:1599:2: ( rule__SmartContract__Group_5__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_5()); 
            // InternalBlockchain.g:1600:2: ( rule__SmartContract__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlockchain.g:1600:3: rule__SmartContract__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartContractAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5__Impl"


    // $ANTLR start "rule__SmartContract__Group__6"
    // InternalBlockchain.g:1608:1: rule__SmartContract__Group__6 : rule__SmartContract__Group__6__Impl ;
    public final void rule__SmartContract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1612:1: ( rule__SmartContract__Group__6__Impl )
            // InternalBlockchain.g:1613:2: rule__SmartContract__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6"


    // $ANTLR start "rule__SmartContract__Group__6__Impl"
    // InternalBlockchain.g:1619:1: rule__SmartContract__Group__6__Impl : ( '}' ) ;
    public final void rule__SmartContract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1623:1: ( ( '}' ) )
            // InternalBlockchain.g:1624:1: ( '}' )
            {
            // InternalBlockchain.g:1624:1: ( '}' )
            // InternalBlockchain.g:1625:2: '}'
            {
             before(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__0"
    // InternalBlockchain.g:1635:1: rule__SmartContract__Group_3__0 : rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 ;
    public final void rule__SmartContract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1639:1: ( rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 )
            // InternalBlockchain.g:1640:2: rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__SmartContract__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0"


    // $ANTLR start "rule__SmartContract__Group_3__0__Impl"
    // InternalBlockchain.g:1647:1: rule__SmartContract__Group_3__0__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) ;
    public final void rule__SmartContract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1651:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) )
            // InternalBlockchain.g:1652:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            {
            // InternalBlockchain.g:1652:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            // InternalBlockchain.g:1653:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 
            // InternalBlockchain.g:1654:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            // InternalBlockchain.g:1654:3: rule__SmartContract__EntidadesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__EntidadesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__1"
    // InternalBlockchain.g:1662:1: rule__SmartContract__Group_3__1 : rule__SmartContract__Group_3__1__Impl ;
    public final void rule__SmartContract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1666:1: ( rule__SmartContract__Group_3__1__Impl )
            // InternalBlockchain.g:1667:2: rule__SmartContract__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1"


    // $ANTLR start "rule__SmartContract__Group_3__1__Impl"
    // InternalBlockchain.g:1673:1: rule__SmartContract__Group_3__1__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) ;
    public final void rule__SmartContract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1677:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) )
            // InternalBlockchain.g:1678:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            {
            // InternalBlockchain.g:1678:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            // InternalBlockchain.g:1679:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 
            // InternalBlockchain.g:1680:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:1680:3: rule__SmartContract__EntidadesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SmartContract__EntidadesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_4__0"
    // InternalBlockchain.g:1689:1: rule__SmartContract__Group_4__0 : rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 ;
    public final void rule__SmartContract__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1693:1: ( rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 )
            // InternalBlockchain.g:1694:2: rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__SmartContract__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__0"


    // $ANTLR start "rule__SmartContract__Group_4__0__Impl"
    // InternalBlockchain.g:1701:1: rule__SmartContract__Group_4__0__Impl : ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) ;
    public final void rule__SmartContract__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1705:1: ( ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) )
            // InternalBlockchain.g:1706:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1706:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            // InternalBlockchain.g:1707:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 
            // InternalBlockchain.g:1708:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            // InternalBlockchain.g:1708:3: rule__SmartContract__EstadoAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__EstadoAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_4__1"
    // InternalBlockchain.g:1716:1: rule__SmartContract__Group_4__1 : rule__SmartContract__Group_4__1__Impl ;
    public final void rule__SmartContract__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1720:1: ( rule__SmartContract__Group_4__1__Impl )
            // InternalBlockchain.g:1721:2: rule__SmartContract__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__1"


    // $ANTLR start "rule__SmartContract__Group_4__1__Impl"
    // InternalBlockchain.g:1727:1: rule__SmartContract__Group_4__1__Impl : ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) ;
    public final void rule__SmartContract__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1731:1: ( ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) )
            // InternalBlockchain.g:1732:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1732:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            // InternalBlockchain.g:1733:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 
            // InternalBlockchain.g:1734:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==49) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBlockchain.g:1734:3: rule__SmartContract__EstadoAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SmartContract__EstadoAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_5__0"
    // InternalBlockchain.g:1743:1: rule__SmartContract__Group_5__0 : rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 ;
    public final void rule__SmartContract__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1747:1: ( rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 )
            // InternalBlockchain.g:1748:2: rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__SmartContract__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__0"


    // $ANTLR start "rule__SmartContract__Group_5__0__Impl"
    // InternalBlockchain.g:1755:1: rule__SmartContract__Group_5__0__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) ;
    public final void rule__SmartContract__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1759:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) )
            // InternalBlockchain.g:1760:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            {
            // InternalBlockchain.g:1760:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            // InternalBlockchain.g:1761:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 
            // InternalBlockchain.g:1762:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            // InternalBlockchain.g:1762:3: rule__SmartContract__OperacionesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__OperacionesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_5__1"
    // InternalBlockchain.g:1770:1: rule__SmartContract__Group_5__1 : rule__SmartContract__Group_5__1__Impl ;
    public final void rule__SmartContract__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1774:1: ( rule__SmartContract__Group_5__1__Impl )
            // InternalBlockchain.g:1775:2: rule__SmartContract__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__1"


    // $ANTLR start "rule__SmartContract__Group_5__1__Impl"
    // InternalBlockchain.g:1781:1: rule__SmartContract__Group_5__1__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) ;
    public final void rule__SmartContract__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1785:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) )
            // InternalBlockchain.g:1786:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            {
            // InternalBlockchain.g:1786:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            // InternalBlockchain.g:1787:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 
            // InternalBlockchain.g:1788:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlockchain.g:1788:3: rule__SmartContract__OperacionesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SmartContract__OperacionesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__1__Impl"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalBlockchain.g:1797:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1801:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalBlockchain.g:1802:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalBlockchain.g:1809:1: rule__Entidad__Group__0__Impl : ( () ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1813:1: ( ( () ) )
            // InternalBlockchain.g:1814:1: ( () )
            {
            // InternalBlockchain.g:1814:1: ( () )
            // InternalBlockchain.g:1815:2: ()
            {
             before(grammarAccess.getEntidadAccess().getEntidadAction_0()); 
            // InternalBlockchain.g:1816:2: ()
            // InternalBlockchain.g:1816:3: 
            {
            }

             after(grammarAccess.getEntidadAccess().getEntidadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalBlockchain.g:1824:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1828:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalBlockchain.g:1829:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalBlockchain.g:1836:1: rule__Entidad__Group__1__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1840:1: ( ( 'Entidad' ) )
            // InternalBlockchain.g:1841:1: ( 'Entidad' )
            {
            // InternalBlockchain.g:1841:1: ( 'Entidad' )
            // InternalBlockchain.g:1842:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalBlockchain.g:1851:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1855:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalBlockchain.g:1856:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalBlockchain.g:1863:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__NameAssignment_2 ) ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1867:1: ( ( ( rule__Entidad__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1868:1: ( ( rule__Entidad__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1868:1: ( ( rule__Entidad__NameAssignment_2 ) )
            // InternalBlockchain.g:1869:2: ( rule__Entidad__NameAssignment_2 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1870:2: ( rule__Entidad__NameAssignment_2 )
            // InternalBlockchain.g:1870:3: rule__Entidad__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalBlockchain.g:1878:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1882:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalBlockchain.g:1883:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalBlockchain.g:1890:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1894:1: ( ( '{' ) )
            // InternalBlockchain.g:1895:1: ( '{' )
            {
            // InternalBlockchain.g:1895:1: ( '{' )
            // InternalBlockchain.g:1896:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalBlockchain.g:1905:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1909:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalBlockchain.g:1910:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalBlockchain.g:1917:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__Group_4__0 )? ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1921:1: ( ( ( rule__Entidad__Group_4__0 )? ) )
            // InternalBlockchain.g:1922:1: ( ( rule__Entidad__Group_4__0 )? )
            {
            // InternalBlockchain.g:1922:1: ( ( rule__Entidad__Group_4__0 )? )
            // InternalBlockchain.g:1923:2: ( rule__Entidad__Group_4__0 )?
            {
             before(grammarAccess.getEntidadAccess().getGroup_4()); 
            // InternalBlockchain.g:1924:2: ( rule__Entidad__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:1924:3: rule__Entidad__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entidad__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntidadAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalBlockchain.g:1932:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1936:1: ( rule__Entidad__Group__5__Impl )
            // InternalBlockchain.g:1937:2: rule__Entidad__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalBlockchain.g:1943:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1947:1: ( ( '}' ) )
            // InternalBlockchain.g:1948:1: ( '}' )
            {
            // InternalBlockchain.g:1948:1: ( '}' )
            // InternalBlockchain.g:1949:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group_4__0"
    // InternalBlockchain.g:1959:1: rule__Entidad__Group_4__0 : rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 ;
    public final void rule__Entidad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1963:1: ( rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 )
            // InternalBlockchain.g:1964:2: rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0"


    // $ANTLR start "rule__Entidad__Group_4__0__Impl"
    // InternalBlockchain.g:1971:1: rule__Entidad__Group_4__0__Impl : ( ( rule__Entidad__AtributosAssignment_4_0 ) ) ;
    public final void rule__Entidad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1975:1: ( ( ( rule__Entidad__AtributosAssignment_4_0 ) ) )
            // InternalBlockchain.g:1976:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1976:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            // InternalBlockchain.g:1977:2: ( rule__Entidad__AtributosAssignment_4_0 )
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 
            // InternalBlockchain.g:1978:2: ( rule__Entidad__AtributosAssignment_4_0 )
            // InternalBlockchain.g:1978:3: rule__Entidad__AtributosAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__AtributosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0__Impl"


    // $ANTLR start "rule__Entidad__Group_4__1"
    // InternalBlockchain.g:1986:1: rule__Entidad__Group_4__1 : rule__Entidad__Group_4__1__Impl ;
    public final void rule__Entidad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1990:1: ( rule__Entidad__Group_4__1__Impl )
            // InternalBlockchain.g:1991:2: rule__Entidad__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1"


    // $ANTLR start "rule__Entidad__Group_4__1__Impl"
    // InternalBlockchain.g:1997:1: rule__Entidad__Group_4__1__Impl : ( ( rule__Entidad__AtributosAssignment_4_1 )* ) ;
    public final void rule__Entidad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2001:1: ( ( ( rule__Entidad__AtributosAssignment_4_1 )* ) )
            // InternalBlockchain.g:2002:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            {
            // InternalBlockchain.g:2002:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            // InternalBlockchain.g:2003:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 
            // InternalBlockchain.g:2004:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlockchain.g:2004:3: rule__Entidad__AtributosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Entidad__AtributosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1__Impl"


    // $ANTLR start "rule__Operacion__Group__0"
    // InternalBlockchain.g:2013:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2017:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // InternalBlockchain.g:2018:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0"


    // $ANTLR start "rule__Operacion__Group__0__Impl"
    // InternalBlockchain.g:2025:1: rule__Operacion__Group__0__Impl : ( 'Operacion' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2029:1: ( ( 'Operacion' ) )
            // InternalBlockchain.g:2030:1: ( 'Operacion' )
            {
            // InternalBlockchain.g:2030:1: ( 'Operacion' )
            // InternalBlockchain.g:2031:2: 'Operacion'
            {
             before(grammarAccess.getOperacionAccess().getOperacionKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getOperacionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0__Impl"


    // $ANTLR start "rule__Operacion__Group__1"
    // InternalBlockchain.g:2040:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2044:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // InternalBlockchain.g:2045:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1"


    // $ANTLR start "rule__Operacion__Group__1__Impl"
    // InternalBlockchain.g:2052:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Group_1__0 )? ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2056:1: ( ( ( rule__Operacion__Group_1__0 )? ) )
            // InternalBlockchain.g:2057:1: ( ( rule__Operacion__Group_1__0 )? )
            {
            // InternalBlockchain.g:2057:1: ( ( rule__Operacion__Group_1__0 )? )
            // InternalBlockchain.g:2058:2: ( rule__Operacion__Group_1__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_1()); 
            // InternalBlockchain.g:2059:2: ( rule__Operacion__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBlockchain.g:2059:3: rule__Operacion__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1__Impl"


    // $ANTLR start "rule__Operacion__Group__2"
    // InternalBlockchain.g:2067:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2071:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // InternalBlockchain.g:2072:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2"


    // $ANTLR start "rule__Operacion__Group__2__Impl"
    // InternalBlockchain.g:2079:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__NameAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2083:1: ( ( ( rule__Operacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2084:1: ( ( rule__Operacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2084:1: ( ( rule__Operacion__NameAssignment_2 ) )
            // InternalBlockchain.g:2085:2: ( rule__Operacion__NameAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2086:2: ( rule__Operacion__NameAssignment_2 )
            // InternalBlockchain.g:2086:3: rule__Operacion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2__Impl"


    // $ANTLR start "rule__Operacion__Group__3"
    // InternalBlockchain.g:2094:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2098:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // InternalBlockchain.g:2099:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3"


    // $ANTLR start "rule__Operacion__Group__3__Impl"
    // InternalBlockchain.g:2106:1: rule__Operacion__Group__3__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2110:1: ( ( '(' ) )
            // InternalBlockchain.g:2111:1: ( '(' )
            {
            // InternalBlockchain.g:2111:1: ( '(' )
            // InternalBlockchain.g:2112:2: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3__Impl"


    // $ANTLR start "rule__Operacion__Group__4"
    // InternalBlockchain.g:2121:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl rule__Operacion__Group__5 ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2125:1: ( rule__Operacion__Group__4__Impl rule__Operacion__Group__5 )
            // InternalBlockchain.g:2126:2: rule__Operacion__Group__4__Impl rule__Operacion__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Operacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4"


    // $ANTLR start "rule__Operacion__Group__4__Impl"
    // InternalBlockchain.g:2133:1: rule__Operacion__Group__4__Impl : ( ( rule__Operacion__Group_4__0 )? ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2137:1: ( ( ( rule__Operacion__Group_4__0 )? ) )
            // InternalBlockchain.g:2138:1: ( ( rule__Operacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:2138:1: ( ( rule__Operacion__Group_4__0 )? )
            // InternalBlockchain.g:2139:2: ( rule__Operacion__Group_4__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_4()); 
            // InternalBlockchain.g:2140:2: ( rule__Operacion__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlockchain.g:2140:3: rule__Operacion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4__Impl"


    // $ANTLR start "rule__Operacion__Group__5"
    // InternalBlockchain.g:2148:1: rule__Operacion__Group__5 : rule__Operacion__Group__5__Impl rule__Operacion__Group__6 ;
    public final void rule__Operacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2152:1: ( rule__Operacion__Group__5__Impl rule__Operacion__Group__6 )
            // InternalBlockchain.g:2153:2: rule__Operacion__Group__5__Impl rule__Operacion__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Operacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__5"


    // $ANTLR start "rule__Operacion__Group__5__Impl"
    // InternalBlockchain.g:2160:1: rule__Operacion__Group__5__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2164:1: ( ( ')' ) )
            // InternalBlockchain.g:2165:1: ( ')' )
            {
            // InternalBlockchain.g:2165:1: ( ')' )
            // InternalBlockchain.g:2166:2: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__5__Impl"


    // $ANTLR start "rule__Operacion__Group__6"
    // InternalBlockchain.g:2175:1: rule__Operacion__Group__6 : rule__Operacion__Group__6__Impl rule__Operacion__Group__7 ;
    public final void rule__Operacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2179:1: ( rule__Operacion__Group__6__Impl rule__Operacion__Group__7 )
            // InternalBlockchain.g:2180:2: rule__Operacion__Group__6__Impl rule__Operacion__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Operacion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__6"


    // $ANTLR start "rule__Operacion__Group__6__Impl"
    // InternalBlockchain.g:2187:1: rule__Operacion__Group__6__Impl : ( ( rule__Operacion__Group_6__0 )? ) ;
    public final void rule__Operacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2191:1: ( ( ( rule__Operacion__Group_6__0 )? ) )
            // InternalBlockchain.g:2192:1: ( ( rule__Operacion__Group_6__0 )? )
            {
            // InternalBlockchain.g:2192:1: ( ( rule__Operacion__Group_6__0 )? )
            // InternalBlockchain.g:2193:2: ( rule__Operacion__Group_6__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_6()); 
            // InternalBlockchain.g:2194:2: ( rule__Operacion__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:2194:3: rule__Operacion__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__6__Impl"


    // $ANTLR start "rule__Operacion__Group__7"
    // InternalBlockchain.g:2202:1: rule__Operacion__Group__7 : rule__Operacion__Group__7__Impl rule__Operacion__Group__8 ;
    public final void rule__Operacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2206:1: ( rule__Operacion__Group__7__Impl rule__Operacion__Group__8 )
            // InternalBlockchain.g:2207:2: rule__Operacion__Group__7__Impl rule__Operacion__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__7"


    // $ANTLR start "rule__Operacion__Group__7__Impl"
    // InternalBlockchain.g:2214:1: rule__Operacion__Group__7__Impl : ( '{' ) ;
    public final void rule__Operacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2218:1: ( ( '{' ) )
            // InternalBlockchain.g:2219:1: ( '{' )
            {
            // InternalBlockchain.g:2219:1: ( '{' )
            // InternalBlockchain.g:2220:2: '{'
            {
             before(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__7__Impl"


    // $ANTLR start "rule__Operacion__Group__8"
    // InternalBlockchain.g:2229:1: rule__Operacion__Group__8 : rule__Operacion__Group__8__Impl rule__Operacion__Group__9 ;
    public final void rule__Operacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2233:1: ( rule__Operacion__Group__8__Impl rule__Operacion__Group__9 )
            // InternalBlockchain.g:2234:2: rule__Operacion__Group__8__Impl rule__Operacion__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__8"


    // $ANTLR start "rule__Operacion__Group__8__Impl"
    // InternalBlockchain.g:2241:1: rule__Operacion__Group__8__Impl : ( ( '(' )* ) ;
    public final void rule__Operacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2245:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2246:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2246:1: ( ( '(' )* )
            // InternalBlockchain.g:2247:2: ( '(' )*
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_8()); 
            // InternalBlockchain.g:2248:2: ( '(' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBlockchain.g:2248:3: '('
            	    {
            	    match(input,44,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__8__Impl"


    // $ANTLR start "rule__Operacion__Group__9"
    // InternalBlockchain.g:2256:1: rule__Operacion__Group__9 : rule__Operacion__Group__9__Impl rule__Operacion__Group__10 ;
    public final void rule__Operacion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2260:1: ( rule__Operacion__Group__9__Impl rule__Operacion__Group__10 )
            // InternalBlockchain.g:2261:2: rule__Operacion__Group__9__Impl rule__Operacion__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__9"


    // $ANTLR start "rule__Operacion__Group__9__Impl"
    // InternalBlockchain.g:2268:1: rule__Operacion__Group__9__Impl : ( ( rule__Operacion__LineasAssignment_9 )* ) ;
    public final void rule__Operacion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2272:1: ( ( ( rule__Operacion__LineasAssignment_9 )* ) )
            // InternalBlockchain.g:2273:1: ( ( rule__Operacion__LineasAssignment_9 )* )
            {
            // InternalBlockchain.g:2273:1: ( ( rule__Operacion__LineasAssignment_9 )* )
            // InternalBlockchain.g:2274:2: ( rule__Operacion__LineasAssignment_9 )*
            {
             before(grammarAccess.getOperacionAccess().getLineasAssignment_9()); 
            // InternalBlockchain.g:2275:2: ( rule__Operacion__LineasAssignment_9 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=50 && LA25_0<=53)||(LA25_0>=55 && LA25_0<=59)||(LA25_0>=61 && LA25_0<=62)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBlockchain.g:2275:3: rule__Operacion__LineasAssignment_9
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Operacion__LineasAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLineasAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__9__Impl"


    // $ANTLR start "rule__Operacion__Group__10"
    // InternalBlockchain.g:2283:1: rule__Operacion__Group__10 : rule__Operacion__Group__10__Impl rule__Operacion__Group__11 ;
    public final void rule__Operacion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2287:1: ( rule__Operacion__Group__10__Impl rule__Operacion__Group__11 )
            // InternalBlockchain.g:2288:2: rule__Operacion__Group__10__Impl rule__Operacion__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__10"


    // $ANTLR start "rule__Operacion__Group__10__Impl"
    // InternalBlockchain.g:2295:1: rule__Operacion__Group__10__Impl : ( ( ')' )* ) ;
    public final void rule__Operacion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2299:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2300:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2300:1: ( ( ')' )* )
            // InternalBlockchain.g:2301:2: ( ')' )*
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_10()); 
            // InternalBlockchain.g:2302:2: ( ')' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBlockchain.g:2302:3: ')'
            	    {
            	    match(input,45,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__10__Impl"


    // $ANTLR start "rule__Operacion__Group__11"
    // InternalBlockchain.g:2310:1: rule__Operacion__Group__11 : rule__Operacion__Group__11__Impl ;
    public final void rule__Operacion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2314:1: ( rule__Operacion__Group__11__Impl )
            // InternalBlockchain.g:2315:2: rule__Operacion__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__11"


    // $ANTLR start "rule__Operacion__Group__11__Impl"
    // InternalBlockchain.g:2321:1: rule__Operacion__Group__11__Impl : ( '}' ) ;
    public final void rule__Operacion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2325:1: ( ( '}' ) )
            // InternalBlockchain.g:2326:1: ( '}' )
            {
            // InternalBlockchain.g:2326:1: ( '}' )
            // InternalBlockchain.g:2327:2: '}'
            {
             before(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__11__Impl"


    // $ANTLR start "rule__Operacion__Group_1__0"
    // InternalBlockchain.g:2337:1: rule__Operacion__Group_1__0 : rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 ;
    public final void rule__Operacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2341:1: ( rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 )
            // InternalBlockchain.g:2342:2: rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Operacion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__0"


    // $ANTLR start "rule__Operacion__Group_1__0__Impl"
    // InternalBlockchain.g:2349:1: rule__Operacion__Group_1__0__Impl : ( 'isUd=' ) ;
    public final void rule__Operacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2353:1: ( ( 'isUd=' ) )
            // InternalBlockchain.g:2354:1: ( 'isUd=' )
            {
            // InternalBlockchain.g:2354:1: ( 'isUd=' )
            // InternalBlockchain.g:2355:2: 'isUd='
            {
             before(grammarAccess.getOperacionAccess().getIsUdKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getIsUdKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_1__1"
    // InternalBlockchain.g:2364:1: rule__Operacion__Group_1__1 : rule__Operacion__Group_1__1__Impl ;
    public final void rule__Operacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2368:1: ( rule__Operacion__Group_1__1__Impl )
            // InternalBlockchain.g:2369:2: rule__Operacion__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__1"


    // $ANTLR start "rule__Operacion__Group_1__1__Impl"
    // InternalBlockchain.g:2375:1: rule__Operacion__Group_1__1__Impl : ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) ;
    public final void rule__Operacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2379:1: ( ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) )
            // InternalBlockchain.g:2380:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            {
            // InternalBlockchain.g:2380:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            // InternalBlockchain.g:2381:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1()); 
            // InternalBlockchain.g:2382:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            // InternalBlockchain.g:2382:3: rule__Operacion__EsUserDefinedAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__EsUserDefinedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_4__0"
    // InternalBlockchain.g:2391:1: rule__Operacion__Group_4__0 : rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 ;
    public final void rule__Operacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2395:1: ( rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 )
            // InternalBlockchain.g:2396:2: rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__Operacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__0"


    // $ANTLR start "rule__Operacion__Group_4__0__Impl"
    // InternalBlockchain.g:2403:1: rule__Operacion__Group_4__0__Impl : ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) ;
    public final void rule__Operacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2407:1: ( ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) )
            // InternalBlockchain.g:2408:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:2408:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            // InternalBlockchain.g:2409:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0()); 
            // InternalBlockchain.g:2410:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            // InternalBlockchain.g:2410:3: rule__Operacion__ParametrosAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__0__Impl"


    // $ANTLR start "rule__Operacion__Group_4__1"
    // InternalBlockchain.g:2418:1: rule__Operacion__Group_4__1 : rule__Operacion__Group_4__1__Impl ;
    public final void rule__Operacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2422:1: ( rule__Operacion__Group_4__1__Impl )
            // InternalBlockchain.g:2423:2: rule__Operacion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__1"


    // $ANTLR start "rule__Operacion__Group_4__1__Impl"
    // InternalBlockchain.g:2429:1: rule__Operacion__Group_4__1__Impl : ( ( rule__Operacion__Group_4_1__0 )* ) ;
    public final void rule__Operacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2433:1: ( ( ( rule__Operacion__Group_4_1__0 )* ) )
            // InternalBlockchain.g:2434:1: ( ( rule__Operacion__Group_4_1__0 )* )
            {
            // InternalBlockchain.g:2434:1: ( ( rule__Operacion__Group_4_1__0 )* )
            // InternalBlockchain.g:2435:2: ( rule__Operacion__Group_4_1__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_4_1()); 
            // InternalBlockchain.g:2436:2: ( rule__Operacion__Group_4_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBlockchain.g:2436:3: rule__Operacion__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Operacion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__1__Impl"


    // $ANTLR start "rule__Operacion__Group_4_1__0"
    // InternalBlockchain.g:2445:1: rule__Operacion__Group_4_1__0 : rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 ;
    public final void rule__Operacion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2449:1: ( rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 )
            // InternalBlockchain.g:2450:2: rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__0"


    // $ANTLR start "rule__Operacion__Group_4_1__0__Impl"
    // InternalBlockchain.g:2457:1: rule__Operacion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operacion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2461:1: ( ( ',' ) )
            // InternalBlockchain.g:2462:1: ( ',' )
            {
            // InternalBlockchain.g:2462:1: ( ',' )
            // InternalBlockchain.g:2463:2: ','
            {
             before(grammarAccess.getOperacionAccess().getCommaKeyword_4_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_4_1__1"
    // InternalBlockchain.g:2472:1: rule__Operacion__Group_4_1__1 : rule__Operacion__Group_4_1__1__Impl ;
    public final void rule__Operacion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2476:1: ( rule__Operacion__Group_4_1__1__Impl )
            // InternalBlockchain.g:2477:2: rule__Operacion__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__1"


    // $ANTLR start "rule__Operacion__Group_4_1__1__Impl"
    // InternalBlockchain.g:2483:1: rule__Operacion__Group_4_1__1__Impl : ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) ;
    public final void rule__Operacion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2487:1: ( ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) )
            // InternalBlockchain.g:2488:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            {
            // InternalBlockchain.g:2488:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            // InternalBlockchain.g:2489:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1()); 
            // InternalBlockchain.g:2490:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            // InternalBlockchain.g:2490:3: rule__Operacion__ParametrosAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_6__0"
    // InternalBlockchain.g:2499:1: rule__Operacion__Group_6__0 : rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 ;
    public final void rule__Operacion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2503:1: ( rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 )
            // InternalBlockchain.g:2504:2: rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__0"


    // $ANTLR start "rule__Operacion__Group_6__0__Impl"
    // InternalBlockchain.g:2511:1: rule__Operacion__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Operacion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2515:1: ( ( ':' ) )
            // InternalBlockchain.g:2516:1: ( ':' )
            {
            // InternalBlockchain.g:2516:1: ( ':' )
            // InternalBlockchain.g:2517:2: ':'
            {
             before(grammarAccess.getOperacionAccess().getColonKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getColonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__0__Impl"


    // $ANTLR start "rule__Operacion__Group_6__1"
    // InternalBlockchain.g:2526:1: rule__Operacion__Group_6__1 : rule__Operacion__Group_6__1__Impl ;
    public final void rule__Operacion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2530:1: ( rule__Operacion__Group_6__1__Impl )
            // InternalBlockchain.g:2531:2: rule__Operacion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__1"


    // $ANTLR start "rule__Operacion__Group_6__1__Impl"
    // InternalBlockchain.g:2537:1: rule__Operacion__Group_6__1__Impl : ( ( rule__Operacion__RetornoAssignment_6_1 ) ) ;
    public final void rule__Operacion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2541:1: ( ( ( rule__Operacion__RetornoAssignment_6_1 ) ) )
            // InternalBlockchain.g:2542:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            {
            // InternalBlockchain.g:2542:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            // InternalBlockchain.g:2543:2: ( rule__Operacion__RetornoAssignment_6_1 )
            {
             before(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1()); 
            // InternalBlockchain.g:2544:2: ( rule__Operacion__RetornoAssignment_6_1 )
            // InternalBlockchain.g:2544:3: rule__Operacion__RetornoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__RetornoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__1__Impl"


    // $ANTLR start "rule__Estado__Group__0"
    // InternalBlockchain.g:2553:1: rule__Estado__Group__0 : rule__Estado__Group__0__Impl rule__Estado__Group__1 ;
    public final void rule__Estado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2557:1: ( rule__Estado__Group__0__Impl rule__Estado__Group__1 )
            // InternalBlockchain.g:2558:2: rule__Estado__Group__0__Impl rule__Estado__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Estado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estado__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__0"


    // $ANTLR start "rule__Estado__Group__0__Impl"
    // InternalBlockchain.g:2565:1: rule__Estado__Group__0__Impl : ( 'Estado' ) ;
    public final void rule__Estado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2569:1: ( ( 'Estado' ) )
            // InternalBlockchain.g:2570:1: ( 'Estado' )
            {
            // InternalBlockchain.g:2570:1: ( 'Estado' )
            // InternalBlockchain.g:2571:2: 'Estado'
            {
             before(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__0__Impl"


    // $ANTLR start "rule__Estado__Group__1"
    // InternalBlockchain.g:2580:1: rule__Estado__Group__1 : rule__Estado__Group__1__Impl rule__Estado__Group__2 ;
    public final void rule__Estado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2584:1: ( rule__Estado__Group__1__Impl rule__Estado__Group__2 )
            // InternalBlockchain.g:2585:2: rule__Estado__Group__1__Impl rule__Estado__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Estado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estado__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__1"


    // $ANTLR start "rule__Estado__Group__1__Impl"
    // InternalBlockchain.g:2592:1: rule__Estado__Group__1__Impl : ( ( rule__Estado__TipodatoAssignment_1 ) ) ;
    public final void rule__Estado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2596:1: ( ( ( rule__Estado__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:2597:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:2597:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:2598:2: ( rule__Estado__TipodatoAssignment_1 )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:2599:2: ( rule__Estado__TipodatoAssignment_1 )
            // InternalBlockchain.g:2599:3: rule__Estado__TipodatoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Estado__TipodatoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__1__Impl"


    // $ANTLR start "rule__Estado__Group__2"
    // InternalBlockchain.g:2607:1: rule__Estado__Group__2 : rule__Estado__Group__2__Impl ;
    public final void rule__Estado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2611:1: ( rule__Estado__Group__2__Impl )
            // InternalBlockchain.g:2612:2: rule__Estado__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estado__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__2"


    // $ANTLR start "rule__Estado__Group__2__Impl"
    // InternalBlockchain.g:2618:1: rule__Estado__Group__2__Impl : ( ( rule__Estado__NameAssignment_2 ) ) ;
    public final void rule__Estado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2622:1: ( ( ( rule__Estado__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2623:1: ( ( rule__Estado__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2623:1: ( ( rule__Estado__NameAssignment_2 ) )
            // InternalBlockchain.g:2624:2: ( rule__Estado__NameAssignment_2 )
            {
             before(grammarAccess.getEstadoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2625:2: ( rule__Estado__NameAssignment_2 )
            // InternalBlockchain.g:2625:3: rule__Estado__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Estado__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalBlockchain.g:2634:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2638:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalBlockchain.g:2639:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // InternalBlockchain.g:2646:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__TipodatoAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2650:1: ( ( ( rule__Atributo__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2651:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2651:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2652:2: ( rule__Atributo__TipodatoAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2653:2: ( rule__Atributo__TipodatoAssignment_0 )
            // InternalBlockchain.g:2653:3: rule__Atributo__TipodatoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__TipodatoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // InternalBlockchain.g:2661:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2665:1: ( rule__Atributo__Group__1__Impl )
            // InternalBlockchain.g:2666:2: rule__Atributo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // InternalBlockchain.g:2672:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2676:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2677:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2677:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalBlockchain.g:2678:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2679:2: ( rule__Atributo__NameAssignment_1 )
            // InternalBlockchain.g:2679:3: rule__Atributo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Parametro__Group__0"
    // InternalBlockchain.g:2688:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2692:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalBlockchain.g:2693:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parametro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0"


    // $ANTLR start "rule__Parametro__Group__0__Impl"
    // InternalBlockchain.g:2700:1: rule__Parametro__Group__0__Impl : ( ( rule__Parametro__TipodatoAssignment_0 ) ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2704:1: ( ( ( rule__Parametro__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2705:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2705:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2706:2: ( rule__Parametro__TipodatoAssignment_0 )
            {
             before(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2707:2: ( rule__Parametro__TipodatoAssignment_0 )
            // InternalBlockchain.g:2707:3: rule__Parametro__TipodatoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__TipodatoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0__Impl"


    // $ANTLR start "rule__Parametro__Group__1"
    // InternalBlockchain.g:2715:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2719:1: ( rule__Parametro__Group__1__Impl )
            // InternalBlockchain.g:2720:2: rule__Parametro__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1"


    // $ANTLR start "rule__Parametro__Group__1__Impl"
    // InternalBlockchain.g:2726:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__NameAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2730:1: ( ( ( rule__Parametro__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2731:1: ( ( rule__Parametro__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2731:1: ( ( rule__Parametro__NameAssignment_1 ) )
            // InternalBlockchain.g:2732:2: ( rule__Parametro__NameAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2733:2: ( rule__Parametro__NameAssignment_1 )
            // InternalBlockchain.g:2733:3: rule__Parametro__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__0"
    // InternalBlockchain.g:2742:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2746:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalBlockchain.g:2747:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ExpresionLogica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0"


    // $ANTLR start "rule__ExpresionLogica__Group__0__Impl"
    // InternalBlockchain.g:2754:1: rule__ExpresionLogica__Group__0__Impl : ( 'ExpLog' ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2758:1: ( ( 'ExpLog' ) )
            // InternalBlockchain.g:2759:1: ( 'ExpLog' )
            {
            // InternalBlockchain.g:2759:1: ( 'ExpLog' )
            // InternalBlockchain.g:2760:2: 'ExpLog'
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__1"
    // InternalBlockchain.g:2769:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2773:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalBlockchain.g:2774:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ExpresionLogica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1"


    // $ANTLR start "rule__ExpresionLogica__Group__1__Impl"
    // InternalBlockchain.g:2781:1: rule__ExpresionLogica__Group__1__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2785:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2786:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2786:1: ( ( '(' )* )
            // InternalBlockchain.g:2787:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 
            // InternalBlockchain.g:2788:2: ( '(' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBlockchain.g:2788:3: '('
            	    {
            	    match(input,44,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__2"
    // InternalBlockchain.g:2796:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2800:1: ( rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 )
            // InternalBlockchain.g:2801:2: rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2"


    // $ANTLR start "rule__ExpresionLogica__Group__2__Impl"
    // InternalBlockchain.g:2808:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2812:1: ( ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) )
            // InternalBlockchain.g:2813:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            {
            // InternalBlockchain.g:2813:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            // InternalBlockchain.g:2814:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2()); 
            // InternalBlockchain.g:2815:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            // InternalBlockchain.g:2815:3: rule__ExpresionLogica__IzqAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__IzqAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__3"
    // InternalBlockchain.g:2823:1: rule__ExpresionLogica__Group__3 : rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 ;
    public final void rule__ExpresionLogica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2827:1: ( rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 )
            // InternalBlockchain.g:2828:2: rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__3"


    // $ANTLR start "rule__ExpresionLogica__Group__3__Impl"
    // InternalBlockchain.g:2835:1: rule__ExpresionLogica__Group__3__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2839:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2840:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2840:1: ( ( ')' )* )
            // InternalBlockchain.g:2841:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3()); 
            // InternalBlockchain.g:2842:2: ( ')' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==45) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBlockchain.g:2842:3: ')'
            	    {
            	    match(input,45,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__3__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__4"
    // InternalBlockchain.g:2850:1: rule__ExpresionLogica__Group__4 : rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 ;
    public final void rule__ExpresionLogica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2854:1: ( rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 )
            // InternalBlockchain.g:2855:2: rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__4"


    // $ANTLR start "rule__ExpresionLogica__Group__4__Impl"
    // InternalBlockchain.g:2862:1: rule__ExpresionLogica__Group__4__Impl : ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) ;
    public final void rule__ExpresionLogica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2866:1: ( ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) )
            // InternalBlockchain.g:2867:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            {
            // InternalBlockchain.g:2867:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            // InternalBlockchain.g:2868:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 
            // InternalBlockchain.g:2869:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=16 && LA30_0<=23)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBlockchain.g:2869:3: rule__ExpresionLogica__OperadorAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__OperadorAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__4__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__5"
    // InternalBlockchain.g:2877:1: rule__ExpresionLogica__Group__5 : rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 ;
    public final void rule__ExpresionLogica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2881:1: ( rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 )
            // InternalBlockchain.g:2882:2: rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__5"


    // $ANTLR start "rule__ExpresionLogica__Group__5__Impl"
    // InternalBlockchain.g:2889:1: rule__ExpresionLogica__Group__5__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2893:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2894:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2894:1: ( ( '(' )* )
            // InternalBlockchain.g:2895:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5()); 
            // InternalBlockchain.g:2896:2: ( '(' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBlockchain.g:2896:3: '('
            	    {
            	    match(input,44,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__5__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__6"
    // InternalBlockchain.g:2904:1: rule__ExpresionLogica__Group__6 : rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 ;
    public final void rule__ExpresionLogica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2908:1: ( rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 )
            // InternalBlockchain.g:2909:2: rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__6"


    // $ANTLR start "rule__ExpresionLogica__Group__6__Impl"
    // InternalBlockchain.g:2916:1: rule__ExpresionLogica__Group__6__Impl : ( ( rule__ExpresionLogica__DerAssignment_6 ) ) ;
    public final void rule__ExpresionLogica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2920:1: ( ( ( rule__ExpresionLogica__DerAssignment_6 ) ) )
            // InternalBlockchain.g:2921:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            {
            // InternalBlockchain.g:2921:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            // InternalBlockchain.g:2922:2: ( rule__ExpresionLogica__DerAssignment_6 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6()); 
            // InternalBlockchain.g:2923:2: ( rule__ExpresionLogica__DerAssignment_6 )
            // InternalBlockchain.g:2923:3: rule__ExpresionLogica__DerAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__DerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__6__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__7"
    // InternalBlockchain.g:2931:1: rule__ExpresionLogica__Group__7 : rule__ExpresionLogica__Group__7__Impl ;
    public final void rule__ExpresionLogica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2935:1: ( rule__ExpresionLogica__Group__7__Impl )
            // InternalBlockchain.g:2936:2: rule__ExpresionLogica__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__7"


    // $ANTLR start "rule__ExpresionLogica__Group__7__Impl"
    // InternalBlockchain.g:2942:1: rule__ExpresionLogica__Group__7__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2946:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2947:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2947:1: ( ( ')' )* )
            // InternalBlockchain.g:2948:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7()); 
            // InternalBlockchain.g:2949:2: ( ')' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==45) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBlockchain.g:2949:3: ')'
            	    {
            	    match(input,45,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__7__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__0"
    // InternalBlockchain.g:2958:1: rule__ExpresionAritmetica__Group__0 : rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 ;
    public final void rule__ExpresionAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2962:1: ( rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 )
            // InternalBlockchain.g:2963:2: rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ExpresionAritmetica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__0"


    // $ANTLR start "rule__ExpresionAritmetica__Group__0__Impl"
    // InternalBlockchain.g:2970:1: rule__ExpresionAritmetica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2974:1: ( ( () ) )
            // InternalBlockchain.g:2975:1: ( () )
            {
            // InternalBlockchain.g:2975:1: ( () )
            // InternalBlockchain.g:2976:2: ()
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 
            // InternalBlockchain.g:2977:2: ()
            // InternalBlockchain.g:2977:3: 
            {
            }

             after(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__1"
    // InternalBlockchain.g:2985:1: rule__ExpresionAritmetica__Group__1 : rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 ;
    public final void rule__ExpresionAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2989:1: ( rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 )
            // InternalBlockchain.g:2990:2: rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ExpresionAritmetica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__1"


    // $ANTLR start "rule__ExpresionAritmetica__Group__1__Impl"
    // InternalBlockchain.g:2997:1: rule__ExpresionAritmetica__Group__1__Impl : ( 'ExpArit' ) ;
    public final void rule__ExpresionAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3001:1: ( ( 'ExpArit' ) )
            // InternalBlockchain.g:3002:1: ( 'ExpArit' )
            {
            // InternalBlockchain.g:3002:1: ( 'ExpArit' )
            // InternalBlockchain.g:3003:2: 'ExpArit'
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__2"
    // InternalBlockchain.g:3012:1: rule__ExpresionAritmetica__Group__2 : rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 ;
    public final void rule__ExpresionAritmetica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3016:1: ( rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 )
            // InternalBlockchain.g:3017:2: rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ExpresionAritmetica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__2"


    // $ANTLR start "rule__ExpresionAritmetica__Group__2__Impl"
    // InternalBlockchain.g:3024:1: rule__ExpresionAritmetica__Group__2__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3028:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:3029:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:3029:1: ( ( '(' )* )
            // InternalBlockchain.g:3030:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2()); 
            // InternalBlockchain.g:3031:2: ( '(' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==44) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBlockchain.g:3031:3: '('
            	    {
            	    match(input,44,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__3"
    // InternalBlockchain.g:3039:1: rule__ExpresionAritmetica__Group__3 : rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 ;
    public final void rule__ExpresionAritmetica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3043:1: ( rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 )
            // InternalBlockchain.g:3044:2: rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__3"


    // $ANTLR start "rule__ExpresionAritmetica__Group__3__Impl"
    // InternalBlockchain.g:3051:1: rule__ExpresionAritmetica__Group__3__Impl : ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) ;
    public final void rule__ExpresionAritmetica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3055:1: ( ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) )
            // InternalBlockchain.g:3056:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            {
            // InternalBlockchain.g:3056:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            // InternalBlockchain.g:3057:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3()); 
            // InternalBlockchain.g:3058:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            // InternalBlockchain.g:3058:3: rule__ExpresionAritmetica__IzqAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__IzqAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__3__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__4"
    // InternalBlockchain.g:3066:1: rule__ExpresionAritmetica__Group__4 : rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 ;
    public final void rule__ExpresionAritmetica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3070:1: ( rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 )
            // InternalBlockchain.g:3071:2: rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__4"


    // $ANTLR start "rule__ExpresionAritmetica__Group__4__Impl"
    // InternalBlockchain.g:3078:1: rule__ExpresionAritmetica__Group__4__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3082:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3083:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3083:1: ( ( ')' )* )
            // InternalBlockchain.g:3084:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4()); 
            // InternalBlockchain.g:3085:2: ( ')' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==45) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBlockchain.g:3085:3: ')'
            	    {
            	    match(input,45,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__4__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__5"
    // InternalBlockchain.g:3093:1: rule__ExpresionAritmetica__Group__5 : rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 ;
    public final void rule__ExpresionAritmetica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3097:1: ( rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 )
            // InternalBlockchain.g:3098:2: rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__5"


    // $ANTLR start "rule__ExpresionAritmetica__Group__5__Impl"
    // InternalBlockchain.g:3105:1: rule__ExpresionAritmetica__Group__5__Impl : ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) ;
    public final void rule__ExpresionAritmetica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3109:1: ( ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) )
            // InternalBlockchain.g:3110:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            {
            // InternalBlockchain.g:3110:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            // InternalBlockchain.g:3111:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5()); 
            // InternalBlockchain.g:3112:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=24 && LA35_0<=31)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBlockchain.g:3112:3: rule__ExpresionAritmetica__OperadorAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionAritmetica__OperadorAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__5__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__6"
    // InternalBlockchain.g:3120:1: rule__ExpresionAritmetica__Group__6 : rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 ;
    public final void rule__ExpresionAritmetica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3124:1: ( rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 )
            // InternalBlockchain.g:3125:2: rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__6"


    // $ANTLR start "rule__ExpresionAritmetica__Group__6__Impl"
    // InternalBlockchain.g:3132:1: rule__ExpresionAritmetica__Group__6__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3136:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:3137:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:3137:1: ( ( '(' )* )
            // InternalBlockchain.g:3138:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6()); 
            // InternalBlockchain.g:3139:2: ( '(' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==44) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBlockchain.g:3139:3: '('
            	    {
            	    match(input,44,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__6__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__7"
    // InternalBlockchain.g:3147:1: rule__ExpresionAritmetica__Group__7 : rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 ;
    public final void rule__ExpresionAritmetica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3151:1: ( rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 )
            // InternalBlockchain.g:3152:2: rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionAritmetica__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__7"


    // $ANTLR start "rule__ExpresionAritmetica__Group__7__Impl"
    // InternalBlockchain.g:3159:1: rule__ExpresionAritmetica__Group__7__Impl : ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) ;
    public final void rule__ExpresionAritmetica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3163:1: ( ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) )
            // InternalBlockchain.g:3164:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            {
            // InternalBlockchain.g:3164:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            // InternalBlockchain.g:3165:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7()); 
            // InternalBlockchain.g:3166:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            // InternalBlockchain.g:3166:3: rule__ExpresionAritmetica__DerAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__DerAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__7__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__8"
    // InternalBlockchain.g:3174:1: rule__ExpresionAritmetica__Group__8 : rule__ExpresionAritmetica__Group__8__Impl ;
    public final void rule__ExpresionAritmetica__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3178:1: ( rule__ExpresionAritmetica__Group__8__Impl )
            // InternalBlockchain.g:3179:2: rule__ExpresionAritmetica__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__8"


    // $ANTLR start "rule__ExpresionAritmetica__Group__8__Impl"
    // InternalBlockchain.g:3185:1: rule__ExpresionAritmetica__Group__8__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3189:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3190:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3190:1: ( ( ')' )* )
            // InternalBlockchain.g:3191:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8()); 
            // InternalBlockchain.g:3192:2: ( ')' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBlockchain.g:3192:3: ')'
            	    {
            	    match(input,45,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__8__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalBlockchain.g:3201:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3205:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalBlockchain.g:3206:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalBlockchain.g:3213:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3217:1: ( ( 'var' ) )
            // InternalBlockchain.g:3218:1: ( 'var' )
            {
            // InternalBlockchain.g:3218:1: ( 'var' )
            // InternalBlockchain.g:3219:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalBlockchain.g:3228:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3232:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalBlockchain.g:3233:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalBlockchain.g:3240:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__TipodatoAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3244:1: ( ( ( rule__Variable__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:3245:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:3245:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:3246:2: ( rule__Variable__TipodatoAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:3247:2: ( rule__Variable__TipodatoAssignment_1 )
            // InternalBlockchain.g:3247:3: rule__Variable__TipodatoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TipodatoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalBlockchain.g:3255:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3259:1: ( rule__Variable__Group__2__Impl )
            // InternalBlockchain.g:3260:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalBlockchain.g:3266:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3270:1: ( ( ( rule__Variable__NameAssignment_2 )? ) )
            // InternalBlockchain.g:3271:1: ( ( rule__Variable__NameAssignment_2 )? )
            {
            // InternalBlockchain.g:3271:1: ( ( rule__Variable__NameAssignment_2 )? )
            // InternalBlockchain.g:3272:2: ( rule__Variable__NameAssignment_2 )?
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:3273:2: ( rule__Variable__NameAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBlockchain.g:3273:3: rule__Variable__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Condicional__Group__0"
    // InternalBlockchain.g:3282:1: rule__Condicional__Group__0 : rule__Condicional__Group__0__Impl rule__Condicional__Group__1 ;
    public final void rule__Condicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3286:1: ( rule__Condicional__Group__0__Impl rule__Condicional__Group__1 )
            // InternalBlockchain.g:3287:2: rule__Condicional__Group__0__Impl rule__Condicional__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Condicional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__0"


    // $ANTLR start "rule__Condicional__Group__0__Impl"
    // InternalBlockchain.g:3294:1: rule__Condicional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3298:1: ( ( 'if' ) )
            // InternalBlockchain.g:3299:1: ( 'if' )
            {
            // InternalBlockchain.g:3299:1: ( 'if' )
            // InternalBlockchain.g:3300:2: 'if'
            {
             before(grammarAccess.getCondicionalAccess().getIfKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__0__Impl"


    // $ANTLR start "rule__Condicional__Group__1"
    // InternalBlockchain.g:3309:1: rule__Condicional__Group__1 : rule__Condicional__Group__1__Impl rule__Condicional__Group__2 ;
    public final void rule__Condicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3313:1: ( rule__Condicional__Group__1__Impl rule__Condicional__Group__2 )
            // InternalBlockchain.g:3314:2: rule__Condicional__Group__1__Impl rule__Condicional__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Condicional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__1"


    // $ANTLR start "rule__Condicional__Group__1__Impl"
    // InternalBlockchain.g:3321:1: rule__Condicional__Group__1__Impl : ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? ) ;
    public final void rule__Condicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3325:1: ( ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? ) )
            // InternalBlockchain.g:3326:1: ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? )
            {
            // InternalBlockchain.g:3326:1: ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? )
            // InternalBlockchain.g:3327:2: ( rule__Condicional__ExpresionlogicaAssignment_1 )?
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_1()); 
            // InternalBlockchain.g:3328:2: ( rule__Condicional__ExpresionlogicaAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:3328:3: rule__Condicional__ExpresionlogicaAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ExpresionlogicaAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__1__Impl"


    // $ANTLR start "rule__Condicional__Group__2"
    // InternalBlockchain.g:3336:1: rule__Condicional__Group__2 : rule__Condicional__Group__2__Impl rule__Condicional__Group__3 ;
    public final void rule__Condicional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3340:1: ( rule__Condicional__Group__2__Impl rule__Condicional__Group__3 )
            // InternalBlockchain.g:3341:2: rule__Condicional__Group__2__Impl rule__Condicional__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Condicional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__2"


    // $ANTLR start "rule__Condicional__Group__2__Impl"
    // InternalBlockchain.g:3348:1: rule__Condicional__Group__2__Impl : ( '{' ) ;
    public final void rule__Condicional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3352:1: ( ( '{' ) )
            // InternalBlockchain.g:3353:1: ( '{' )
            {
            // InternalBlockchain.g:3353:1: ( '{' )
            // InternalBlockchain.g:3354:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__2__Impl"


    // $ANTLR start "rule__Condicional__Group__3"
    // InternalBlockchain.g:3363:1: rule__Condicional__Group__3 : rule__Condicional__Group__3__Impl rule__Condicional__Group__4 ;
    public final void rule__Condicional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3367:1: ( rule__Condicional__Group__3__Impl rule__Condicional__Group__4 )
            // InternalBlockchain.g:3368:2: rule__Condicional__Group__3__Impl rule__Condicional__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Condicional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__3"


    // $ANTLR start "rule__Condicional__Group__3__Impl"
    // InternalBlockchain.g:3375:1: rule__Condicional__Group__3__Impl : ( ( rule__Condicional__LineasAssignment_3 )* ) ;
    public final void rule__Condicional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3379:1: ( ( ( rule__Condicional__LineasAssignment_3 )* ) )
            // InternalBlockchain.g:3380:1: ( ( rule__Condicional__LineasAssignment_3 )* )
            {
            // InternalBlockchain.g:3380:1: ( ( rule__Condicional__LineasAssignment_3 )* )
            // InternalBlockchain.g:3381:2: ( rule__Condicional__LineasAssignment_3 )*
            {
             before(grammarAccess.getCondicionalAccess().getLineasAssignment_3()); 
            // InternalBlockchain.g:3382:2: ( rule__Condicional__LineasAssignment_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=50 && LA40_0<=53)||(LA40_0>=55 && LA40_0<=59)||(LA40_0>=61 && LA40_0<=62)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBlockchain.g:3382:3: rule__Condicional__LineasAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Condicional__LineasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getCondicionalAccess().getLineasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__3__Impl"


    // $ANTLR start "rule__Condicional__Group__4"
    // InternalBlockchain.g:3390:1: rule__Condicional__Group__4 : rule__Condicional__Group__4__Impl rule__Condicional__Group__5 ;
    public final void rule__Condicional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3394:1: ( rule__Condicional__Group__4__Impl rule__Condicional__Group__5 )
            // InternalBlockchain.g:3395:2: rule__Condicional__Group__4__Impl rule__Condicional__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__Condicional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__4"


    // $ANTLR start "rule__Condicional__Group__4__Impl"
    // InternalBlockchain.g:3402:1: rule__Condicional__Group__4__Impl : ( '}' ) ;
    public final void rule__Condicional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3406:1: ( ( '}' ) )
            // InternalBlockchain.g:3407:1: ( '}' )
            {
            // InternalBlockchain.g:3407:1: ( '}' )
            // InternalBlockchain.g:3408:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__4__Impl"


    // $ANTLR start "rule__Condicional__Group__5"
    // InternalBlockchain.g:3417:1: rule__Condicional__Group__5 : rule__Condicional__Group__5__Impl ;
    public final void rule__Condicional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3421:1: ( rule__Condicional__Group__5__Impl )
            // InternalBlockchain.g:3422:2: rule__Condicional__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__5"


    // $ANTLR start "rule__Condicional__Group__5__Impl"
    // InternalBlockchain.g:3428:1: rule__Condicional__Group__5__Impl : ( ( rule__Condicional__ElseLinesAssignment_5 )? ) ;
    public final void rule__Condicional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3432:1: ( ( ( rule__Condicional__ElseLinesAssignment_5 )? ) )
            // InternalBlockchain.g:3433:1: ( ( rule__Condicional__ElseLinesAssignment_5 )? )
            {
            // InternalBlockchain.g:3433:1: ( ( rule__Condicional__ElseLinesAssignment_5 )? )
            // InternalBlockchain.g:3434:2: ( rule__Condicional__ElseLinesAssignment_5 )?
            {
             before(grammarAccess.getCondicionalAccess().getElseLinesAssignment_5()); 
            // InternalBlockchain.g:3435:2: ( rule__Condicional__ElseLinesAssignment_5 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBlockchain.g:3435:3: rule__Condicional__ElseLinesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ElseLinesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getElseLinesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__5__Impl"


    // $ANTLR start "rule__Else__Group__0"
    // InternalBlockchain.g:3444:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3448:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalBlockchain.g:3449:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Else__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0"


    // $ANTLR start "rule__Else__Group__0__Impl"
    // InternalBlockchain.g:3456:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3460:1: ( ( 'else' ) )
            // InternalBlockchain.g:3461:1: ( 'else' )
            {
            // InternalBlockchain.g:3461:1: ( 'else' )
            // InternalBlockchain.g:3462:2: 'else'
            {
             before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0__Impl"


    // $ANTLR start "rule__Else__Group__1"
    // InternalBlockchain.g:3471:1: rule__Else__Group__1 : rule__Else__Group__1__Impl rule__Else__Group__2 ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3475:1: ( rule__Else__Group__1__Impl rule__Else__Group__2 )
            // InternalBlockchain.g:3476:2: rule__Else__Group__1__Impl rule__Else__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Else__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__1"


    // $ANTLR start "rule__Else__Group__1__Impl"
    // InternalBlockchain.g:3483:1: rule__Else__Group__1__Impl : ( '{' ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3487:1: ( ( '{' ) )
            // InternalBlockchain.g:3488:1: ( '{' )
            {
            // InternalBlockchain.g:3488:1: ( '{' )
            // InternalBlockchain.g:3489:2: '{'
            {
             before(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__1__Impl"


    // $ANTLR start "rule__Else__Group__2"
    // InternalBlockchain.g:3498:1: rule__Else__Group__2 : rule__Else__Group__2__Impl rule__Else__Group__3 ;
    public final void rule__Else__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3502:1: ( rule__Else__Group__2__Impl rule__Else__Group__3 )
            // InternalBlockchain.g:3503:2: rule__Else__Group__2__Impl rule__Else__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Else__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__2"


    // $ANTLR start "rule__Else__Group__2__Impl"
    // InternalBlockchain.g:3510:1: rule__Else__Group__2__Impl : ( ( rule__Else__LineasAssignment_2 )* ) ;
    public final void rule__Else__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3514:1: ( ( ( rule__Else__LineasAssignment_2 )* ) )
            // InternalBlockchain.g:3515:1: ( ( rule__Else__LineasAssignment_2 )* )
            {
            // InternalBlockchain.g:3515:1: ( ( rule__Else__LineasAssignment_2 )* )
            // InternalBlockchain.g:3516:2: ( rule__Else__LineasAssignment_2 )*
            {
             before(grammarAccess.getElseAccess().getLineasAssignment_2()); 
            // InternalBlockchain.g:3517:2: ( rule__Else__LineasAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=50 && LA42_0<=53)||(LA42_0>=55 && LA42_0<=59)||(LA42_0>=61 && LA42_0<=62)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBlockchain.g:3517:3: rule__Else__LineasAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Else__LineasAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getElseAccess().getLineasAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__2__Impl"


    // $ANTLR start "rule__Else__Group__3"
    // InternalBlockchain.g:3525:1: rule__Else__Group__3 : rule__Else__Group__3__Impl ;
    public final void rule__Else__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3529:1: ( rule__Else__Group__3__Impl )
            // InternalBlockchain.g:3530:2: rule__Else__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__3"


    // $ANTLR start "rule__Else__Group__3__Impl"
    // InternalBlockchain.g:3536:1: rule__Else__Group__3__Impl : ( '}' ) ;
    public final void rule__Else__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3540:1: ( ( '}' ) )
            // InternalBlockchain.g:3541:1: ( '}' )
            {
            // InternalBlockchain.g:3541:1: ( '}' )
            // InternalBlockchain.g:3542:2: '}'
            {
             before(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__3__Impl"


    // $ANTLR start "rule__ExpresionNumericaInt__Group__0"
    // InternalBlockchain.g:3552:1: rule__ExpresionNumericaInt__Group__0 : rule__ExpresionNumericaInt__Group__0__Impl rule__ExpresionNumericaInt__Group__1 ;
    public final void rule__ExpresionNumericaInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3556:1: ( rule__ExpresionNumericaInt__Group__0__Impl rule__ExpresionNumericaInt__Group__1 )
            // InternalBlockchain.g:3557:2: rule__ExpresionNumericaInt__Group__0__Impl rule__ExpresionNumericaInt__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ExpresionNumericaInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaInt__Group__0"


    // $ANTLR start "rule__ExpresionNumericaInt__Group__0__Impl"
    // InternalBlockchain.g:3564:1: rule__ExpresionNumericaInt__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionNumericaInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3568:1: ( ( () ) )
            // InternalBlockchain.g:3569:1: ( () )
            {
            // InternalBlockchain.g:3569:1: ( () )
            // InternalBlockchain.g:3570:2: ()
            {
             before(grammarAccess.getExpresionNumericaIntAccess().getExpresionNumericaIntAction_0()); 
            // InternalBlockchain.g:3571:2: ()
            // InternalBlockchain.g:3571:3: 
            {
            }

             after(grammarAccess.getExpresionNumericaIntAccess().getExpresionNumericaIntAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaInt__Group__0__Impl"


    // $ANTLR start "rule__ExpresionNumericaInt__Group__1"
    // InternalBlockchain.g:3579:1: rule__ExpresionNumericaInt__Group__1 : rule__ExpresionNumericaInt__Group__1__Impl rule__ExpresionNumericaInt__Group__2 ;
    public final void rule__ExpresionNumericaInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3583:1: ( rule__ExpresionNumericaInt__Group__1__Impl rule__ExpresionNumericaInt__Group__2 )
            // InternalBlockchain.g:3584:2: rule__ExpresionNumericaInt__Group__1__Impl rule__ExpresionNumericaInt__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__ExpresionNumericaInt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaInt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaInt__Group__1"


    // $ANTLR start "rule__ExpresionNumericaInt__Group__1__Impl"
    // InternalBlockchain.g:3591:1: rule__ExpresionNumericaInt__Group__1__Impl : ( 'ExpNum' ) ;
    public final void rule__ExpresionNumericaInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3595:1: ( ( 'ExpNum' ) )
            // InternalBlockchain.g:3596:1: ( 'ExpNum' )
            {
            // InternalBlockchain.g:3596:1: ( 'ExpNum' )
            // InternalBlockchain.g:3597:2: 'ExpNum'
            {
             before(grammarAccess.getExpresionNumericaIntAccess().getExpNumKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getExpresionNumericaIntAccess().getExpNumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaInt__Group__1__Impl"


    // $ANTLR start "rule__ExpresionNumericaInt__Group__2"
    // InternalBlockchain.g:3606:1: rule__ExpresionNumericaInt__Group__2 : rule__ExpresionNumericaInt__Group__2__Impl ;
    public final void rule__ExpresionNumericaInt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3610:1: ( rule__ExpresionNumericaInt__Group__2__Impl )
            // InternalBlockchain.g:3611:2: rule__ExpresionNumericaInt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaInt__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaInt__Group__2"


    // $ANTLR start "rule__ExpresionNumericaInt__Group__2__Impl"
    // InternalBlockchain.g:3617:1: rule__ExpresionNumericaInt__Group__2__Impl : ( ( rule__ExpresionNumericaInt__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionNumericaInt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3621:1: ( ( ( rule__ExpresionNumericaInt__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3622:1: ( ( rule__ExpresionNumericaInt__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3622:1: ( ( rule__ExpresionNumericaInt__ValueAssignment_2 )? )
            // InternalBlockchain.g:3623:2: ( rule__ExpresionNumericaInt__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionNumericaIntAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3624:2: ( rule__ExpresionNumericaInt__ValueAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_INT) ) {
                    alt43=1;
                }
            }
            else if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBlockchain.g:3624:3: rule__ExpresionNumericaInt__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionNumericaInt__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionNumericaIntAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaInt__Group__2__Impl"


    // $ANTLR start "rule__ExpresionNumericaDouble__Group__0"
    // InternalBlockchain.g:3633:1: rule__ExpresionNumericaDouble__Group__0 : rule__ExpresionNumericaDouble__Group__0__Impl rule__ExpresionNumericaDouble__Group__1 ;
    public final void rule__ExpresionNumericaDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3637:1: ( rule__ExpresionNumericaDouble__Group__0__Impl rule__ExpresionNumericaDouble__Group__1 )
            // InternalBlockchain.g:3638:2: rule__ExpresionNumericaDouble__Group__0__Impl rule__ExpresionNumericaDouble__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ExpresionNumericaDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaDouble__Group__0"


    // $ANTLR start "rule__ExpresionNumericaDouble__Group__0__Impl"
    // InternalBlockchain.g:3645:1: rule__ExpresionNumericaDouble__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionNumericaDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3649:1: ( ( () ) )
            // InternalBlockchain.g:3650:1: ( () )
            {
            // InternalBlockchain.g:3650:1: ( () )
            // InternalBlockchain.g:3651:2: ()
            {
             before(grammarAccess.getExpresionNumericaDoubleAccess().getExpresionNumericaDoubleAction_0()); 
            // InternalBlockchain.g:3652:2: ()
            // InternalBlockchain.g:3652:3: 
            {
            }

             after(grammarAccess.getExpresionNumericaDoubleAccess().getExpresionNumericaDoubleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaDouble__Group__0__Impl"


    // $ANTLR start "rule__ExpresionNumericaDouble__Group__1"
    // InternalBlockchain.g:3660:1: rule__ExpresionNumericaDouble__Group__1 : rule__ExpresionNumericaDouble__Group__1__Impl rule__ExpresionNumericaDouble__Group__2 ;
    public final void rule__ExpresionNumericaDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3664:1: ( rule__ExpresionNumericaDouble__Group__1__Impl rule__ExpresionNumericaDouble__Group__2 )
            // InternalBlockchain.g:3665:2: rule__ExpresionNumericaDouble__Group__1__Impl rule__ExpresionNumericaDouble__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ExpresionNumericaDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaDouble__Group__1"


    // $ANTLR start "rule__ExpresionNumericaDouble__Group__1__Impl"
    // InternalBlockchain.g:3672:1: rule__ExpresionNumericaDouble__Group__1__Impl : ( 'ExpNumDouble' ) ;
    public final void rule__ExpresionNumericaDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3676:1: ( ( 'ExpNumDouble' ) )
            // InternalBlockchain.g:3677:1: ( 'ExpNumDouble' )
            {
            // InternalBlockchain.g:3677:1: ( 'ExpNumDouble' )
            // InternalBlockchain.g:3678:2: 'ExpNumDouble'
            {
             before(grammarAccess.getExpresionNumericaDoubleAccess().getExpNumDoubleKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getExpresionNumericaDoubleAccess().getExpNumDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaDouble__Group__1__Impl"


    // $ANTLR start "rule__ExpresionNumericaDouble__Group__2"
    // InternalBlockchain.g:3687:1: rule__ExpresionNumericaDouble__Group__2 : rule__ExpresionNumericaDouble__Group__2__Impl ;
    public final void rule__ExpresionNumericaDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3691:1: ( rule__ExpresionNumericaDouble__Group__2__Impl )
            // InternalBlockchain.g:3692:2: rule__ExpresionNumericaDouble__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumericaDouble__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaDouble__Group__2"


    // $ANTLR start "rule__ExpresionNumericaDouble__Group__2__Impl"
    // InternalBlockchain.g:3698:1: rule__ExpresionNumericaDouble__Group__2__Impl : ( ( rule__ExpresionNumericaDouble__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionNumericaDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3702:1: ( ( ( rule__ExpresionNumericaDouble__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3703:1: ( ( rule__ExpresionNumericaDouble__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3703:1: ( ( rule__ExpresionNumericaDouble__ValueAssignment_2 )? )
            // InternalBlockchain.g:3704:2: ( rule__ExpresionNumericaDouble__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionNumericaDoubleAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3705:2: ( rule__ExpresionNumericaDouble__ValueAssignment_2 )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==RULE_INT||LA44_1==11) ) {
                        alt44=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt44=1;
                    }
                    break;
                case 11:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (LA44_3==RULE_INT) ) {
                        alt44=1;
                    }
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // InternalBlockchain.g:3705:3: rule__ExpresionNumericaDouble__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionNumericaDouble__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionNumericaDoubleAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaDouble__Group__2__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__0"
    // InternalBlockchain.g:3714:1: rule__ExpresionTexto__Group__0 : rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 ;
    public final void rule__ExpresionTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3718:1: ( rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 )
            // InternalBlockchain.g:3719:2: rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ExpresionTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__0"


    // $ANTLR start "rule__ExpresionTexto__Group__0__Impl"
    // InternalBlockchain.g:3726:1: rule__ExpresionTexto__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3730:1: ( ( () ) )
            // InternalBlockchain.g:3731:1: ( () )
            {
            // InternalBlockchain.g:3731:1: ( () )
            // InternalBlockchain.g:3732:2: ()
            {
             before(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 
            // InternalBlockchain.g:3733:2: ()
            // InternalBlockchain.g:3733:3: 
            {
            }

             after(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__0__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__1"
    // InternalBlockchain.g:3741:1: rule__ExpresionTexto__Group__1 : rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 ;
    public final void rule__ExpresionTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3745:1: ( rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 )
            // InternalBlockchain.g:3746:2: rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExpresionTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__1"


    // $ANTLR start "rule__ExpresionTexto__Group__1__Impl"
    // InternalBlockchain.g:3753:1: rule__ExpresionTexto__Group__1__Impl : ( 'ExpTex' ) ;
    public final void rule__ExpresionTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3757:1: ( ( 'ExpTex' ) )
            // InternalBlockchain.g:3758:1: ( 'ExpTex' )
            {
            // InternalBlockchain.g:3758:1: ( 'ExpTex' )
            // InternalBlockchain.g:3759:2: 'ExpTex'
            {
             before(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__1__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__2"
    // InternalBlockchain.g:3768:1: rule__ExpresionTexto__Group__2 : rule__ExpresionTexto__Group__2__Impl ;
    public final void rule__ExpresionTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3772:1: ( rule__ExpresionTexto__Group__2__Impl )
            // InternalBlockchain.g:3773:2: rule__ExpresionTexto__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__2"


    // $ANTLR start "rule__ExpresionTexto__Group__2__Impl"
    // InternalBlockchain.g:3779:1: rule__ExpresionTexto__Group__2__Impl : ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3783:1: ( ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3784:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3784:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            // InternalBlockchain.g:3785:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3786:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBlockchain.g:3786:3: rule__ExpresionTexto__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionTexto__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__2__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__0"
    // InternalBlockchain.g:3795:1: rule__ExpresionBoolean__Group__0 : rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 ;
    public final void rule__ExpresionBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3799:1: ( rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 )
            // InternalBlockchain.g:3800:2: rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__ExpresionBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__0"


    // $ANTLR start "rule__ExpresionBoolean__Group__0__Impl"
    // InternalBlockchain.g:3807:1: rule__ExpresionBoolean__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3811:1: ( ( () ) )
            // InternalBlockchain.g:3812:1: ( () )
            {
            // InternalBlockchain.g:3812:1: ( () )
            // InternalBlockchain.g:3813:2: ()
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 
            // InternalBlockchain.g:3814:2: ()
            // InternalBlockchain.g:3814:3: 
            {
            }

             after(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__0__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__1"
    // InternalBlockchain.g:3822:1: rule__ExpresionBoolean__Group__1 : rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 ;
    public final void rule__ExpresionBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3826:1: ( rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 )
            // InternalBlockchain.g:3827:2: rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ExpresionBoolean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__1"


    // $ANTLR start "rule__ExpresionBoolean__Group__1__Impl"
    // InternalBlockchain.g:3834:1: rule__ExpresionBoolean__Group__1__Impl : ( 'ExpBool' ) ;
    public final void rule__ExpresionBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3838:1: ( ( 'ExpBool' ) )
            // InternalBlockchain.g:3839:1: ( 'ExpBool' )
            {
            // InternalBlockchain.g:3839:1: ( 'ExpBool' )
            // InternalBlockchain.g:3840:2: 'ExpBool'
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__1__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__2"
    // InternalBlockchain.g:3849:1: rule__ExpresionBoolean__Group__2 : rule__ExpresionBoolean__Group__2__Impl ;
    public final void rule__ExpresionBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3853:1: ( rule__ExpresionBoolean__Group__2__Impl )
            // InternalBlockchain.g:3854:2: rule__ExpresionBoolean__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__2"


    // $ANTLR start "rule__ExpresionBoolean__Group__2__Impl"
    // InternalBlockchain.g:3860:1: rule__ExpresionBoolean__Group__2__Impl : ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3864:1: ( ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3865:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3865:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            // InternalBlockchain.g:3866:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3867:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=12 && LA46_0<=13)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBlockchain.g:3867:3: rule__ExpresionBoolean__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionBoolean__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__2__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__0"
    // InternalBlockchain.g:3876:1: rule__ExpresionReferenciada__Group__0 : rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 ;
    public final void rule__ExpresionReferenciada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3880:1: ( rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 )
            // InternalBlockchain.g:3881:2: rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpresionReferenciada__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__0"


    // $ANTLR start "rule__ExpresionReferenciada__Group__0__Impl"
    // InternalBlockchain.g:3888:1: rule__ExpresionReferenciada__Group__0__Impl : ( 'ExpRef' ) ;
    public final void rule__ExpresionReferenciada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3892:1: ( ( 'ExpRef' ) )
            // InternalBlockchain.g:3893:1: ( 'ExpRef' )
            {
            // InternalBlockchain.g:3893:1: ( 'ExpRef' )
            // InternalBlockchain.g:3894:2: 'ExpRef'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__0__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__1"
    // InternalBlockchain.g:3903:1: rule__ExpresionReferenciada__Group__1 : rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 ;
    public final void rule__ExpresionReferenciada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3907:1: ( rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 )
            // InternalBlockchain.g:3908:2: rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__ExpresionReferenciada__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__1"


    // $ANTLR start "rule__ExpresionReferenciada__Group__1__Impl"
    // InternalBlockchain.g:3915:1: rule__ExpresionReferenciada__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpresionReferenciada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3919:1: ( ( '{' ) )
            // InternalBlockchain.g:3920:1: ( '{' )
            {
            // InternalBlockchain.g:3920:1: ( '{' )
            // InternalBlockchain.g:3921:2: '{'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__1__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__2"
    // InternalBlockchain.g:3930:1: rule__ExpresionReferenciada__Group__2 : rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 ;
    public final void rule__ExpresionReferenciada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3934:1: ( rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 )
            // InternalBlockchain.g:3935:2: rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__ExpresionReferenciada__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__2"


    // $ANTLR start "rule__ExpresionReferenciada__Group__2__Impl"
    // InternalBlockchain.g:3942:1: rule__ExpresionReferenciada__Group__2__Impl : ( ( rule__ExpresionReferenciada__Group_2__0 )? ) ;
    public final void rule__ExpresionReferenciada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3946:1: ( ( ( rule__ExpresionReferenciada__Group_2__0 )? ) )
            // InternalBlockchain.g:3947:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            {
            // InternalBlockchain.g:3947:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            // InternalBlockchain.g:3948:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 
            // InternalBlockchain.g:3949:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBlockchain.g:3949:3: rule__ExpresionReferenciada__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionReferenciada__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__2__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__3"
    // InternalBlockchain.g:3957:1: rule__ExpresionReferenciada__Group__3 : rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 ;
    public final void rule__ExpresionReferenciada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3961:1: ( rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 )
            // InternalBlockchain.g:3962:2: rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__ExpresionReferenciada__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__3"


    // $ANTLR start "rule__ExpresionReferenciada__Group__3__Impl"
    // InternalBlockchain.g:3969:1: rule__ExpresionReferenciada__Group__3__Impl : ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) ;
    public final void rule__ExpresionReferenciada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3973:1: ( ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) )
            // InternalBlockchain.g:3974:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            {
            // InternalBlockchain.g:3974:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            // InternalBlockchain.g:3975:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3()); 
            // InternalBlockchain.g:3976:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            // InternalBlockchain.g:3976:3: rule__ExpresionReferenciada__ReferenciaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__ReferenciaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__3__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__4"
    // InternalBlockchain.g:3984:1: rule__ExpresionReferenciada__Group__4 : rule__ExpresionReferenciada__Group__4__Impl ;
    public final void rule__ExpresionReferenciada__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3988:1: ( rule__ExpresionReferenciada__Group__4__Impl )
            // InternalBlockchain.g:3989:2: rule__ExpresionReferenciada__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__4"


    // $ANTLR start "rule__ExpresionReferenciada__Group__4__Impl"
    // InternalBlockchain.g:3995:1: rule__ExpresionReferenciada__Group__4__Impl : ( '}' ) ;
    public final void rule__ExpresionReferenciada__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3999:1: ( ( '}' ) )
            // InternalBlockchain.g:4000:1: ( '}' )
            {
            // InternalBlockchain.g:4000:1: ( '}' )
            // InternalBlockchain.g:4001:2: '}'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__4__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__0"
    // InternalBlockchain.g:4011:1: rule__ExpresionReferenciada__Group_2__0 : rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 ;
    public final void rule__ExpresionReferenciada__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4015:1: ( rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 )
            // InternalBlockchain.g:4016:2: rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__ExpresionReferenciada__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__0"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__0__Impl"
    // InternalBlockchain.g:4023:1: rule__ExpresionReferenciada__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionReferenciada__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4027:1: ( ( 'id' ) )
            // InternalBlockchain.g:4028:1: ( 'id' )
            {
            // InternalBlockchain.g:4028:1: ( 'id' )
            // InternalBlockchain.g:4029:2: 'id'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__0__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__1"
    // InternalBlockchain.g:4038:1: rule__ExpresionReferenciada__Group_2__1 : rule__ExpresionReferenciada__Group_2__1__Impl ;
    public final void rule__ExpresionReferenciada__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4042:1: ( rule__ExpresionReferenciada__Group_2__1__Impl )
            // InternalBlockchain.g:4043:2: rule__ExpresionReferenciada__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__1"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__1__Impl"
    // InternalBlockchain.g:4049:1: rule__ExpresionReferenciada__Group_2__1__Impl : ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) ;
    public final void rule__ExpresionReferenciada__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4053:1: ( ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) )
            // InternalBlockchain.g:4054:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            {
            // InternalBlockchain.g:4054:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            // InternalBlockchain.g:4055:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 
            // InternalBlockchain.g:4056:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            // InternalBlockchain.g:4056:3: rule__ExpresionReferenciada__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__1__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__0"
    // InternalBlockchain.g:4065:1: rule__ExpresionRelacional__Group__0 : rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 ;
    public final void rule__ExpresionRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4069:1: ( rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 )
            // InternalBlockchain.g:4070:2: rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ExpresionRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__0"


    // $ANTLR start "rule__ExpresionRelacional__Group__0__Impl"
    // InternalBlockchain.g:4077:1: rule__ExpresionRelacional__Group__0__Impl : ( 'ExpRel' ) ;
    public final void rule__ExpresionRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4081:1: ( ( 'ExpRel' ) )
            // InternalBlockchain.g:4082:1: ( 'ExpRel' )
            {
            // InternalBlockchain.g:4082:1: ( 'ExpRel' )
            // InternalBlockchain.g:4083:2: 'ExpRel'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__0__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__1"
    // InternalBlockchain.g:4092:1: rule__ExpresionRelacional__Group__1 : rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 ;
    public final void rule__ExpresionRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4096:1: ( rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 )
            // InternalBlockchain.g:4097:2: rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__ExpresionRelacional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__1"


    // $ANTLR start "rule__ExpresionRelacional__Group__1__Impl"
    // InternalBlockchain.g:4104:1: rule__ExpresionRelacional__Group__1__Impl : ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) ;
    public final void rule__ExpresionRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4108:1: ( ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) )
            // InternalBlockchain.g:4109:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            {
            // InternalBlockchain.g:4109:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            // InternalBlockchain.g:4110:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 
            // InternalBlockchain.g:4111:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            // InternalBlockchain.g:4111:3: rule__ExpresionRelacional__IzqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__IzqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__1__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__2"
    // InternalBlockchain.g:4119:1: rule__ExpresionRelacional__Group__2 : rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 ;
    public final void rule__ExpresionRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4123:1: ( rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 )
            // InternalBlockchain.g:4124:2: rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__ExpresionRelacional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__2"


    // $ANTLR start "rule__ExpresionRelacional__Group__2__Impl"
    // InternalBlockchain.g:4131:1: rule__ExpresionRelacional__Group__2__Impl : ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) ;
    public final void rule__ExpresionRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4135:1: ( ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) )
            // InternalBlockchain.g:4136:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            {
            // InternalBlockchain.g:4136:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            // InternalBlockchain.g:4137:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 
            // InternalBlockchain.g:4138:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBlockchain.g:4138:3: rule__ExpresionRelacional__OperadorRelacionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionRelacional__OperadorRelacionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__2__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__3"
    // InternalBlockchain.g:4146:1: rule__ExpresionRelacional__Group__3 : rule__ExpresionRelacional__Group__3__Impl ;
    public final void rule__ExpresionRelacional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4150:1: ( rule__ExpresionRelacional__Group__3__Impl )
            // InternalBlockchain.g:4151:2: rule__ExpresionRelacional__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__3"


    // $ANTLR start "rule__ExpresionRelacional__Group__3__Impl"
    // InternalBlockchain.g:4157:1: rule__ExpresionRelacional__Group__3__Impl : ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) ;
    public final void rule__ExpresionRelacional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4161:1: ( ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) )
            // InternalBlockchain.g:4162:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            {
            // InternalBlockchain.g:4162:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            // InternalBlockchain.g:4163:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 
            // InternalBlockchain.g:4164:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            // InternalBlockchain.g:4164:3: rule__ExpresionRelacional__DerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__DerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__3__Impl"


    // $ANTLR start "rule__Retorno__Group__0"
    // InternalBlockchain.g:4173:1: rule__Retorno__Group__0 : rule__Retorno__Group__0__Impl rule__Retorno__Group__1 ;
    public final void rule__Retorno__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4177:1: ( rule__Retorno__Group__0__Impl rule__Retorno__Group__1 )
            // InternalBlockchain.g:4178:2: rule__Retorno__Group__0__Impl rule__Retorno__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Retorno__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retorno__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__0"


    // $ANTLR start "rule__Retorno__Group__0__Impl"
    // InternalBlockchain.g:4185:1: rule__Retorno__Group__0__Impl : ( 'return' ) ;
    public final void rule__Retorno__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4189:1: ( ( 'return' ) )
            // InternalBlockchain.g:4190:1: ( 'return' )
            {
            // InternalBlockchain.g:4190:1: ( 'return' )
            // InternalBlockchain.g:4191:2: 'return'
            {
             before(grammarAccess.getRetornoAccess().getReturnKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRetornoAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__0__Impl"


    // $ANTLR start "rule__Retorno__Group__1"
    // InternalBlockchain.g:4200:1: rule__Retorno__Group__1 : rule__Retorno__Group__1__Impl rule__Retorno__Group__2 ;
    public final void rule__Retorno__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4204:1: ( rule__Retorno__Group__1__Impl rule__Retorno__Group__2 )
            // InternalBlockchain.g:4205:2: rule__Retorno__Group__1__Impl rule__Retorno__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Retorno__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retorno__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__1"


    // $ANTLR start "rule__Retorno__Group__1__Impl"
    // InternalBlockchain.g:4212:1: rule__Retorno__Group__1__Impl : ( '{' ) ;
    public final void rule__Retorno__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4216:1: ( ( '{' ) )
            // InternalBlockchain.g:4217:1: ( '{' )
            {
            // InternalBlockchain.g:4217:1: ( '{' )
            // InternalBlockchain.g:4218:2: '{'
            {
             before(grammarAccess.getRetornoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRetornoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__1__Impl"


    // $ANTLR start "rule__Retorno__Group__2"
    // InternalBlockchain.g:4227:1: rule__Retorno__Group__2 : rule__Retorno__Group__2__Impl rule__Retorno__Group__3 ;
    public final void rule__Retorno__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4231:1: ( rule__Retorno__Group__2__Impl rule__Retorno__Group__3 )
            // InternalBlockchain.g:4232:2: rule__Retorno__Group__2__Impl rule__Retorno__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Retorno__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retorno__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__2"


    // $ANTLR start "rule__Retorno__Group__2__Impl"
    // InternalBlockchain.g:4239:1: rule__Retorno__Group__2__Impl : ( ( rule__Retorno__LineaRetornoAssignment_2 )* ) ;
    public final void rule__Retorno__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4243:1: ( ( ( rule__Retorno__LineaRetornoAssignment_2 )* ) )
            // InternalBlockchain.g:4244:1: ( ( rule__Retorno__LineaRetornoAssignment_2 )* )
            {
            // InternalBlockchain.g:4244:1: ( ( rule__Retorno__LineaRetornoAssignment_2 )* )
            // InternalBlockchain.g:4245:2: ( rule__Retorno__LineaRetornoAssignment_2 )*
            {
             before(grammarAccess.getRetornoAccess().getLineaRetornoAssignment_2()); 
            // InternalBlockchain.g:4246:2: ( rule__Retorno__LineaRetornoAssignment_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=50 && LA49_0<=53)||(LA49_0>=55 && LA49_0<=59)||(LA49_0>=61 && LA49_0<=62)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBlockchain.g:4246:3: rule__Retorno__LineaRetornoAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Retorno__LineaRetornoAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getRetornoAccess().getLineaRetornoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__2__Impl"


    // $ANTLR start "rule__Retorno__Group__3"
    // InternalBlockchain.g:4254:1: rule__Retorno__Group__3 : rule__Retorno__Group__3__Impl ;
    public final void rule__Retorno__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4258:1: ( rule__Retorno__Group__3__Impl )
            // InternalBlockchain.g:4259:2: rule__Retorno__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Retorno__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__3"


    // $ANTLR start "rule__Retorno__Group__3__Impl"
    // InternalBlockchain.g:4265:1: rule__Retorno__Group__3__Impl : ( '}' ) ;
    public final void rule__Retorno__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4269:1: ( ( '}' ) )
            // InternalBlockchain.g:4270:1: ( '}' )
            {
            // InternalBlockchain.g:4270:1: ( '}' )
            // InternalBlockchain.g:4271:2: '}'
            {
             before(grammarAccess.getRetornoAccess().getRightCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRetornoAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalBlockchain.g:4281:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4285:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalBlockchain.g:4286:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalBlockchain.g:4293:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4297:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4298:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4298:1: ( ( '-' )? )
            // InternalBlockchain.g:4299:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4300:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==25) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBlockchain.g:4300:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalBlockchain.g:4308:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4312:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalBlockchain.g:4313:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalBlockchain.g:4320:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4324:1: ( ( ( RULE_INT )? ) )
            // InternalBlockchain.g:4325:1: ( ( RULE_INT )? )
            {
            // InternalBlockchain.g:4325:1: ( ( RULE_INT )? )
            // InternalBlockchain.g:4326:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalBlockchain.g:4327:2: ( RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBlockchain.g:4327:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalBlockchain.g:4335:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4339:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalBlockchain.g:4340:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalBlockchain.g:4347:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4351:1: ( ( '.' ) )
            // InternalBlockchain.g:4352:1: ( '.' )
            {
            // InternalBlockchain.g:4352:1: ( '.' )
            // InternalBlockchain.g:4353:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalBlockchain.g:4362:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4366:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalBlockchain.g:4367:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalBlockchain.g:4374:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4378:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4379:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4379:1: ( RULE_INT )
            // InternalBlockchain.g:4380:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalBlockchain.g:4389:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4393:1: ( rule__EDouble__Group__4__Impl )
            // InternalBlockchain.g:4394:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalBlockchain.g:4400:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4404:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalBlockchain.g:4405:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalBlockchain.g:4405:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalBlockchain.g:4406:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalBlockchain.g:4407:2: ( rule__EDouble__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=14 && LA52_0<=15)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBlockchain.g:4407:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalBlockchain.g:4416:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4420:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalBlockchain.g:4421:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_40);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalBlockchain.g:4428:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4432:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalBlockchain.g:4433:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalBlockchain.g:4433:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalBlockchain.g:4434:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalBlockchain.g:4435:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalBlockchain.g:4435:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalBlockchain.g:4443:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4447:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalBlockchain.g:4448:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_40);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalBlockchain.g:4455:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4459:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4460:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4460:1: ( ( '-' )? )
            // InternalBlockchain.g:4461:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBlockchain.g:4462:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==25) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBlockchain.g:4462:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalBlockchain.g:4470:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4474:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalBlockchain.g:4475:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalBlockchain.g:4481:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4485:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4486:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4486:1: ( RULE_INT )
            // InternalBlockchain.g:4487:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBlockchain.g:4497:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4501:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBlockchain.g:4502:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBlockchain.g:4509:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4513:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4514:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4514:1: ( ( '-' )? )
            // InternalBlockchain.g:4515:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4516:2: ( '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBlockchain.g:4516:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBlockchain.g:4524:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4528:1: ( rule__EInt__Group__1__Impl )
            // InternalBlockchain.g:4529:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBlockchain.g:4535:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4539:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4540:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4540:1: ( RULE_INT )
            // InternalBlockchain.g:4541:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Primitivo__Group__0"
    // InternalBlockchain.g:4551:1: rule__Primitivo__Group__0 : rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 ;
    public final void rule__Primitivo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4555:1: ( rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 )
            // InternalBlockchain.g:4556:2: rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Primitivo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__0"


    // $ANTLR start "rule__Primitivo__Group__0__Impl"
    // InternalBlockchain.g:4563:1: rule__Primitivo__Group__0__Impl : ( () ) ;
    public final void rule__Primitivo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4567:1: ( ( () ) )
            // InternalBlockchain.g:4568:1: ( () )
            {
            // InternalBlockchain.g:4568:1: ( () )
            // InternalBlockchain.g:4569:2: ()
            {
             before(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 
            // InternalBlockchain.g:4570:2: ()
            // InternalBlockchain.g:4570:3: 
            {
            }

             after(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__0__Impl"


    // $ANTLR start "rule__Primitivo__Group__1"
    // InternalBlockchain.g:4578:1: rule__Primitivo__Group__1 : rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 ;
    public final void rule__Primitivo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4582:1: ( rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 )
            // InternalBlockchain.g:4583:2: rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Primitivo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__1"


    // $ANTLR start "rule__Primitivo__Group__1__Impl"
    // InternalBlockchain.g:4590:1: rule__Primitivo__Group__1__Impl : ( ( rule__Primitivo__TipoAssignment_1 )? ) ;
    public final void rule__Primitivo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4594:1: ( ( ( rule__Primitivo__TipoAssignment_1 )? ) )
            // InternalBlockchain.g:4595:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            {
            // InternalBlockchain.g:4595:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            // InternalBlockchain.g:4596:2: ( rule__Primitivo__TipoAssignment_1 )?
            {
             before(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 
            // InternalBlockchain.g:4597:2: ( rule__Primitivo__TipoAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=32 && LA55_0<=36)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBlockchain.g:4597:3: rule__Primitivo__TipoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitivo__TipoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__1__Impl"


    // $ANTLR start "rule__Primitivo__Group__2"
    // InternalBlockchain.g:4605:1: rule__Primitivo__Group__2 : rule__Primitivo__Group__2__Impl ;
    public final void rule__Primitivo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4609:1: ( rule__Primitivo__Group__2__Impl )
            // InternalBlockchain.g:4610:2: rule__Primitivo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__2"


    // $ANTLR start "rule__Primitivo__Group__2__Impl"
    // InternalBlockchain.g:4616:1: rule__Primitivo__Group__2__Impl : ( ( rule__Primitivo__NameAssignment_2 ) ) ;
    public final void rule__Primitivo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4620:1: ( ( ( rule__Primitivo__NameAssignment_2 ) ) )
            // InternalBlockchain.g:4621:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:4621:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            // InternalBlockchain.g:4622:2: ( rule__Primitivo__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:4623:2: ( rule__Primitivo__NameAssignment_2 )
            // InternalBlockchain.g:4623:3: rule__Primitivo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__2__Impl"


    // $ANTLR start "rule__Mapa__Group__0"
    // InternalBlockchain.g:4632:1: rule__Mapa__Group__0 : rule__Mapa__Group__0__Impl rule__Mapa__Group__1 ;
    public final void rule__Mapa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4636:1: ( rule__Mapa__Group__0__Impl rule__Mapa__Group__1 )
            // InternalBlockchain.g:4637:2: rule__Mapa__Group__0__Impl rule__Mapa__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Mapa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__0"


    // $ANTLR start "rule__Mapa__Group__0__Impl"
    // InternalBlockchain.g:4644:1: rule__Mapa__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Mapa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4648:1: ( ( 'Map' ) )
            // InternalBlockchain.g:4649:1: ( 'Map' )
            {
            // InternalBlockchain.g:4649:1: ( 'Map' )
            // InternalBlockchain.g:4650:2: 'Map'
            {
             before(grammarAccess.getMapaAccess().getMapKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__0__Impl"


    // $ANTLR start "rule__Mapa__Group__1"
    // InternalBlockchain.g:4659:1: rule__Mapa__Group__1 : rule__Mapa__Group__1__Impl rule__Mapa__Group__2 ;
    public final void rule__Mapa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4663:1: ( rule__Mapa__Group__1__Impl rule__Mapa__Group__2 )
            // InternalBlockchain.g:4664:2: rule__Mapa__Group__1__Impl rule__Mapa__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__1"


    // $ANTLR start "rule__Mapa__Group__1__Impl"
    // InternalBlockchain.g:4671:1: rule__Mapa__Group__1__Impl : ( '<' ) ;
    public final void rule__Mapa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4675:1: ( ( '<' ) )
            // InternalBlockchain.g:4676:1: ( '<' )
            {
            // InternalBlockchain.g:4676:1: ( '<' )
            // InternalBlockchain.g:4677:2: '<'
            {
             before(grammarAccess.getMapaAccess().getLessThanSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__1__Impl"


    // $ANTLR start "rule__Mapa__Group__2"
    // InternalBlockchain.g:4686:1: rule__Mapa__Group__2 : rule__Mapa__Group__2__Impl rule__Mapa__Group__3 ;
    public final void rule__Mapa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4690:1: ( rule__Mapa__Group__2__Impl rule__Mapa__Group__3 )
            // InternalBlockchain.g:4691:2: rule__Mapa__Group__2__Impl rule__Mapa__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Mapa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__2"


    // $ANTLR start "rule__Mapa__Group__2__Impl"
    // InternalBlockchain.g:4698:1: rule__Mapa__Group__2__Impl : ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) ;
    public final void rule__Mapa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4702:1: ( ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) )
            // InternalBlockchain.g:4703:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            {
            // InternalBlockchain.g:4703:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            // InternalBlockchain.g:4704:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 
            // InternalBlockchain.g:4705:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            // InternalBlockchain.g:4705:3: rule__Mapa__TipoDatoKeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoKeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__2__Impl"


    // $ANTLR start "rule__Mapa__Group__3"
    // InternalBlockchain.g:4713:1: rule__Mapa__Group__3 : rule__Mapa__Group__3__Impl rule__Mapa__Group__4 ;
    public final void rule__Mapa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4717:1: ( rule__Mapa__Group__3__Impl rule__Mapa__Group__4 )
            // InternalBlockchain.g:4718:2: rule__Mapa__Group__3__Impl rule__Mapa__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__3"


    // $ANTLR start "rule__Mapa__Group__3__Impl"
    // InternalBlockchain.g:4725:1: rule__Mapa__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4729:1: ( ( ',' ) )
            // InternalBlockchain.g:4730:1: ( ',' )
            {
            // InternalBlockchain.g:4730:1: ( ',' )
            // InternalBlockchain.g:4731:2: ','
            {
             before(grammarAccess.getMapaAccess().getCommaKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__3__Impl"


    // $ANTLR start "rule__Mapa__Group__4"
    // InternalBlockchain.g:4740:1: rule__Mapa__Group__4 : rule__Mapa__Group__4__Impl rule__Mapa__Group__5 ;
    public final void rule__Mapa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4744:1: ( rule__Mapa__Group__4__Impl rule__Mapa__Group__5 )
            // InternalBlockchain.g:4745:2: rule__Mapa__Group__4__Impl rule__Mapa__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__Mapa__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__4"


    // $ANTLR start "rule__Mapa__Group__4__Impl"
    // InternalBlockchain.g:4752:1: rule__Mapa__Group__4__Impl : ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) ;
    public final void rule__Mapa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4756:1: ( ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) )
            // InternalBlockchain.g:4757:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            {
            // InternalBlockchain.g:4757:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            // InternalBlockchain.g:4758:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 
            // InternalBlockchain.g:4759:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            // InternalBlockchain.g:4759:3: rule__Mapa__TipoDatoValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__4__Impl"


    // $ANTLR start "rule__Mapa__Group__5"
    // InternalBlockchain.g:4767:1: rule__Mapa__Group__5 : rule__Mapa__Group__5__Impl rule__Mapa__Group__6 ;
    public final void rule__Mapa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4771:1: ( rule__Mapa__Group__5__Impl rule__Mapa__Group__6 )
            // InternalBlockchain.g:4772:2: rule__Mapa__Group__5__Impl rule__Mapa__Group__6
            {
            pushFollow(FOLLOW_53);
            rule__Mapa__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__5"


    // $ANTLR start "rule__Mapa__Group__5__Impl"
    // InternalBlockchain.g:4779:1: rule__Mapa__Group__5__Impl : ( '>' ) ;
    public final void rule__Mapa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4783:1: ( ( '>' ) )
            // InternalBlockchain.g:4784:1: ( '>' )
            {
            // InternalBlockchain.g:4784:1: ( '>' )
            // InternalBlockchain.g:4785:2: '>'
            {
             before(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__5__Impl"


    // $ANTLR start "rule__Mapa__Group__6"
    // InternalBlockchain.g:4794:1: rule__Mapa__Group__6 : rule__Mapa__Group__6__Impl rule__Mapa__Group__7 ;
    public final void rule__Mapa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4798:1: ( rule__Mapa__Group__6__Impl rule__Mapa__Group__7 )
            // InternalBlockchain.g:4799:2: rule__Mapa__Group__6__Impl rule__Mapa__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__6"


    // $ANTLR start "rule__Mapa__Group__6__Impl"
    // InternalBlockchain.g:4806:1: rule__Mapa__Group__6__Impl : ( ':' ) ;
    public final void rule__Mapa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4810:1: ( ( ':' ) )
            // InternalBlockchain.g:4811:1: ( ':' )
            {
            // InternalBlockchain.g:4811:1: ( ':' )
            // InternalBlockchain.g:4812:2: ':'
            {
             before(grammarAccess.getMapaAccess().getColonKeyword_6()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__6__Impl"


    // $ANTLR start "rule__Mapa__Group__7"
    // InternalBlockchain.g:4821:1: rule__Mapa__Group__7 : rule__Mapa__Group__7__Impl ;
    public final void rule__Mapa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4825:1: ( rule__Mapa__Group__7__Impl )
            // InternalBlockchain.g:4826:2: rule__Mapa__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__7"


    // $ANTLR start "rule__Mapa__Group__7__Impl"
    // InternalBlockchain.g:4832:1: rule__Mapa__Group__7__Impl : ( ( rule__Mapa__NameAssignment_7 ) ) ;
    public final void rule__Mapa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4836:1: ( ( ( rule__Mapa__NameAssignment_7 ) ) )
            // InternalBlockchain.g:4837:1: ( ( rule__Mapa__NameAssignment_7 ) )
            {
            // InternalBlockchain.g:4837:1: ( ( rule__Mapa__NameAssignment_7 ) )
            // InternalBlockchain.g:4838:2: ( rule__Mapa__NameAssignment_7 )
            {
             before(grammarAccess.getMapaAccess().getNameAssignment_7()); 
            // InternalBlockchain.g:4839:2: ( rule__Mapa__NameAssignment_7 )
            // InternalBlockchain.g:4839:3: rule__Mapa__NameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__7__Impl"


    // $ANTLR start "rule__Aplicacion__NameAssignment_2"
    // InternalBlockchain.g:4848:1: rule__Aplicacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Aplicacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4852:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4853:2: ( ruleEString )
            {
            // InternalBlockchain.g:4853:2: ( ruleEString )
            // InternalBlockchain.g:4854:3: ruleEString
            {
             before(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__NameAssignment_2"


    // $ANTLR start "rule__Aplicacion__SmartcontractAssignment_4_0"
    // InternalBlockchain.g:4863:1: rule__Aplicacion__SmartcontractAssignment_4_0 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4867:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4868:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4868:2: ( ruleSmartContract )
            // InternalBlockchain.g:4869:3: ruleSmartContract
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__SmartcontractAssignment_4_0"


    // $ANTLR start "rule__Aplicacion__SmartcontractAssignment_4_1"
    // InternalBlockchain.g:4878:1: rule__Aplicacion__SmartcontractAssignment_4_1 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4882:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4883:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4883:2: ( ruleSmartContract )
            // InternalBlockchain.g:4884:3: ruleSmartContract
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__SmartcontractAssignment_4_1"


    // $ANTLR start "rule__Aplicacion__TipodatoAssignment_5_1"
    // InternalBlockchain.g:4893:1: rule__Aplicacion__TipodatoAssignment_5_1 : ( ruleTipoDato ) ;
    public final void rule__Aplicacion__TipodatoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4897:1: ( ( ruleTipoDato ) )
            // InternalBlockchain.g:4898:2: ( ruleTipoDato )
            {
            // InternalBlockchain.g:4898:2: ( ruleTipoDato )
            // InternalBlockchain.g:4899:3: ruleTipoDato
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__TipodatoAssignment_5_1"


    // $ANTLR start "rule__SmartContract__NameAssignment_1"
    // InternalBlockchain.g:4908:1: rule__SmartContract__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SmartContract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4912:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4913:2: ( ruleEString )
            {
            // InternalBlockchain.g:4913:2: ( ruleEString )
            // InternalBlockchain.g:4914:3: ruleEString
            {
             before(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__NameAssignment_1"


    // $ANTLR start "rule__SmartContract__EntidadesAssignment_3_0"
    // InternalBlockchain.g:4923:1: rule__SmartContract__EntidadesAssignment_3_0 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4927:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4928:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4928:2: ( ruleEntidad )
            // InternalBlockchain.g:4929:3: ruleEntidad
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EntidadesAssignment_3_0"


    // $ANTLR start "rule__SmartContract__EntidadesAssignment_3_1"
    // InternalBlockchain.g:4938:1: rule__SmartContract__EntidadesAssignment_3_1 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4942:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4943:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4943:2: ( ruleEntidad )
            // InternalBlockchain.g:4944:3: ruleEntidad
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EntidadesAssignment_3_1"


    // $ANTLR start "rule__SmartContract__EstadoAssignment_4_0"
    // InternalBlockchain.g:4953:1: rule__SmartContract__EstadoAssignment_4_0 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4957:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4958:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4958:2: ( ruleEstado )
            // InternalBlockchain.g:4959:3: ruleEstado
            {
             before(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EstadoAssignment_4_0"


    // $ANTLR start "rule__SmartContract__EstadoAssignment_4_1"
    // InternalBlockchain.g:4968:1: rule__SmartContract__EstadoAssignment_4_1 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4972:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4973:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4973:2: ( ruleEstado )
            // InternalBlockchain.g:4974:3: ruleEstado
            {
             before(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EstadoAssignment_4_1"


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_0"
    // InternalBlockchain.g:4983:1: rule__SmartContract__OperacionesAssignment_5_0 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4987:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4988:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4988:2: ( ruleOperacion )
            // InternalBlockchain.g:4989:3: ruleOperacion
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OperacionesAssignment_5_0"


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_1"
    // InternalBlockchain.g:4998:1: rule__SmartContract__OperacionesAssignment_5_1 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5002:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:5003:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:5003:2: ( ruleOperacion )
            // InternalBlockchain.g:5004:3: ruleOperacion
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OperacionesAssignment_5_1"


    // $ANTLR start "rule__Entidad__NameAssignment_2"
    // InternalBlockchain.g:5013:1: rule__Entidad__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5017:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5018:2: ( ruleEString )
            {
            // InternalBlockchain.g:5018:2: ( ruleEString )
            // InternalBlockchain.g:5019:3: ruleEString
            {
             before(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__NameAssignment_2"


    // $ANTLR start "rule__Entidad__AtributosAssignment_4_0"
    // InternalBlockchain.g:5028:1: rule__Entidad__AtributosAssignment_4_0 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5032:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:5033:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:5033:2: ( ruleAtributo )
            // InternalBlockchain.g:5034:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributosAssignment_4_0"


    // $ANTLR start "rule__Entidad__AtributosAssignment_4_1"
    // InternalBlockchain.g:5043:1: rule__Entidad__AtributosAssignment_4_1 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5047:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:5048:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:5048:2: ( ruleAtributo )
            // InternalBlockchain.g:5049:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributosAssignment_4_1"


    // $ANTLR start "rule__Operacion__EsUserDefinedAssignment_1_1"
    // InternalBlockchain.g:5058:1: rule__Operacion__EsUserDefinedAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Operacion__EsUserDefinedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5062:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5063:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5063:2: ( ruleEBoolean )
            // InternalBlockchain.g:5064:3: ruleEBoolean
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__EsUserDefinedAssignment_1_1"


    // $ANTLR start "rule__Operacion__NameAssignment_2"
    // InternalBlockchain.g:5073:1: rule__Operacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5077:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5078:2: ( ruleEString )
            {
            // InternalBlockchain.g:5078:2: ( ruleEString )
            // InternalBlockchain.g:5079:3: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__NameAssignment_2"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_4_0"
    // InternalBlockchain.g:5088:1: rule__Operacion__ParametrosAssignment_4_0 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5092:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:5093:2: ( ruleParametro )
            {
            // InternalBlockchain.g:5093:2: ( ruleParametro )
            // InternalBlockchain.g:5094:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__ParametrosAssignment_4_0"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_4_1_1"
    // InternalBlockchain.g:5103:1: rule__Operacion__ParametrosAssignment_4_1_1 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5107:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:5108:2: ( ruleParametro )
            {
            // InternalBlockchain.g:5108:2: ( ruleParametro )
            // InternalBlockchain.g:5109:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__ParametrosAssignment_4_1_1"


    // $ANTLR start "rule__Operacion__RetornoAssignment_6_1"
    // InternalBlockchain.g:5118:1: rule__Operacion__RetornoAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Operacion__RetornoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5122:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5123:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5123:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5124:3: ( ruleEString )
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0()); 
            // InternalBlockchain.g:5125:3: ( ruleEString )
            // InternalBlockchain.g:5126:4: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__RetornoAssignment_6_1"


    // $ANTLR start "rule__Operacion__LineasAssignment_9"
    // InternalBlockchain.g:5137:1: rule__Operacion__LineasAssignment_9 : ( ruleLinea ) ;
    public final void rule__Operacion__LineasAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5141:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5142:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5142:2: ( ruleLinea )
            // InternalBlockchain.g:5143:3: ruleLinea
            {
             before(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__LineasAssignment_9"


    // $ANTLR start "rule__Estado__TipodatoAssignment_1"
    // InternalBlockchain.g:5152:1: rule__Estado__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Estado__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5156:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5157:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5157:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5158:3: ( ruleEString )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:5159:3: ( ruleEString )
            // InternalBlockchain.g:5160:4: ruleEString
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstadoAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__TipodatoAssignment_1"


    // $ANTLR start "rule__Estado__NameAssignment_2"
    // InternalBlockchain.g:5171:1: rule__Estado__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Estado__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5175:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5176:2: ( ruleEString )
            {
            // InternalBlockchain.g:5176:2: ( ruleEString )
            // InternalBlockchain.g:5177:3: ruleEString
            {
             before(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__NameAssignment_2"


    // $ANTLR start "rule__Atributo__TipodatoAssignment_0"
    // InternalBlockchain.g:5186:1: rule__Atributo__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Atributo__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5190:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5191:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5191:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5192:3: ( ruleEString )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:5193:3: ( ruleEString )
            // InternalBlockchain.g:5194:4: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__TipodatoAssignment_0"


    // $ANTLR start "rule__Atributo__NameAssignment_1"
    // InternalBlockchain.g:5205:1: rule__Atributo__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5209:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5210:2: ( ruleEString )
            {
            // InternalBlockchain.g:5210:2: ( ruleEString )
            // InternalBlockchain.g:5211:3: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NameAssignment_1"


    // $ANTLR start "rule__Parametro__TipodatoAssignment_0"
    // InternalBlockchain.g:5220:1: rule__Parametro__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parametro__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5224:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5225:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5225:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5226:3: ( ruleEString )
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:5227:3: ( ruleEString )
            // InternalBlockchain.g:5228:4: ruleEString
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__TipodatoAssignment_0"


    // $ANTLR start "rule__Parametro__NameAssignment_1"
    // InternalBlockchain.g:5239:1: rule__Parametro__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parametro__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5243:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5244:2: ( ruleEString )
            {
            // InternalBlockchain.g:5244:2: ( ruleEString )
            // InternalBlockchain.g:5245:3: ruleEString
            {
             before(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__NameAssignment_1"


    // $ANTLR start "rule__ExpresionLogica__IzqAssignment_2"
    // InternalBlockchain.g:5254:1: rule__ExpresionLogica__IzqAssignment_2 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__IzqAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5258:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5259:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5259:2: ( ruleExpresion )
            // InternalBlockchain.g:5260:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__IzqAssignment_2"


    // $ANTLR start "rule__ExpresionLogica__OperadorAssignment_4"
    // InternalBlockchain.g:5269:1: rule__ExpresionLogica__OperadorAssignment_4 : ( ruleOperadorLogico ) ;
    public final void rule__ExpresionLogica__OperadorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5273:1: ( ( ruleOperadorLogico ) )
            // InternalBlockchain.g:5274:2: ( ruleOperadorLogico )
            {
            // InternalBlockchain.g:5274:2: ( ruleOperadorLogico )
            // InternalBlockchain.g:5275:3: ruleOperadorLogico
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorLogico();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__OperadorAssignment_4"


    // $ANTLR start "rule__ExpresionLogica__DerAssignment_6"
    // InternalBlockchain.g:5284:1: rule__ExpresionLogica__DerAssignment_6 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__DerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5288:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5289:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5289:2: ( ruleExpresion )
            // InternalBlockchain.g:5290:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__DerAssignment_6"


    // $ANTLR start "rule__ExpresionAritmetica__IzqAssignment_3"
    // InternalBlockchain.g:5299:1: rule__ExpresionAritmetica__IzqAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__IzqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5303:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5304:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5304:2: ( ruleExpresion )
            // InternalBlockchain.g:5305:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__IzqAssignment_3"


    // $ANTLR start "rule__ExpresionAritmetica__OperadorAssignment_5"
    // InternalBlockchain.g:5314:1: rule__ExpresionAritmetica__OperadorAssignment_5 : ( ruleOperador ) ;
    public final void rule__ExpresionAritmetica__OperadorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5318:1: ( ( ruleOperador ) )
            // InternalBlockchain.g:5319:2: ( ruleOperador )
            {
            // InternalBlockchain.g:5319:2: ( ruleOperador )
            // InternalBlockchain.g:5320:3: ruleOperador
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__OperadorAssignment_5"


    // $ANTLR start "rule__ExpresionAritmetica__DerAssignment_7"
    // InternalBlockchain.g:5329:1: rule__ExpresionAritmetica__DerAssignment_7 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__DerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5333:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5334:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5334:2: ( ruleExpresion )
            // InternalBlockchain.g:5335:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__DerAssignment_7"


    // $ANTLR start "rule__Variable__TipodatoAssignment_1"
    // InternalBlockchain.g:5344:1: rule__Variable__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5348:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5349:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5349:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5350:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:5351:3: ( ruleEString )
            // InternalBlockchain.g:5352:4: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TipodatoAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_2"
    // InternalBlockchain.g:5363:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5367:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5368:2: ( ruleEString )
            {
            // InternalBlockchain.g:5368:2: ( ruleEString )
            // InternalBlockchain.g:5369:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_2"


    // $ANTLR start "rule__Condicional__ExpresionlogicaAssignment_1"
    // InternalBlockchain.g:5378:1: rule__Condicional__ExpresionlogicaAssignment_1 : ( ruleExpresionLogica ) ;
    public final void rule__Condicional__ExpresionlogicaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5382:1: ( ( ruleExpresionLogica ) )
            // InternalBlockchain.g:5383:2: ( ruleExpresionLogica )
            {
            // InternalBlockchain.g:5383:2: ( ruleExpresionLogica )
            // InternalBlockchain.g:5384:3: ruleExpresionLogica
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__ExpresionlogicaAssignment_1"


    // $ANTLR start "rule__Condicional__LineasAssignment_3"
    // InternalBlockchain.g:5393:1: rule__Condicional__LineasAssignment_3 : ( ruleLinea ) ;
    public final void rule__Condicional__LineasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5397:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5398:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5398:2: ( ruleLinea )
            // InternalBlockchain.g:5399:3: ruleLinea
            {
             before(grammarAccess.getCondicionalAccess().getLineasLineaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getLineasLineaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__LineasAssignment_3"


    // $ANTLR start "rule__Condicional__ElseLinesAssignment_5"
    // InternalBlockchain.g:5408:1: rule__Condicional__ElseLinesAssignment_5 : ( ruleElse ) ;
    public final void rule__Condicional__ElseLinesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5412:1: ( ( ruleElse ) )
            // InternalBlockchain.g:5413:2: ( ruleElse )
            {
            // InternalBlockchain.g:5413:2: ( ruleElse )
            // InternalBlockchain.g:5414:3: ruleElse
            {
             before(grammarAccess.getCondicionalAccess().getElseLinesElseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getElseLinesElseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__ElseLinesAssignment_5"


    // $ANTLR start "rule__Else__LineasAssignment_2"
    // InternalBlockchain.g:5423:1: rule__Else__LineasAssignment_2 : ( ruleLinea ) ;
    public final void rule__Else__LineasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5427:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5428:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5428:2: ( ruleLinea )
            // InternalBlockchain.g:5429:3: ruleLinea
            {
             before(grammarAccess.getElseAccess().getLineasLineaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getElseAccess().getLineasLineaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__LineasAssignment_2"


    // $ANTLR start "rule__ExpresionNumericaInt__ValueAssignment_2"
    // InternalBlockchain.g:5438:1: rule__ExpresionNumericaInt__ValueAssignment_2 : ( ruleEInt ) ;
    public final void rule__ExpresionNumericaInt__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5442:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5443:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5443:2: ( ruleEInt )
            // InternalBlockchain.g:5444:3: ruleEInt
            {
             before(grammarAccess.getExpresionNumericaIntAccess().getValueEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaIntAccess().getValueEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaInt__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionNumericaDouble__ValueAssignment_2"
    // InternalBlockchain.g:5453:1: rule__ExpresionNumericaDouble__ValueAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExpresionNumericaDouble__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5457:1: ( ( ruleEDouble ) )
            // InternalBlockchain.g:5458:2: ( ruleEDouble )
            {
            // InternalBlockchain.g:5458:2: ( ruleEDouble )
            // InternalBlockchain.g:5459:3: ruleEDouble
            {
             before(grammarAccess.getExpresionNumericaDoubleAccess().getValueEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaDoubleAccess().getValueEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumericaDouble__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionTexto__ValueAssignment_2"
    // InternalBlockchain.g:5468:1: rule__ExpresionTexto__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ExpresionTexto__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5472:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5473:2: ( ruleEString )
            {
            // InternalBlockchain.g:5473:2: ( ruleEString )
            // InternalBlockchain.g:5474:3: ruleEString
            {
             before(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionBoolean__ValueAssignment_2"
    // InternalBlockchain.g:5483:1: rule__ExpresionBoolean__ValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ExpresionBoolean__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5487:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5488:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5488:2: ( ruleEBoolean )
            // InternalBlockchain.g:5489:3: ruleEBoolean
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionReferenciada__IdAssignment_2_1"
    // InternalBlockchain.g:5498:1: rule__ExpresionReferenciada__IdAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__ExpresionReferenciada__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5502:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5503:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5503:2: ( ruleEInt )
            // InternalBlockchain.g:5504:3: ruleEInt
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__IdAssignment_2_1"


    // $ANTLR start "rule__ExpresionReferenciada__ReferenciaAssignment_3"
    // InternalBlockchain.g:5513:1: rule__ExpresionReferenciada__ReferenciaAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionReferenciada__ReferenciaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5517:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5518:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5518:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5519:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0()); 
            // InternalBlockchain.g:5520:3: ( ruleEString )
            // InternalBlockchain.g:5521:4: ruleEString
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__ReferenciaAssignment_3"


    // $ANTLR start "rule__ExpresionRelacional__IzqAssignment_1"
    // InternalBlockchain.g:5532:1: rule__ExpresionRelacional__IzqAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__IzqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5536:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5537:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5537:2: ( ruleExpresion )
            // InternalBlockchain.g:5538:3: ruleExpresion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__IzqAssignment_1"


    // $ANTLR start "rule__ExpresionRelacional__OperadorRelacionalAssignment_2"
    // InternalBlockchain.g:5547:1: rule__ExpresionRelacional__OperadorRelacionalAssignment_2 : ( ruleOperadorRelacion ) ;
    public final void rule__ExpresionRelacional__OperadorRelacionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5551:1: ( ( ruleOperadorRelacion ) )
            // InternalBlockchain.g:5552:2: ( ruleOperadorRelacion )
            {
            // InternalBlockchain.g:5552:2: ( ruleOperadorRelacion )
            // InternalBlockchain.g:5553:3: ruleOperadorRelacion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorRelacion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__OperadorRelacionalAssignment_2"


    // $ANTLR start "rule__ExpresionRelacional__DerAssignment_3"
    // InternalBlockchain.g:5562:1: rule__ExpresionRelacional__DerAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__DerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5566:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5567:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5567:2: ( ruleExpresion )
            // InternalBlockchain.g:5568:3: ruleExpresion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__DerAssignment_3"


    // $ANTLR start "rule__Retorno__LineaRetornoAssignment_2"
    // InternalBlockchain.g:5577:1: rule__Retorno__LineaRetornoAssignment_2 : ( ruleLinea ) ;
    public final void rule__Retorno__LineaRetornoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5581:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5582:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5582:2: ( ruleLinea )
            // InternalBlockchain.g:5583:3: ruleLinea
            {
             before(grammarAccess.getRetornoAccess().getLineaRetornoLineaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getRetornoAccess().getLineaRetornoLineaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__LineaRetornoAssignment_2"


    // $ANTLR start "rule__Primitivo__TipoAssignment_1"
    // InternalBlockchain.g:5592:1: rule__Primitivo__TipoAssignment_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Primitivo__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5596:1: ( ( ruleDatoPrimitivo ) )
            // InternalBlockchain.g:5597:2: ( ruleDatoPrimitivo )
            {
            // InternalBlockchain.g:5597:2: ( ruleDatoPrimitivo )
            // InternalBlockchain.g:5598:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__TipoAssignment_1"


    // $ANTLR start "rule__Primitivo__NameAssignment_2"
    // InternalBlockchain.g:5607:1: rule__Primitivo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitivo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5611:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5612:2: ( ruleEString )
            {
            // InternalBlockchain.g:5612:2: ( ruleEString )
            // InternalBlockchain.g:5613:3: ruleEString
            {
             before(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__NameAssignment_2"


    // $ANTLR start "rule__Mapa__TipoDatoKeyAssignment_2"
    // InternalBlockchain.g:5622:1: rule__Mapa__TipoDatoKeyAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5626:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5627:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5627:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5628:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 
            // InternalBlockchain.g:5629:3: ( ruleEString )
            // InternalBlockchain.g:5630:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__TipoDatoKeyAssignment_2"


    // $ANTLR start "rule__Mapa__TipoDatoValueAssignment_4"
    // InternalBlockchain.g:5641:1: rule__Mapa__TipoDatoValueAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5645:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5646:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5646:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5647:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 
            // InternalBlockchain.g:5648:3: ( ruleEString )
            // InternalBlockchain.g:5649:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__TipoDatoValueAssignment_4"


    // $ANTLR start "rule__Mapa__NameAssignment_7"
    // InternalBlockchain.g:5660:1: rule__Mapa__NameAssignment_7 : ( ruleEString ) ;
    public final void rule__Mapa__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5664:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5665:2: ( ruleEString )
            {
            // InternalBlockchain.g:5665:2: ( ruleEString )
            // InternalBlockchain.g:5666:3: ruleEString
            {
             before(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__NameAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8000041F00000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00020C8000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x6FBC308000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x6FBC000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2F8C100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2F8C300000FF0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2F8C3000FF000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x6FBC008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2F8C000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000002000840L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2F8C000000000800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000001F00000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000000L});

}