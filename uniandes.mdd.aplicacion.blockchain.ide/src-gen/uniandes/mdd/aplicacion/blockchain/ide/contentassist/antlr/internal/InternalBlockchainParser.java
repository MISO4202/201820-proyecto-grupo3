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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'true'", "'false'", "'E'", "'e'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'String'", "'uint'", "'Boolean'", "'address'", "'Aplicacion'", "'{'", "'}'", "'tipodato'", "'SmartContract'", "'Entidad'", "'Operacion'", "'('", "')'", "'return'", "'isUd='", "','", "':'", "'Estado'", "'ExpLog'", "'ExpArit'", "'var'", "'if'", "'else'", "'ExpNum'", "'ExpTex'", "'ExpBool'", "'ExpRef'", "'ExpRel'", "'Map'"
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


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalBlockchain.g:478:1: entryRuleExpresionNumerica : ruleExpresionNumerica EOF ;
    public final void entryRuleExpresionNumerica() throws RecognitionException {
        try {
            // InternalBlockchain.g:479:1: ( ruleExpresionNumerica EOF )
            // InternalBlockchain.g:480:1: ruleExpresionNumerica EOF
            {
             before(grammarAccess.getExpresionNumericaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionNumerica();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaRule()); 
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
    // $ANTLR end "entryRuleExpresionNumerica"


    // $ANTLR start "ruleExpresionNumerica"
    // InternalBlockchain.g:487:1: ruleExpresionNumerica : ( ( rule__ExpresionNumerica__Group__0 ) ) ;
    public final void ruleExpresionNumerica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:491:2: ( ( ( rule__ExpresionNumerica__Group__0 ) ) )
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            {
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            // InternalBlockchain.g:493:3: ( rule__ExpresionNumerica__Group__0 )
            {
             before(grammarAccess.getExpresionNumericaAccess().getGroup()); 
            // InternalBlockchain.g:494:3: ( rule__ExpresionNumerica__Group__0 )
            // InternalBlockchain.g:494:4: rule__ExpresionNumerica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionNumericaAccess().getGroup()); 

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
    // $ANTLR end "ruleExpresionNumerica"


    // $ANTLR start "entryRuleExpresionTexto"
    // InternalBlockchain.g:503:1: entryRuleExpresionTexto : ruleExpresionTexto EOF ;
    public final void entryRuleExpresionTexto() throws RecognitionException {
        try {
            // InternalBlockchain.g:504:1: ( ruleExpresionTexto EOF )
            // InternalBlockchain.g:505:1: ruleExpresionTexto EOF
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
    // InternalBlockchain.g:512:1: ruleExpresionTexto : ( ( rule__ExpresionTexto__Group__0 ) ) ;
    public final void ruleExpresionTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:516:2: ( ( ( rule__ExpresionTexto__Group__0 ) ) )
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionTexto__Group__0 ) )
            {
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionTexto__Group__0 ) )
            // InternalBlockchain.g:518:3: ( rule__ExpresionTexto__Group__0 )
            {
             before(grammarAccess.getExpresionTextoAccess().getGroup()); 
            // InternalBlockchain.g:519:3: ( rule__ExpresionTexto__Group__0 )
            // InternalBlockchain.g:519:4: rule__ExpresionTexto__Group__0
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
    // InternalBlockchain.g:528:1: entryRuleExpresionBoolean : ruleExpresionBoolean EOF ;
    public final void entryRuleExpresionBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:529:1: ( ruleExpresionBoolean EOF )
            // InternalBlockchain.g:530:1: ruleExpresionBoolean EOF
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
    // InternalBlockchain.g:537:1: ruleExpresionBoolean : ( ( rule__ExpresionBoolean__Group__0 ) ) ;
    public final void ruleExpresionBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:541:2: ( ( ( rule__ExpresionBoolean__Group__0 ) ) )
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            {
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            // InternalBlockchain.g:543:3: ( rule__ExpresionBoolean__Group__0 )
            {
             before(grammarAccess.getExpresionBooleanAccess().getGroup()); 
            // InternalBlockchain.g:544:3: ( rule__ExpresionBoolean__Group__0 )
            // InternalBlockchain.g:544:4: rule__ExpresionBoolean__Group__0
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
    // InternalBlockchain.g:553:1: entryRuleExpresionReferenciada : ruleExpresionReferenciada EOF ;
    public final void entryRuleExpresionReferenciada() throws RecognitionException {
        try {
            // InternalBlockchain.g:554:1: ( ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:555:1: ruleExpresionReferenciada EOF
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
    // InternalBlockchain.g:562:1: ruleExpresionReferenciada : ( ( rule__ExpresionReferenciada__Group__0 ) ) ;
    public final void ruleExpresionReferenciada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:566:2: ( ( ( rule__ExpresionReferenciada__Group__0 ) ) )
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            {
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            // InternalBlockchain.g:568:3: ( rule__ExpresionReferenciada__Group__0 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 
            // InternalBlockchain.g:569:3: ( rule__ExpresionReferenciada__Group__0 )
            // InternalBlockchain.g:569:4: rule__ExpresionReferenciada__Group__0
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
    // InternalBlockchain.g:578:1: entryRuleExpresionRelacional : ruleExpresionRelacional EOF ;
    public final void entryRuleExpresionRelacional() throws RecognitionException {
        try {
            // InternalBlockchain.g:579:1: ( ruleExpresionRelacional EOF )
            // InternalBlockchain.g:580:1: ruleExpresionRelacional EOF
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
    // InternalBlockchain.g:587:1: ruleExpresionRelacional : ( ( rule__ExpresionRelacional__Group__0 ) ) ;
    public final void ruleExpresionRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:591:2: ( ( ( rule__ExpresionRelacional__Group__0 ) ) )
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            {
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            // InternalBlockchain.g:593:3: ( rule__ExpresionRelacional__Group__0 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getGroup()); 
            // InternalBlockchain.g:594:3: ( rule__ExpresionRelacional__Group__0 )
            // InternalBlockchain.g:594:4: rule__ExpresionRelacional__Group__0
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


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:603:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalBlockchain.g:604:1: ( ruleEDouble EOF )
            // InternalBlockchain.g:605:1: ruleEDouble EOF
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
    // InternalBlockchain.g:612:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:616:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalBlockchain.g:617:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalBlockchain.g:617:2: ( ( rule__EDouble__Group__0 ) )
            // InternalBlockchain.g:618:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalBlockchain.g:619:3: ( rule__EDouble__Group__0 )
            // InternalBlockchain.g:619:4: rule__EDouble__Group__0
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


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:628:1: entryRulePrimitivo : rulePrimitivo EOF ;
    public final void entryRulePrimitivo() throws RecognitionException {
        try {
            // InternalBlockchain.g:629:1: ( rulePrimitivo EOF )
            // InternalBlockchain.g:630:1: rulePrimitivo EOF
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
    // InternalBlockchain.g:637:1: rulePrimitivo : ( ( rule__Primitivo__Group__0 ) ) ;
    public final void rulePrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:641:2: ( ( ( rule__Primitivo__Group__0 ) ) )
            // InternalBlockchain.g:642:2: ( ( rule__Primitivo__Group__0 ) )
            {
            // InternalBlockchain.g:642:2: ( ( rule__Primitivo__Group__0 ) )
            // InternalBlockchain.g:643:3: ( rule__Primitivo__Group__0 )
            {
             before(grammarAccess.getPrimitivoAccess().getGroup()); 
            // InternalBlockchain.g:644:3: ( rule__Primitivo__Group__0 )
            // InternalBlockchain.g:644:4: rule__Primitivo__Group__0
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
    // InternalBlockchain.g:653:1: entryRuleMapa : ruleMapa EOF ;
    public final void entryRuleMapa() throws RecognitionException {
        try {
            // InternalBlockchain.g:654:1: ( ruleMapa EOF )
            // InternalBlockchain.g:655:1: ruleMapa EOF
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
    // InternalBlockchain.g:662:1: ruleMapa : ( ( rule__Mapa__Group__0 ) ) ;
    public final void ruleMapa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:666:2: ( ( ( rule__Mapa__Group__0 ) ) )
            // InternalBlockchain.g:667:2: ( ( rule__Mapa__Group__0 ) )
            {
            // InternalBlockchain.g:667:2: ( ( rule__Mapa__Group__0 ) )
            // InternalBlockchain.g:668:3: ( rule__Mapa__Group__0 )
            {
             before(grammarAccess.getMapaAccess().getGroup()); 
            // InternalBlockchain.g:669:3: ( rule__Mapa__Group__0 )
            // InternalBlockchain.g:669:4: rule__Mapa__Group__0
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
    // InternalBlockchain.g:678:1: ruleOperadorLogico : ( ( rule__OperadorLogico__Alternatives ) ) ;
    public final void ruleOperadorLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:682:1: ( ( ( rule__OperadorLogico__Alternatives ) ) )
            // InternalBlockchain.g:683:2: ( ( rule__OperadorLogico__Alternatives ) )
            {
            // InternalBlockchain.g:683:2: ( ( rule__OperadorLogico__Alternatives ) )
            // InternalBlockchain.g:684:3: ( rule__OperadorLogico__Alternatives )
            {
             before(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 
            // InternalBlockchain.g:685:3: ( rule__OperadorLogico__Alternatives )
            // InternalBlockchain.g:685:4: rule__OperadorLogico__Alternatives
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
    // InternalBlockchain.g:694:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:698:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalBlockchain.g:699:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalBlockchain.g:699:2: ( ( rule__Operador__Alternatives ) )
            // InternalBlockchain.g:700:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalBlockchain.g:701:3: ( rule__Operador__Alternatives )
            // InternalBlockchain.g:701:4: rule__Operador__Alternatives
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
    // InternalBlockchain.g:710:1: ruleOperadorRelacion : ( ( '.' ) ) ;
    public final void ruleOperadorRelacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:714:1: ( ( ( '.' ) ) )
            // InternalBlockchain.g:715:2: ( ( '.' ) )
            {
            // InternalBlockchain.g:715:2: ( ( '.' ) )
            // InternalBlockchain.g:716:3: ( '.' )
            {
             before(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 
            // InternalBlockchain.g:717:3: ( '.' )
            // InternalBlockchain.g:717:4: '.'
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
    // InternalBlockchain.g:726:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:730:1: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalBlockchain.g:731:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalBlockchain.g:731:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalBlockchain.g:732:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalBlockchain.g:733:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalBlockchain.g:733:4: rule__DatoPrimitivo__Alternatives
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
    // InternalBlockchain.g:741:1: rule__TipoDato__Alternatives : ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:745:1: ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt1=2;
                }
                break;
            case 59:
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
                    // InternalBlockchain.g:746:2: ( ruleEntidad )
                    {
                    // InternalBlockchain.g:746:2: ( ruleEntidad )
                    // InternalBlockchain.g:747:3: ruleEntidad
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
                    // InternalBlockchain.g:752:2: ( rulePrimitivo )
                    {
                    // InternalBlockchain.g:752:2: ( rulePrimitivo )
                    // InternalBlockchain.g:753:3: rulePrimitivo
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
                    // InternalBlockchain.g:758:2: ( ruleMapa )
                    {
                    // InternalBlockchain.g:758:2: ( ruleMapa )
                    // InternalBlockchain.g:759:3: ruleMapa
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
    // InternalBlockchain.g:768:1: rule__Linea__Alternatives : ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) );
    public final void rule__Linea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:772:1: ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt2=1;
                }
                break;
            case 50:
                {
                alt2=2;
                }
                break;
            case 51:
                {
                alt2=3;
                }
                break;
            case 52:
                {
                alt2=4;
                }
                break;
            case 54:
                {
                alt2=5;
                }
                break;
            case 55:
                {
                alt2=6;
                }
                break;
            case 56:
                {
                alt2=7;
                }
                break;
            case 57:
                {
                alt2=8;
                }
                break;
            case 58:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:773:2: ( ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:773:2: ( ruleExpresionLogica )
                    // InternalBlockchain.g:774:3: ruleExpresionLogica
                    {
                     before(grammarAccess.getLineaAccess().getExpresionLogicaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionLogica();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionLogicaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:779:2: ( ruleExpresionAritmetica )
                    {
                    // InternalBlockchain.g:779:2: ( ruleExpresionAritmetica )
                    // InternalBlockchain.g:780:3: ruleExpresionAritmetica
                    {
                     before(grammarAccess.getLineaAccess().getExpresionAritmeticaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionAritmetica();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionAritmeticaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:785:2: ( ruleVariable )
                    {
                    // InternalBlockchain.g:785:2: ( ruleVariable )
                    // InternalBlockchain.g:786:3: ruleVariable
                    {
                     before(grammarAccess.getLineaAccess().getVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:791:2: ( ruleCondicional )
                    {
                    // InternalBlockchain.g:791:2: ( ruleCondicional )
                    // InternalBlockchain.g:792:3: ruleCondicional
                    {
                     before(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCondicional();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:797:2: ( ruleExpresionNumerica )
                    {
                    // InternalBlockchain.g:797:2: ( ruleExpresionNumerica )
                    // InternalBlockchain.g:798:3: ruleExpresionNumerica
                    {
                     before(grammarAccess.getLineaAccess().getExpresionNumericaParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionNumerica();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionNumericaParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:803:2: ( ruleExpresionTexto )
                    {
                    // InternalBlockchain.g:803:2: ( ruleExpresionTexto )
                    // InternalBlockchain.g:804:3: ruleExpresionTexto
                    {
                     before(grammarAccess.getLineaAccess().getExpresionTextoParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionTexto();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionTextoParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:809:2: ( ruleExpresionBoolean )
                    {
                    // InternalBlockchain.g:809:2: ( ruleExpresionBoolean )
                    // InternalBlockchain.g:810:3: ruleExpresionBoolean
                    {
                     before(grammarAccess.getLineaAccess().getExpresionBooleanParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionBoolean();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionBooleanParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:815:2: ( ruleExpresionReferenciada )
                    {
                    // InternalBlockchain.g:815:2: ( ruleExpresionReferenciada )
                    // InternalBlockchain.g:816:3: ruleExpresionReferenciada
                    {
                     before(grammarAccess.getLineaAccess().getExpresionReferenciadaParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionReferenciada();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionReferenciadaParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBlockchain.g:821:2: ( ruleExpresionRelacional )
                    {
                    // InternalBlockchain.g:821:2: ( ruleExpresionRelacional )
                    // InternalBlockchain.g:822:3: ruleExpresionRelacional
                    {
                     before(grammarAccess.getLineaAccess().getExpresionRelacionalParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionRelacional();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionRelacionalParserRuleCall_8()); 

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
    // InternalBlockchain.g:831:1: rule__Expresion__Alternatives : ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:835:1: ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case 50:
                {
                alt3=2;
                }
                break;
            case 54:
                {
                alt3=3;
                }
                break;
            case 55:
                {
                alt3=4;
                }
                break;
            case 56:
                {
                alt3=5;
                }
                break;
            case 57:
                {
                alt3=6;
                }
                break;
            case 58:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBlockchain.g:836:2: ( ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:836:2: ( ruleExpresionLogica )
                    // InternalBlockchain.g:837:3: ruleExpresionLogica
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
                    // InternalBlockchain.g:842:2: ( ruleExpresionAritmetica )
                    {
                    // InternalBlockchain.g:842:2: ( ruleExpresionAritmetica )
                    // InternalBlockchain.g:843:3: ruleExpresionAritmetica
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
                    // InternalBlockchain.g:848:2: ( ruleExpresionNumerica )
                    {
                    // InternalBlockchain.g:848:2: ( ruleExpresionNumerica )
                    // InternalBlockchain.g:849:3: ruleExpresionNumerica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionNumericaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionNumerica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionNumericaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:854:2: ( ruleExpresionTexto )
                    {
                    // InternalBlockchain.g:854:2: ( ruleExpresionTexto )
                    // InternalBlockchain.g:855:3: ruleExpresionTexto
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
                    // InternalBlockchain.g:860:2: ( ruleExpresionBoolean )
                    {
                    // InternalBlockchain.g:860:2: ( ruleExpresionBoolean )
                    // InternalBlockchain.g:861:3: ruleExpresionBoolean
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
                    // InternalBlockchain.g:866:2: ( ruleExpresionReferenciada )
                    {
                    // InternalBlockchain.g:866:2: ( ruleExpresionReferenciada )
                    // InternalBlockchain.g:867:3: ruleExpresionReferenciada
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
                    // InternalBlockchain.g:872:2: ( ruleExpresionRelacional )
                    {
                    // InternalBlockchain.g:872:2: ( ruleExpresionRelacional )
                    // InternalBlockchain.g:873:3: ruleExpresionRelacional
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionRelacional();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 

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
    // InternalBlockchain.g:882:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:886:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBlockchain.g:887:2: ( RULE_STRING )
                    {
                    // InternalBlockchain.g:887:2: ( RULE_STRING )
                    // InternalBlockchain.g:888:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:893:2: ( RULE_ID )
                    {
                    // InternalBlockchain.g:893:2: ( RULE_ID )
                    // InternalBlockchain.g:894:3: RULE_ID
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
    // InternalBlockchain.g:903:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:907:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalBlockchain.g:908:2: ( 'true' )
                    {
                    // InternalBlockchain.g:908:2: ( 'true' )
                    // InternalBlockchain.g:909:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:914:2: ( 'false' )
                    {
                    // InternalBlockchain.g:914:2: ( 'false' )
                    // InternalBlockchain.g:915:3: 'false'
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
    // InternalBlockchain.g:924:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:928:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalBlockchain.g:929:2: ( 'E' )
                    {
                    // InternalBlockchain.g:929:2: ( 'E' )
                    // InternalBlockchain.g:930:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:935:2: ( 'e' )
                    {
                    // InternalBlockchain.g:935:2: ( 'e' )
                    // InternalBlockchain.g:936:3: 'e'
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
    // InternalBlockchain.g:945:1: rule__OperadorLogico__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__OperadorLogico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:949:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
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
                    // InternalBlockchain.g:950:2: ( ( '==' ) )
                    {
                    // InternalBlockchain.g:950:2: ( ( '==' ) )
                    // InternalBlockchain.g:951:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:952:3: ( '==' )
                    // InternalBlockchain.g:952:4: '=='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:956:2: ( ( '!=' ) )
                    {
                    // InternalBlockchain.g:956:2: ( ( '!=' ) )
                    // InternalBlockchain.g:957:3: ( '!=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:958:3: ( '!=' )
                    // InternalBlockchain.g:958:4: '!='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:962:2: ( ( '>' ) )
                    {
                    // InternalBlockchain.g:962:2: ( ( '>' ) )
                    // InternalBlockchain.g:963:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:964:3: ( '>' )
                    // InternalBlockchain.g:964:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:968:2: ( ( '<' ) )
                    {
                    // InternalBlockchain.g:968:2: ( ( '<' ) )
                    // InternalBlockchain.g:969:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:970:3: ( '<' )
                    // InternalBlockchain.g:970:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:974:2: ( ( '>=' ) )
                    {
                    // InternalBlockchain.g:974:2: ( ( '>=' ) )
                    // InternalBlockchain.g:975:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:976:3: ( '>=' )
                    // InternalBlockchain.g:976:4: '>='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:980:2: ( ( '<=' ) )
                    {
                    // InternalBlockchain.g:980:2: ( ( '<=' ) )
                    // InternalBlockchain.g:981:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:982:3: ( '<=' )
                    // InternalBlockchain.g:982:4: '<='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:986:2: ( ( '&&' ) )
                    {
                    // InternalBlockchain.g:986:2: ( ( '&&' ) )
                    // InternalBlockchain.g:987:3: ( '&&' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:988:3: ( '&&' )
                    // InternalBlockchain.g:988:4: '&&'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:992:2: ( ( '||' ) )
                    {
                    // InternalBlockchain.g:992:2: ( ( '||' ) )
                    // InternalBlockchain.g:993:3: ( '||' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:994:3: ( '||' )
                    // InternalBlockchain.g:994:4: '||'
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
    // InternalBlockchain.g:1002:1: rule__Operador__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1006:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) )
            int alt8=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:1007:2: ( ( '+' ) )
                    {
                    // InternalBlockchain.g:1007:2: ( ( '+' ) )
                    // InternalBlockchain.g:1008:3: ( '+' )
                    {
                     before(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1009:3: ( '+' )
                    // InternalBlockchain.g:1009:4: '+'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1013:2: ( ( '-' ) )
                    {
                    // InternalBlockchain.g:1013:2: ( ( '-' ) )
                    // InternalBlockchain.g:1014:3: ( '-' )
                    {
                     before(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1015:3: ( '-' )
                    // InternalBlockchain.g:1015:4: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1019:2: ( ( '*' ) )
                    {
                    // InternalBlockchain.g:1019:2: ( ( '*' ) )
                    // InternalBlockchain.g:1020:3: ( '*' )
                    {
                     before(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1021:3: ( '*' )
                    // InternalBlockchain.g:1021:4: '*'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1025:2: ( ( '/' ) )
                    {
                    // InternalBlockchain.g:1025:2: ( ( '/' ) )
                    // InternalBlockchain.g:1026:3: ( '/' )
                    {
                     before(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1027:3: ( '/' )
                    // InternalBlockchain.g:1027:4: '/'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:1031:2: ( ( '=' ) )
                    {
                    // InternalBlockchain.g:1031:2: ( ( '=' ) )
                    // InternalBlockchain.g:1032:3: ( '=' )
                    {
                     before(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:1033:3: ( '=' )
                    // InternalBlockchain.g:1033:4: '='
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:1037:2: ( ( 'GET' ) )
                    {
                    // InternalBlockchain.g:1037:2: ( ( 'GET' ) )
                    // InternalBlockchain.g:1038:3: ( 'GET' )
                    {
                     before(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:1039:3: ( 'GET' )
                    // InternalBlockchain.g:1039:4: 'GET'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:1043:2: ( ( 'DELETE' ) )
                    {
                    // InternalBlockchain.g:1043:2: ( ( 'DELETE' ) )
                    // InternalBlockchain.g:1044:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:1045:3: ( 'DELETE' )
                    // InternalBlockchain.g:1045:4: 'DELETE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 

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
    // InternalBlockchain.g:1053:1: rule__DatoPrimitivo__Alternatives : ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'address' ) ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1057:1: ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'address' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBlockchain.g:1058:2: ( ( 'String' ) )
                    {
                    // InternalBlockchain.g:1058:2: ( ( 'String' ) )
                    // InternalBlockchain.g:1059:3: ( 'String' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1060:3: ( 'String' )
                    // InternalBlockchain.g:1060:4: 'String'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1064:2: ( ( 'uint' ) )
                    {
                    // InternalBlockchain.g:1064:2: ( ( 'uint' ) )
                    // InternalBlockchain.g:1065:3: ( 'uint' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1066:3: ( 'uint' )
                    // InternalBlockchain.g:1066:4: 'uint'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1070:2: ( ( 'Boolean' ) )
                    {
                    // InternalBlockchain.g:1070:2: ( ( 'Boolean' ) )
                    // InternalBlockchain.g:1071:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1072:3: ( 'Boolean' )
                    // InternalBlockchain.g:1072:4: 'Boolean'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1076:2: ( ( 'address' ) )
                    {
                    // InternalBlockchain.g:1076:2: ( ( 'address' ) )
                    // InternalBlockchain.g:1077:3: ( 'address' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1078:3: ( 'address' )
                    // InternalBlockchain.g:1078:4: 'address'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 

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
    // InternalBlockchain.g:1086:1: rule__Aplicacion__Group__0 : rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 ;
    public final void rule__Aplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1090:1: ( rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 )
            // InternalBlockchain.g:1091:2: rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1
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
    // InternalBlockchain.g:1098:1: rule__Aplicacion__Group__0__Impl : ( () ) ;
    public final void rule__Aplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1102:1: ( ( () ) )
            // InternalBlockchain.g:1103:1: ( () )
            {
            // InternalBlockchain.g:1103:1: ( () )
            // InternalBlockchain.g:1104:2: ()
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 
            // InternalBlockchain.g:1105:2: ()
            // InternalBlockchain.g:1105:3: 
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
    // InternalBlockchain.g:1113:1: rule__Aplicacion__Group__1 : rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 ;
    public final void rule__Aplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1117:1: ( rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 )
            // InternalBlockchain.g:1118:2: rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2
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
    // InternalBlockchain.g:1125:1: rule__Aplicacion__Group__1__Impl : ( 'Aplicacion' ) ;
    public final void rule__Aplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1129:1: ( ( 'Aplicacion' ) )
            // InternalBlockchain.g:1130:1: ( 'Aplicacion' )
            {
            // InternalBlockchain.g:1130:1: ( 'Aplicacion' )
            // InternalBlockchain.g:1131:2: 'Aplicacion'
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBlockchain.g:1140:1: rule__Aplicacion__Group__2 : rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 ;
    public final void rule__Aplicacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1144:1: ( rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 )
            // InternalBlockchain.g:1145:2: rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3
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
    // InternalBlockchain.g:1152:1: rule__Aplicacion__Group__2__Impl : ( ( rule__Aplicacion__NameAssignment_2 ) ) ;
    public final void rule__Aplicacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1156:1: ( ( ( rule__Aplicacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1157:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1157:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            // InternalBlockchain.g:1158:2: ( rule__Aplicacion__NameAssignment_2 )
            {
             before(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1159:2: ( rule__Aplicacion__NameAssignment_2 )
            // InternalBlockchain.g:1159:3: rule__Aplicacion__NameAssignment_2
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
    // InternalBlockchain.g:1167:1: rule__Aplicacion__Group__3 : rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 ;
    public final void rule__Aplicacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1171:1: ( rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 )
            // InternalBlockchain.g:1172:2: rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4
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
    // InternalBlockchain.g:1179:1: rule__Aplicacion__Group__3__Impl : ( '{' ) ;
    public final void rule__Aplicacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1183:1: ( ( '{' ) )
            // InternalBlockchain.g:1184:1: ( '{' )
            {
            // InternalBlockchain.g:1184:1: ( '{' )
            // InternalBlockchain.g:1185:2: '{'
            {
             before(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1194:1: rule__Aplicacion__Group__4 : rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 ;
    public final void rule__Aplicacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1198:1: ( rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 )
            // InternalBlockchain.g:1199:2: rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5
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
    // InternalBlockchain.g:1206:1: rule__Aplicacion__Group__4__Impl : ( ( rule__Aplicacion__Group_4__0 )? ) ;
    public final void rule__Aplicacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1210:1: ( ( ( rule__Aplicacion__Group_4__0 )? ) )
            // InternalBlockchain.g:1211:1: ( ( rule__Aplicacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:1211:1: ( ( rule__Aplicacion__Group_4__0 )? )
            // InternalBlockchain.g:1212:2: ( rule__Aplicacion__Group_4__0 )?
            {
             before(grammarAccess.getAplicacionAccess().getGroup_4()); 
            // InternalBlockchain.g:1213:2: ( rule__Aplicacion__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:1213:3: rule__Aplicacion__Group_4__0
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
    // InternalBlockchain.g:1221:1: rule__Aplicacion__Group__5 : rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 ;
    public final void rule__Aplicacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1225:1: ( rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 )
            // InternalBlockchain.g:1226:2: rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6
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
    // InternalBlockchain.g:1233:1: rule__Aplicacion__Group__5__Impl : ( ( rule__Aplicacion__Group_5__0 )* ) ;
    public final void rule__Aplicacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1237:1: ( ( ( rule__Aplicacion__Group_5__0 )* ) )
            // InternalBlockchain.g:1238:1: ( ( rule__Aplicacion__Group_5__0 )* )
            {
            // InternalBlockchain.g:1238:1: ( ( rule__Aplicacion__Group_5__0 )* )
            // InternalBlockchain.g:1239:2: ( rule__Aplicacion__Group_5__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_5()); 
            // InternalBlockchain.g:1240:2: ( rule__Aplicacion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBlockchain.g:1240:3: rule__Aplicacion__Group_5__0
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
    // InternalBlockchain.g:1248:1: rule__Aplicacion__Group__6 : rule__Aplicacion__Group__6__Impl ;
    public final void rule__Aplicacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1252:1: ( rule__Aplicacion__Group__6__Impl )
            // InternalBlockchain.g:1253:2: rule__Aplicacion__Group__6__Impl
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
    // InternalBlockchain.g:1259:1: rule__Aplicacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Aplicacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1263:1: ( ( '}' ) )
            // InternalBlockchain.g:1264:1: ( '}' )
            {
            // InternalBlockchain.g:1264:1: ( '}' )
            // InternalBlockchain.g:1265:2: '}'
            {
             before(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1275:1: rule__Aplicacion__Group_4__0 : rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 ;
    public final void rule__Aplicacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1279:1: ( rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 )
            // InternalBlockchain.g:1280:2: rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1
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
    // InternalBlockchain.g:1287:1: rule__Aplicacion__Group_4__0__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) ;
    public final void rule__Aplicacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1291:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) )
            // InternalBlockchain.g:1292:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1292:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            // InternalBlockchain.g:1293:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 
            // InternalBlockchain.g:1294:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            // InternalBlockchain.g:1294:3: rule__Aplicacion__SmartcontractAssignment_4_0
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
    // InternalBlockchain.g:1302:1: rule__Aplicacion__Group_4__1 : rule__Aplicacion__Group_4__1__Impl ;
    public final void rule__Aplicacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1306:1: ( rule__Aplicacion__Group_4__1__Impl )
            // InternalBlockchain.g:1307:2: rule__Aplicacion__Group_4__1__Impl
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
    // InternalBlockchain.g:1313:1: rule__Aplicacion__Group_4__1__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) ;
    public final void rule__Aplicacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1317:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) )
            // InternalBlockchain.g:1318:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1318:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            // InternalBlockchain.g:1319:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 
            // InternalBlockchain.g:1320:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlockchain.g:1320:3: rule__Aplicacion__SmartcontractAssignment_4_1
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
    // InternalBlockchain.g:1329:1: rule__Aplicacion__Group_5__0 : rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 ;
    public final void rule__Aplicacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1333:1: ( rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 )
            // InternalBlockchain.g:1334:2: rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1
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
    // InternalBlockchain.g:1341:1: rule__Aplicacion__Group_5__0__Impl : ( 'tipodato' ) ;
    public final void rule__Aplicacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1345:1: ( ( 'tipodato' ) )
            // InternalBlockchain.g:1346:1: ( 'tipodato' )
            {
            // InternalBlockchain.g:1346:1: ( 'tipodato' )
            // InternalBlockchain.g:1347:2: 'tipodato'
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBlockchain.g:1356:1: rule__Aplicacion__Group_5__1 : rule__Aplicacion__Group_5__1__Impl ;
    public final void rule__Aplicacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1360:1: ( rule__Aplicacion__Group_5__1__Impl )
            // InternalBlockchain.g:1361:2: rule__Aplicacion__Group_5__1__Impl
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
    // InternalBlockchain.g:1367:1: rule__Aplicacion__Group_5__1__Impl : ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) ;
    public final void rule__Aplicacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1371:1: ( ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) )
            // InternalBlockchain.g:1372:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            {
            // InternalBlockchain.g:1372:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            // InternalBlockchain.g:1373:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 
            // InternalBlockchain.g:1374:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            // InternalBlockchain.g:1374:3: rule__Aplicacion__TipodatoAssignment_5_1
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
    // InternalBlockchain.g:1383:1: rule__SmartContract__Group__0 : rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 ;
    public final void rule__SmartContract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1387:1: ( rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 )
            // InternalBlockchain.g:1388:2: rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1
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
    // InternalBlockchain.g:1395:1: rule__SmartContract__Group__0__Impl : ( 'SmartContract' ) ;
    public final void rule__SmartContract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1399:1: ( ( 'SmartContract' ) )
            // InternalBlockchain.g:1400:1: ( 'SmartContract' )
            {
            // InternalBlockchain.g:1400:1: ( 'SmartContract' )
            // InternalBlockchain.g:1401:2: 'SmartContract'
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBlockchain.g:1410:1: rule__SmartContract__Group__1 : rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 ;
    public final void rule__SmartContract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1414:1: ( rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 )
            // InternalBlockchain.g:1415:2: rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2
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
    // InternalBlockchain.g:1422:1: rule__SmartContract__Group__1__Impl : ( ( rule__SmartContract__NameAssignment_1 ) ) ;
    public final void rule__SmartContract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1426:1: ( ( ( rule__SmartContract__NameAssignment_1 ) ) )
            // InternalBlockchain.g:1427:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:1427:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            // InternalBlockchain.g:1428:2: ( rule__SmartContract__NameAssignment_1 )
            {
             before(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:1429:2: ( rule__SmartContract__NameAssignment_1 )
            // InternalBlockchain.g:1429:3: rule__SmartContract__NameAssignment_1
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
    // InternalBlockchain.g:1437:1: rule__SmartContract__Group__2 : rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 ;
    public final void rule__SmartContract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1441:1: ( rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 )
            // InternalBlockchain.g:1442:2: rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3
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
    // InternalBlockchain.g:1449:1: rule__SmartContract__Group__2__Impl : ( '{' ) ;
    public final void rule__SmartContract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1453:1: ( ( '{' ) )
            // InternalBlockchain.g:1454:1: ( '{' )
            {
            // InternalBlockchain.g:1454:1: ( '{' )
            // InternalBlockchain.g:1455:2: '{'
            {
             before(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1464:1: rule__SmartContract__Group__3 : rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 ;
    public final void rule__SmartContract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1468:1: ( rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 )
            // InternalBlockchain.g:1469:2: rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4
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
    // InternalBlockchain.g:1476:1: rule__SmartContract__Group__3__Impl : ( ( rule__SmartContract__Group_3__0 )? ) ;
    public final void rule__SmartContract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1480:1: ( ( ( rule__SmartContract__Group_3__0 )? ) )
            // InternalBlockchain.g:1481:1: ( ( rule__SmartContract__Group_3__0 )? )
            {
            // InternalBlockchain.g:1481:1: ( ( rule__SmartContract__Group_3__0 )? )
            // InternalBlockchain.g:1482:2: ( rule__SmartContract__Group_3__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_3()); 
            // InternalBlockchain.g:1483:2: ( rule__SmartContract__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlockchain.g:1483:3: rule__SmartContract__Group_3__0
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
    // InternalBlockchain.g:1491:1: rule__SmartContract__Group__4 : rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 ;
    public final void rule__SmartContract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1495:1: ( rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 )
            // InternalBlockchain.g:1496:2: rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5
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
    // InternalBlockchain.g:1503:1: rule__SmartContract__Group__4__Impl : ( ( rule__SmartContract__Group_4__0 )? ) ;
    public final void rule__SmartContract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1507:1: ( ( ( rule__SmartContract__Group_4__0 )? ) )
            // InternalBlockchain.g:1508:1: ( ( rule__SmartContract__Group_4__0 )? )
            {
            // InternalBlockchain.g:1508:1: ( ( rule__SmartContract__Group_4__0 )? )
            // InternalBlockchain.g:1509:2: ( rule__SmartContract__Group_4__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_4()); 
            // InternalBlockchain.g:1510:2: ( rule__SmartContract__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBlockchain.g:1510:3: rule__SmartContract__Group_4__0
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
    // InternalBlockchain.g:1518:1: rule__SmartContract__Group__5 : rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 ;
    public final void rule__SmartContract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1522:1: ( rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 )
            // InternalBlockchain.g:1523:2: rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6
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
    // InternalBlockchain.g:1530:1: rule__SmartContract__Group__5__Impl : ( ( rule__SmartContract__Group_5__0 )? ) ;
    public final void rule__SmartContract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1534:1: ( ( ( rule__SmartContract__Group_5__0 )? ) )
            // InternalBlockchain.g:1535:1: ( ( rule__SmartContract__Group_5__0 )? )
            {
            // InternalBlockchain.g:1535:1: ( ( rule__SmartContract__Group_5__0 )? )
            // InternalBlockchain.g:1536:2: ( rule__SmartContract__Group_5__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_5()); 
            // InternalBlockchain.g:1537:2: ( rule__SmartContract__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlockchain.g:1537:3: rule__SmartContract__Group_5__0
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
    // InternalBlockchain.g:1545:1: rule__SmartContract__Group__6 : rule__SmartContract__Group__6__Impl ;
    public final void rule__SmartContract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1549:1: ( rule__SmartContract__Group__6__Impl )
            // InternalBlockchain.g:1550:2: rule__SmartContract__Group__6__Impl
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
    // InternalBlockchain.g:1556:1: rule__SmartContract__Group__6__Impl : ( '}' ) ;
    public final void rule__SmartContract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1560:1: ( ( '}' ) )
            // InternalBlockchain.g:1561:1: ( '}' )
            {
            // InternalBlockchain.g:1561:1: ( '}' )
            // InternalBlockchain.g:1562:2: '}'
            {
             before(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1572:1: rule__SmartContract__Group_3__0 : rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 ;
    public final void rule__SmartContract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1576:1: ( rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 )
            // InternalBlockchain.g:1577:2: rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1
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
    // InternalBlockchain.g:1584:1: rule__SmartContract__Group_3__0__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) ;
    public final void rule__SmartContract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1588:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) )
            // InternalBlockchain.g:1589:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            {
            // InternalBlockchain.g:1589:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            // InternalBlockchain.g:1590:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 
            // InternalBlockchain.g:1591:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            // InternalBlockchain.g:1591:3: rule__SmartContract__EntidadesAssignment_3_0
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
    // InternalBlockchain.g:1599:1: rule__SmartContract__Group_3__1 : rule__SmartContract__Group_3__1__Impl ;
    public final void rule__SmartContract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1603:1: ( rule__SmartContract__Group_3__1__Impl )
            // InternalBlockchain.g:1604:2: rule__SmartContract__Group_3__1__Impl
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
    // InternalBlockchain.g:1610:1: rule__SmartContract__Group_3__1__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) ;
    public final void rule__SmartContract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1614:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) )
            // InternalBlockchain.g:1615:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            {
            // InternalBlockchain.g:1615:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            // InternalBlockchain.g:1616:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 
            // InternalBlockchain.g:1617:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:1617:3: rule__SmartContract__EntidadesAssignment_3_1
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
    // InternalBlockchain.g:1626:1: rule__SmartContract__Group_4__0 : rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 ;
    public final void rule__SmartContract__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1630:1: ( rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 )
            // InternalBlockchain.g:1631:2: rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1
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
    // InternalBlockchain.g:1638:1: rule__SmartContract__Group_4__0__Impl : ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) ;
    public final void rule__SmartContract__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1642:1: ( ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) )
            // InternalBlockchain.g:1643:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1643:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            // InternalBlockchain.g:1644:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 
            // InternalBlockchain.g:1645:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            // InternalBlockchain.g:1645:3: rule__SmartContract__EstadoAssignment_4_0
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
    // InternalBlockchain.g:1653:1: rule__SmartContract__Group_4__1 : rule__SmartContract__Group_4__1__Impl ;
    public final void rule__SmartContract__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1657:1: ( rule__SmartContract__Group_4__1__Impl )
            // InternalBlockchain.g:1658:2: rule__SmartContract__Group_4__1__Impl
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
    // InternalBlockchain.g:1664:1: rule__SmartContract__Group_4__1__Impl : ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) ;
    public final void rule__SmartContract__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1668:1: ( ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) )
            // InternalBlockchain.g:1669:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1669:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            // InternalBlockchain.g:1670:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 
            // InternalBlockchain.g:1671:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBlockchain.g:1671:3: rule__SmartContract__EstadoAssignment_4_1
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
    // InternalBlockchain.g:1680:1: rule__SmartContract__Group_5__0 : rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 ;
    public final void rule__SmartContract__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1684:1: ( rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 )
            // InternalBlockchain.g:1685:2: rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1
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
    // InternalBlockchain.g:1692:1: rule__SmartContract__Group_5__0__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) ;
    public final void rule__SmartContract__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1696:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) )
            // InternalBlockchain.g:1697:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            {
            // InternalBlockchain.g:1697:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            // InternalBlockchain.g:1698:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 
            // InternalBlockchain.g:1699:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            // InternalBlockchain.g:1699:3: rule__SmartContract__OperacionesAssignment_5_0
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
    // InternalBlockchain.g:1707:1: rule__SmartContract__Group_5__1 : rule__SmartContract__Group_5__1__Impl ;
    public final void rule__SmartContract__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1711:1: ( rule__SmartContract__Group_5__1__Impl )
            // InternalBlockchain.g:1712:2: rule__SmartContract__Group_5__1__Impl
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
    // InternalBlockchain.g:1718:1: rule__SmartContract__Group_5__1__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) ;
    public final void rule__SmartContract__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1722:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) )
            // InternalBlockchain.g:1723:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            {
            // InternalBlockchain.g:1723:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            // InternalBlockchain.g:1724:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 
            // InternalBlockchain.g:1725:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlockchain.g:1725:3: rule__SmartContract__OperacionesAssignment_5_1
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
    // InternalBlockchain.g:1734:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1738:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalBlockchain.g:1739:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
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
    // InternalBlockchain.g:1746:1: rule__Entidad__Group__0__Impl : ( () ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1750:1: ( ( () ) )
            // InternalBlockchain.g:1751:1: ( () )
            {
            // InternalBlockchain.g:1751:1: ( () )
            // InternalBlockchain.g:1752:2: ()
            {
             before(grammarAccess.getEntidadAccess().getEntidadAction_0()); 
            // InternalBlockchain.g:1753:2: ()
            // InternalBlockchain.g:1753:3: 
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
    // InternalBlockchain.g:1761:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1765:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalBlockchain.g:1766:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
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
    // InternalBlockchain.g:1773:1: rule__Entidad__Group__1__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1777:1: ( ( 'Entidad' ) )
            // InternalBlockchain.g:1778:1: ( 'Entidad' )
            {
            // InternalBlockchain.g:1778:1: ( 'Entidad' )
            // InternalBlockchain.g:1779:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBlockchain.g:1788:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1792:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalBlockchain.g:1793:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
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
    // InternalBlockchain.g:1800:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__NameAssignment_2 ) ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1804:1: ( ( ( rule__Entidad__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1805:1: ( ( rule__Entidad__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1805:1: ( ( rule__Entidad__NameAssignment_2 ) )
            // InternalBlockchain.g:1806:2: ( rule__Entidad__NameAssignment_2 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1807:2: ( rule__Entidad__NameAssignment_2 )
            // InternalBlockchain.g:1807:3: rule__Entidad__NameAssignment_2
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
    // InternalBlockchain.g:1815:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1819:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalBlockchain.g:1820:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
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
    // InternalBlockchain.g:1827:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1831:1: ( ( '{' ) )
            // InternalBlockchain.g:1832:1: ( '{' )
            {
            // InternalBlockchain.g:1832:1: ( '{' )
            // InternalBlockchain.g:1833:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1842:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1846:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalBlockchain.g:1847:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
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
    // InternalBlockchain.g:1854:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__Group_4__0 )? ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1858:1: ( ( ( rule__Entidad__Group_4__0 )? ) )
            // InternalBlockchain.g:1859:1: ( ( rule__Entidad__Group_4__0 )? )
            {
            // InternalBlockchain.g:1859:1: ( ( rule__Entidad__Group_4__0 )? )
            // InternalBlockchain.g:1860:2: ( rule__Entidad__Group_4__0 )?
            {
             before(grammarAccess.getEntidadAccess().getGroup_4()); 
            // InternalBlockchain.g:1861:2: ( rule__Entidad__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:1861:3: rule__Entidad__Group_4__0
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
    // InternalBlockchain.g:1869:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1873:1: ( rule__Entidad__Group__5__Impl )
            // InternalBlockchain.g:1874:2: rule__Entidad__Group__5__Impl
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
    // InternalBlockchain.g:1880:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1884:1: ( ( '}' ) )
            // InternalBlockchain.g:1885:1: ( '}' )
            {
            // InternalBlockchain.g:1885:1: ( '}' )
            // InternalBlockchain.g:1886:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1896:1: rule__Entidad__Group_4__0 : rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 ;
    public final void rule__Entidad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1900:1: ( rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 )
            // InternalBlockchain.g:1901:2: rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1
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
    // InternalBlockchain.g:1908:1: rule__Entidad__Group_4__0__Impl : ( ( rule__Entidad__AtributosAssignment_4_0 ) ) ;
    public final void rule__Entidad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1912:1: ( ( ( rule__Entidad__AtributosAssignment_4_0 ) ) )
            // InternalBlockchain.g:1913:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1913:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            // InternalBlockchain.g:1914:2: ( rule__Entidad__AtributosAssignment_4_0 )
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 
            // InternalBlockchain.g:1915:2: ( rule__Entidad__AtributosAssignment_4_0 )
            // InternalBlockchain.g:1915:3: rule__Entidad__AtributosAssignment_4_0
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
    // InternalBlockchain.g:1923:1: rule__Entidad__Group_4__1 : rule__Entidad__Group_4__1__Impl ;
    public final void rule__Entidad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1927:1: ( rule__Entidad__Group_4__1__Impl )
            // InternalBlockchain.g:1928:2: rule__Entidad__Group_4__1__Impl
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
    // InternalBlockchain.g:1934:1: rule__Entidad__Group_4__1__Impl : ( ( rule__Entidad__AtributosAssignment_4_1 )* ) ;
    public final void rule__Entidad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1938:1: ( ( ( rule__Entidad__AtributosAssignment_4_1 )* ) )
            // InternalBlockchain.g:1939:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1939:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            // InternalBlockchain.g:1940:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 
            // InternalBlockchain.g:1941:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlockchain.g:1941:3: rule__Entidad__AtributosAssignment_4_1
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
    // InternalBlockchain.g:1950:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1954:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // InternalBlockchain.g:1955:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBlockchain.g:1962:1: rule__Operacion__Group__0__Impl : ( () ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1966:1: ( ( () ) )
            // InternalBlockchain.g:1967:1: ( () )
            {
            // InternalBlockchain.g:1967:1: ( () )
            // InternalBlockchain.g:1968:2: ()
            {
             before(grammarAccess.getOperacionAccess().getOperacionAction_0()); 
            // InternalBlockchain.g:1969:2: ()
            // InternalBlockchain.g:1969:3: 
            {
            }

             after(grammarAccess.getOperacionAccess().getOperacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0__Impl"


    // $ANTLR start "rule__Operacion__Group__1"
    // InternalBlockchain.g:1977:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1981:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // InternalBlockchain.g:1982:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
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
    // InternalBlockchain.g:1989:1: rule__Operacion__Group__1__Impl : ( 'Operacion' ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1993:1: ( ( 'Operacion' ) )
            // InternalBlockchain.g:1994:1: ( 'Operacion' )
            {
            // InternalBlockchain.g:1994:1: ( 'Operacion' )
            // InternalBlockchain.g:1995:2: 'Operacion'
            {
             before(grammarAccess.getOperacionAccess().getOperacionKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getOperacionKeyword_1()); 

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
    // InternalBlockchain.g:2004:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2008:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // InternalBlockchain.g:2009:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlockchain.g:2016:1: rule__Operacion__Group__2__Impl : ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2020:1: ( ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) ) )
            // InternalBlockchain.g:2021:1: ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) )
            {
            // InternalBlockchain.g:2021:1: ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) )
            // InternalBlockchain.g:2022:2: ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* )
            {
            // InternalBlockchain.g:2022:2: ( ( rule__Operacion__Group_2__0 ) )
            // InternalBlockchain.g:2023:3: ( rule__Operacion__Group_2__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup_2()); 
            // InternalBlockchain.g:2024:3: ( rule__Operacion__Group_2__0 )
            // InternalBlockchain.g:2024:4: rule__Operacion__Group_2__0
            {
            pushFollow(FOLLOW_21);
            rule__Operacion__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getGroup_2()); 

            }

            // InternalBlockchain.g:2027:2: ( ( rule__Operacion__Group_2__0 )* )
            // InternalBlockchain.g:2028:3: ( rule__Operacion__Group_2__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_2()); 
            // InternalBlockchain.g:2029:3: ( rule__Operacion__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBlockchain.g:2029:4: rule__Operacion__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Operacion__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getGroup_2()); 

            }


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
    // InternalBlockchain.g:2038:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2042:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // InternalBlockchain.g:2043:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
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
    // InternalBlockchain.g:2050:1: rule__Operacion__Group__3__Impl : ( ( rule__Operacion__NameAssignment_3 ) ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2054:1: ( ( ( rule__Operacion__NameAssignment_3 ) ) )
            // InternalBlockchain.g:2055:1: ( ( rule__Operacion__NameAssignment_3 ) )
            {
            // InternalBlockchain.g:2055:1: ( ( rule__Operacion__NameAssignment_3 ) )
            // InternalBlockchain.g:2056:2: ( rule__Operacion__NameAssignment_3 )
            {
             before(grammarAccess.getOperacionAccess().getNameAssignment_3()); 
            // InternalBlockchain.g:2057:2: ( rule__Operacion__NameAssignment_3 )
            // InternalBlockchain.g:2057:3: rule__Operacion__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getNameAssignment_3()); 

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
    // InternalBlockchain.g:2065:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl rule__Operacion__Group__5 ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2069:1: ( rule__Operacion__Group__4__Impl rule__Operacion__Group__5 )
            // InternalBlockchain.g:2070:2: rule__Operacion__Group__4__Impl rule__Operacion__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalBlockchain.g:2077:1: rule__Operacion__Group__4__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2081:1: ( ( '(' ) )
            // InternalBlockchain.g:2082:1: ( '(' )
            {
            // InternalBlockchain.g:2082:1: ( '(' )
            // InternalBlockchain.g:2083:2: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_4()); 

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
    // InternalBlockchain.g:2092:1: rule__Operacion__Group__5 : rule__Operacion__Group__5__Impl rule__Operacion__Group__6 ;
    public final void rule__Operacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2096:1: ( rule__Operacion__Group__5__Impl rule__Operacion__Group__6 )
            // InternalBlockchain.g:2097:2: rule__Operacion__Group__5__Impl rule__Operacion__Group__6
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
    // InternalBlockchain.g:2104:1: rule__Operacion__Group__5__Impl : ( ( rule__Operacion__Group_5__0 )? ) ;
    public final void rule__Operacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2108:1: ( ( ( rule__Operacion__Group_5__0 )? ) )
            // InternalBlockchain.g:2109:1: ( ( rule__Operacion__Group_5__0 )? )
            {
            // InternalBlockchain.g:2109:1: ( ( rule__Operacion__Group_5__0 )? )
            // InternalBlockchain.g:2110:2: ( rule__Operacion__Group_5__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_5()); 
            // InternalBlockchain.g:2111:2: ( rule__Operacion__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlockchain.g:2111:3: rule__Operacion__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_5()); 

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
    // InternalBlockchain.g:2119:1: rule__Operacion__Group__6 : rule__Operacion__Group__6__Impl rule__Operacion__Group__7 ;
    public final void rule__Operacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2123:1: ( rule__Operacion__Group__6__Impl rule__Operacion__Group__7 )
            // InternalBlockchain.g:2124:2: rule__Operacion__Group__6__Impl rule__Operacion__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalBlockchain.g:2131:1: rule__Operacion__Group__6__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2135:1: ( ( ')' ) )
            // InternalBlockchain.g:2136:1: ( ')' )
            {
            // InternalBlockchain.g:2136:1: ( ')' )
            // InternalBlockchain.g:2137:2: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_6()); 

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
    // InternalBlockchain.g:2146:1: rule__Operacion__Group__7 : rule__Operacion__Group__7__Impl rule__Operacion__Group__8 ;
    public final void rule__Operacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2150:1: ( rule__Operacion__Group__7__Impl rule__Operacion__Group__8 )
            // InternalBlockchain.g:2151:2: rule__Operacion__Group__7__Impl rule__Operacion__Group__8
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
    // InternalBlockchain.g:2158:1: rule__Operacion__Group__7__Impl : ( ( rule__Operacion__Group_7__0 )? ) ;
    public final void rule__Operacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2162:1: ( ( ( rule__Operacion__Group_7__0 )? ) )
            // InternalBlockchain.g:2163:1: ( ( rule__Operacion__Group_7__0 )? )
            {
            // InternalBlockchain.g:2163:1: ( ( rule__Operacion__Group_7__0 )? )
            // InternalBlockchain.g:2164:2: ( rule__Operacion__Group_7__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_7()); 
            // InternalBlockchain.g:2165:2: ( rule__Operacion__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:2165:3: rule__Operacion__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_7()); 

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
    // InternalBlockchain.g:2173:1: rule__Operacion__Group__8 : rule__Operacion__Group__8__Impl rule__Operacion__Group__9 ;
    public final void rule__Operacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2177:1: ( rule__Operacion__Group__8__Impl rule__Operacion__Group__9 )
            // InternalBlockchain.g:2178:2: rule__Operacion__Group__8__Impl rule__Operacion__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalBlockchain.g:2185:1: rule__Operacion__Group__8__Impl : ( '{' ) ;
    public final void rule__Operacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2189:1: ( ( '{' ) )
            // InternalBlockchain.g:2190:1: ( '{' )
            {
            // InternalBlockchain.g:2190:1: ( '{' )
            // InternalBlockchain.g:2191:2: '{'
            {
             before(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_8()); 

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
    // InternalBlockchain.g:2200:1: rule__Operacion__Group__9 : rule__Operacion__Group__9__Impl rule__Operacion__Group__10 ;
    public final void rule__Operacion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2204:1: ( rule__Operacion__Group__9__Impl rule__Operacion__Group__10 )
            // InternalBlockchain.g:2205:2: rule__Operacion__Group__9__Impl rule__Operacion__Group__10
            {
            pushFollow(FOLLOW_25);
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
    // InternalBlockchain.g:2212:1: rule__Operacion__Group__9__Impl : ( ( 'return' )? ) ;
    public final void rule__Operacion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2216:1: ( ( ( 'return' )? ) )
            // InternalBlockchain.g:2217:1: ( ( 'return' )? )
            {
            // InternalBlockchain.g:2217:1: ( ( 'return' )? )
            // InternalBlockchain.g:2218:2: ( 'return' )?
            {
             before(grammarAccess.getOperacionAccess().getReturnKeyword_9()); 
            // InternalBlockchain.g:2219:2: ( 'return' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlockchain.g:2219:3: 'return'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getReturnKeyword_9()); 

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
    // InternalBlockchain.g:2227:1: rule__Operacion__Group__10 : rule__Operacion__Group__10__Impl rule__Operacion__Group__11 ;
    public final void rule__Operacion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2231:1: ( rule__Operacion__Group__10__Impl rule__Operacion__Group__11 )
            // InternalBlockchain.g:2232:2: rule__Operacion__Group__10__Impl rule__Operacion__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalBlockchain.g:2239:1: rule__Operacion__Group__10__Impl : ( ( rule__Operacion__LineasAssignment_10 )* ) ;
    public final void rule__Operacion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2243:1: ( ( ( rule__Operacion__LineasAssignment_10 )* ) )
            // InternalBlockchain.g:2244:1: ( ( rule__Operacion__LineasAssignment_10 )* )
            {
            // InternalBlockchain.g:2244:1: ( ( rule__Operacion__LineasAssignment_10 )* )
            // InternalBlockchain.g:2245:2: ( rule__Operacion__LineasAssignment_10 )*
            {
             before(grammarAccess.getOperacionAccess().getLineasAssignment_10()); 
            // InternalBlockchain.g:2246:2: ( rule__Operacion__LineasAssignment_10 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=49 && LA25_0<=52)||(LA25_0>=54 && LA25_0<=58)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBlockchain.g:2246:3: rule__Operacion__LineasAssignment_10
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Operacion__LineasAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLineasAssignment_10()); 

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
    // InternalBlockchain.g:2254:1: rule__Operacion__Group__11 : rule__Operacion__Group__11__Impl ;
    public final void rule__Operacion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2258:1: ( rule__Operacion__Group__11__Impl )
            // InternalBlockchain.g:2259:2: rule__Operacion__Group__11__Impl
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
    // InternalBlockchain.g:2265:1: rule__Operacion__Group__11__Impl : ( '}' ) ;
    public final void rule__Operacion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2269:1: ( ( '}' ) )
            // InternalBlockchain.g:2270:1: ( '}' )
            {
            // InternalBlockchain.g:2270:1: ( '}' )
            // InternalBlockchain.g:2271:2: '}'
            {
             before(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__Operacion__Group_2__0"
    // InternalBlockchain.g:2281:1: rule__Operacion__Group_2__0 : rule__Operacion__Group_2__0__Impl rule__Operacion__Group_2__1 ;
    public final void rule__Operacion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2285:1: ( rule__Operacion__Group_2__0__Impl rule__Operacion__Group_2__1 )
            // InternalBlockchain.g:2286:2: rule__Operacion__Group_2__0__Impl rule__Operacion__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Operacion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_2__1();

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
    // $ANTLR end "rule__Operacion__Group_2__0"


    // $ANTLR start "rule__Operacion__Group_2__0__Impl"
    // InternalBlockchain.g:2293:1: rule__Operacion__Group_2__0__Impl : ( 'isUd=' ) ;
    public final void rule__Operacion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2297:1: ( ( 'isUd=' ) )
            // InternalBlockchain.g:2298:1: ( 'isUd=' )
            {
            // InternalBlockchain.g:2298:1: ( 'isUd=' )
            // InternalBlockchain.g:2299:2: 'isUd='
            {
             before(grammarAccess.getOperacionAccess().getIsUdKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getIsUdKeyword_2_0()); 

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
    // $ANTLR end "rule__Operacion__Group_2__0__Impl"


    // $ANTLR start "rule__Operacion__Group_2__1"
    // InternalBlockchain.g:2308:1: rule__Operacion__Group_2__1 : rule__Operacion__Group_2__1__Impl ;
    public final void rule__Operacion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2312:1: ( rule__Operacion__Group_2__1__Impl )
            // InternalBlockchain.g:2313:2: rule__Operacion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_2__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_2__1"


    // $ANTLR start "rule__Operacion__Group_2__1__Impl"
    // InternalBlockchain.g:2319:1: rule__Operacion__Group_2__1__Impl : ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) ) ;
    public final void rule__Operacion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2323:1: ( ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) ) )
            // InternalBlockchain.g:2324:1: ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) )
            {
            // InternalBlockchain.g:2324:1: ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) )
            // InternalBlockchain.g:2325:2: ( rule__Operacion__EsUserDefinedAssignment_2_1 )
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_2_1()); 
            // InternalBlockchain.g:2326:2: ( rule__Operacion__EsUserDefinedAssignment_2_1 )
            // InternalBlockchain.g:2326:3: rule__Operacion__EsUserDefinedAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__EsUserDefinedAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_2_1()); 

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
    // $ANTLR end "rule__Operacion__Group_2__1__Impl"


    // $ANTLR start "rule__Operacion__Group_5__0"
    // InternalBlockchain.g:2335:1: rule__Operacion__Group_5__0 : rule__Operacion__Group_5__0__Impl rule__Operacion__Group_5__1 ;
    public final void rule__Operacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2339:1: ( rule__Operacion__Group_5__0__Impl rule__Operacion__Group_5__1 )
            // InternalBlockchain.g:2340:2: rule__Operacion__Group_5__0__Impl rule__Operacion__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__Operacion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5__1();

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
    // $ANTLR end "rule__Operacion__Group_5__0"


    // $ANTLR start "rule__Operacion__Group_5__0__Impl"
    // InternalBlockchain.g:2347:1: rule__Operacion__Group_5__0__Impl : ( ( rule__Operacion__ParametrosAssignment_5_0 ) ) ;
    public final void rule__Operacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2351:1: ( ( ( rule__Operacion__ParametrosAssignment_5_0 ) ) )
            // InternalBlockchain.g:2352:1: ( ( rule__Operacion__ParametrosAssignment_5_0 ) )
            {
            // InternalBlockchain.g:2352:1: ( ( rule__Operacion__ParametrosAssignment_5_0 ) )
            // InternalBlockchain.g:2353:2: ( rule__Operacion__ParametrosAssignment_5_0 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_5_0()); 
            // InternalBlockchain.g:2354:2: ( rule__Operacion__ParametrosAssignment_5_0 )
            // InternalBlockchain.g:2354:3: rule__Operacion__ParametrosAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_5_0()); 

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
    // $ANTLR end "rule__Operacion__Group_5__0__Impl"


    // $ANTLR start "rule__Operacion__Group_5__1"
    // InternalBlockchain.g:2362:1: rule__Operacion__Group_5__1 : rule__Operacion__Group_5__1__Impl ;
    public final void rule__Operacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2366:1: ( rule__Operacion__Group_5__1__Impl )
            // InternalBlockchain.g:2367:2: rule__Operacion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_5__1"


    // $ANTLR start "rule__Operacion__Group_5__1__Impl"
    // InternalBlockchain.g:2373:1: rule__Operacion__Group_5__1__Impl : ( ( rule__Operacion__Group_5_1__0 )* ) ;
    public final void rule__Operacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2377:1: ( ( ( rule__Operacion__Group_5_1__0 )* ) )
            // InternalBlockchain.g:2378:1: ( ( rule__Operacion__Group_5_1__0 )* )
            {
            // InternalBlockchain.g:2378:1: ( ( rule__Operacion__Group_5_1__0 )* )
            // InternalBlockchain.g:2379:2: ( rule__Operacion__Group_5_1__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_5_1()); 
            // InternalBlockchain.g:2380:2: ( rule__Operacion__Group_5_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBlockchain.g:2380:3: rule__Operacion__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Operacion__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Operacion__Group_5__1__Impl"


    // $ANTLR start "rule__Operacion__Group_5_1__0"
    // InternalBlockchain.g:2389:1: rule__Operacion__Group_5_1__0 : rule__Operacion__Group_5_1__0__Impl rule__Operacion__Group_5_1__1 ;
    public final void rule__Operacion__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2393:1: ( rule__Operacion__Group_5_1__0__Impl rule__Operacion__Group_5_1__1 )
            // InternalBlockchain.g:2394:2: rule__Operacion__Group_5_1__0__Impl rule__Operacion__Group_5_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5_1__1();

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
    // $ANTLR end "rule__Operacion__Group_5_1__0"


    // $ANTLR start "rule__Operacion__Group_5_1__0__Impl"
    // InternalBlockchain.g:2401:1: rule__Operacion__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Operacion__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2405:1: ( ( ',' ) )
            // InternalBlockchain.g:2406:1: ( ',' )
            {
            // InternalBlockchain.g:2406:1: ( ',' )
            // InternalBlockchain.g:2407:2: ','
            {
             before(grammarAccess.getOperacionAccess().getCommaKeyword_5_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end "rule__Operacion__Group_5_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_5_1__1"
    // InternalBlockchain.g:2416:1: rule__Operacion__Group_5_1__1 : rule__Operacion__Group_5_1__1__Impl ;
    public final void rule__Operacion__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2420:1: ( rule__Operacion__Group_5_1__1__Impl )
            // InternalBlockchain.g:2421:2: rule__Operacion__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_5_1__1"


    // $ANTLR start "rule__Operacion__Group_5_1__1__Impl"
    // InternalBlockchain.g:2427:1: rule__Operacion__Group_5_1__1__Impl : ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) ) ;
    public final void rule__Operacion__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2431:1: ( ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) ) )
            // InternalBlockchain.g:2432:1: ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) )
            {
            // InternalBlockchain.g:2432:1: ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) )
            // InternalBlockchain.g:2433:2: ( rule__Operacion__ParametrosAssignment_5_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_5_1_1()); 
            // InternalBlockchain.g:2434:2: ( rule__Operacion__ParametrosAssignment_5_1_1 )
            // InternalBlockchain.g:2434:3: rule__Operacion__ParametrosAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_5_1_1()); 

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
    // $ANTLR end "rule__Operacion__Group_5_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_7__0"
    // InternalBlockchain.g:2443:1: rule__Operacion__Group_7__0 : rule__Operacion__Group_7__0__Impl rule__Operacion__Group_7__1 ;
    public final void rule__Operacion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2447:1: ( rule__Operacion__Group_7__0__Impl rule__Operacion__Group_7__1 )
            // InternalBlockchain.g:2448:2: rule__Operacion__Group_7__0__Impl rule__Operacion__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_7__1();

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
    // $ANTLR end "rule__Operacion__Group_7__0"


    // $ANTLR start "rule__Operacion__Group_7__0__Impl"
    // InternalBlockchain.g:2455:1: rule__Operacion__Group_7__0__Impl : ( ':' ) ;
    public final void rule__Operacion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2459:1: ( ( ':' ) )
            // InternalBlockchain.g:2460:1: ( ':' )
            {
            // InternalBlockchain.g:2460:1: ( ':' )
            // InternalBlockchain.g:2461:2: ':'
            {
             before(grammarAccess.getOperacionAccess().getColonKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getColonKeyword_7_0()); 

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
    // $ANTLR end "rule__Operacion__Group_7__0__Impl"


    // $ANTLR start "rule__Operacion__Group_7__1"
    // InternalBlockchain.g:2470:1: rule__Operacion__Group_7__1 : rule__Operacion__Group_7__1__Impl ;
    public final void rule__Operacion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2474:1: ( rule__Operacion__Group_7__1__Impl )
            // InternalBlockchain.g:2475:2: rule__Operacion__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_7__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_7__1"


    // $ANTLR start "rule__Operacion__Group_7__1__Impl"
    // InternalBlockchain.g:2481:1: rule__Operacion__Group_7__1__Impl : ( ( rule__Operacion__RetornoAssignment_7_1 ) ) ;
    public final void rule__Operacion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2485:1: ( ( ( rule__Operacion__RetornoAssignment_7_1 ) ) )
            // InternalBlockchain.g:2486:1: ( ( rule__Operacion__RetornoAssignment_7_1 ) )
            {
            // InternalBlockchain.g:2486:1: ( ( rule__Operacion__RetornoAssignment_7_1 ) )
            // InternalBlockchain.g:2487:2: ( rule__Operacion__RetornoAssignment_7_1 )
            {
             before(grammarAccess.getOperacionAccess().getRetornoAssignment_7_1()); 
            // InternalBlockchain.g:2488:2: ( rule__Operacion__RetornoAssignment_7_1 )
            // InternalBlockchain.g:2488:3: rule__Operacion__RetornoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__RetornoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getRetornoAssignment_7_1()); 

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
    // $ANTLR end "rule__Operacion__Group_7__1__Impl"


    // $ANTLR start "rule__Estado__Group__0"
    // InternalBlockchain.g:2497:1: rule__Estado__Group__0 : rule__Estado__Group__0__Impl rule__Estado__Group__1 ;
    public final void rule__Estado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2501:1: ( rule__Estado__Group__0__Impl rule__Estado__Group__1 )
            // InternalBlockchain.g:2502:2: rule__Estado__Group__0__Impl rule__Estado__Group__1
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
    // InternalBlockchain.g:2509:1: rule__Estado__Group__0__Impl : ( 'Estado' ) ;
    public final void rule__Estado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2513:1: ( ( 'Estado' ) )
            // InternalBlockchain.g:2514:1: ( 'Estado' )
            {
            // InternalBlockchain.g:2514:1: ( 'Estado' )
            // InternalBlockchain.g:2515:2: 'Estado'
            {
             before(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBlockchain.g:2524:1: rule__Estado__Group__1 : rule__Estado__Group__1__Impl rule__Estado__Group__2 ;
    public final void rule__Estado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2528:1: ( rule__Estado__Group__1__Impl rule__Estado__Group__2 )
            // InternalBlockchain.g:2529:2: rule__Estado__Group__1__Impl rule__Estado__Group__2
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
    // InternalBlockchain.g:2536:1: rule__Estado__Group__1__Impl : ( ( rule__Estado__TipodatoAssignment_1 ) ) ;
    public final void rule__Estado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2540:1: ( ( ( rule__Estado__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:2541:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:2541:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:2542:2: ( rule__Estado__TipodatoAssignment_1 )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:2543:2: ( rule__Estado__TipodatoAssignment_1 )
            // InternalBlockchain.g:2543:3: rule__Estado__TipodatoAssignment_1
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
    // InternalBlockchain.g:2551:1: rule__Estado__Group__2 : rule__Estado__Group__2__Impl ;
    public final void rule__Estado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2555:1: ( rule__Estado__Group__2__Impl )
            // InternalBlockchain.g:2556:2: rule__Estado__Group__2__Impl
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
    // InternalBlockchain.g:2562:1: rule__Estado__Group__2__Impl : ( ( rule__Estado__NameAssignment_2 ) ) ;
    public final void rule__Estado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2566:1: ( ( ( rule__Estado__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2567:1: ( ( rule__Estado__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2567:1: ( ( rule__Estado__NameAssignment_2 ) )
            // InternalBlockchain.g:2568:2: ( rule__Estado__NameAssignment_2 )
            {
             before(grammarAccess.getEstadoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2569:2: ( rule__Estado__NameAssignment_2 )
            // InternalBlockchain.g:2569:3: rule__Estado__NameAssignment_2
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
    // InternalBlockchain.g:2578:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2582:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalBlockchain.g:2583:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
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
    // InternalBlockchain.g:2590:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__TipodatoAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2594:1: ( ( ( rule__Atributo__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2595:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2595:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2596:2: ( rule__Atributo__TipodatoAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2597:2: ( rule__Atributo__TipodatoAssignment_0 )
            // InternalBlockchain.g:2597:3: rule__Atributo__TipodatoAssignment_0
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
    // InternalBlockchain.g:2605:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2609:1: ( rule__Atributo__Group__1__Impl )
            // InternalBlockchain.g:2610:2: rule__Atributo__Group__1__Impl
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
    // InternalBlockchain.g:2616:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2620:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2621:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2621:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalBlockchain.g:2622:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2623:2: ( rule__Atributo__NameAssignment_1 )
            // InternalBlockchain.g:2623:3: rule__Atributo__NameAssignment_1
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
    // InternalBlockchain.g:2632:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2636:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalBlockchain.g:2637:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
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
    // InternalBlockchain.g:2644:1: rule__Parametro__Group__0__Impl : ( ( rule__Parametro__TipodatoAssignment_0 ) ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2648:1: ( ( ( rule__Parametro__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2649:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2649:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2650:2: ( rule__Parametro__TipodatoAssignment_0 )
            {
             before(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2651:2: ( rule__Parametro__TipodatoAssignment_0 )
            // InternalBlockchain.g:2651:3: rule__Parametro__TipodatoAssignment_0
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
    // InternalBlockchain.g:2659:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2663:1: ( rule__Parametro__Group__1__Impl )
            // InternalBlockchain.g:2664:2: rule__Parametro__Group__1__Impl
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
    // InternalBlockchain.g:2670:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__NameAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2674:1: ( ( ( rule__Parametro__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2675:1: ( ( rule__Parametro__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2675:1: ( ( rule__Parametro__NameAssignment_1 ) )
            // InternalBlockchain.g:2676:2: ( rule__Parametro__NameAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2677:2: ( rule__Parametro__NameAssignment_1 )
            // InternalBlockchain.g:2677:3: rule__Parametro__NameAssignment_1
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
    // InternalBlockchain.g:2686:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2690:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalBlockchain.g:2691:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalBlockchain.g:2698:1: rule__ExpresionLogica__Group__0__Impl : ( 'ExpLog' ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2702:1: ( ( 'ExpLog' ) )
            // InternalBlockchain.g:2703:1: ( 'ExpLog' )
            {
            // InternalBlockchain.g:2703:1: ( 'ExpLog' )
            // InternalBlockchain.g:2704:2: 'ExpLog'
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBlockchain.g:2713:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2717:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalBlockchain.g:2718:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
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
    // InternalBlockchain.g:2725:1: rule__ExpresionLogica__Group__1__Impl : ( ( rule__ExpresionLogica__IzqAssignment_1 ) ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2729:1: ( ( ( rule__ExpresionLogica__IzqAssignment_1 ) ) )
            // InternalBlockchain.g:2730:1: ( ( rule__ExpresionLogica__IzqAssignment_1 ) )
            {
            // InternalBlockchain.g:2730:1: ( ( rule__ExpresionLogica__IzqAssignment_1 ) )
            // InternalBlockchain.g:2731:2: ( rule__ExpresionLogica__IzqAssignment_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_1()); 
            // InternalBlockchain.g:2732:2: ( rule__ExpresionLogica__IzqAssignment_1 )
            // InternalBlockchain.g:2732:3: rule__ExpresionLogica__IzqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__IzqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_1()); 

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
    // InternalBlockchain.g:2740:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2744:1: ( rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 )
            // InternalBlockchain.g:2745:2: rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalBlockchain.g:2752:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__OperadorAssignment_2 )? ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2756:1: ( ( ( rule__ExpresionLogica__OperadorAssignment_2 )? ) )
            // InternalBlockchain.g:2757:1: ( ( rule__ExpresionLogica__OperadorAssignment_2 )? )
            {
            // InternalBlockchain.g:2757:1: ( ( rule__ExpresionLogica__OperadorAssignment_2 )? )
            // InternalBlockchain.g:2758:2: ( rule__ExpresionLogica__OperadorAssignment_2 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_2()); 
            // InternalBlockchain.g:2759:2: ( rule__ExpresionLogica__OperadorAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=16 && LA27_0<=23)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBlockchain.g:2759:3: rule__ExpresionLogica__OperadorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__OperadorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_2()); 

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
    // InternalBlockchain.g:2767:1: rule__ExpresionLogica__Group__3 : rule__ExpresionLogica__Group__3__Impl ;
    public final void rule__ExpresionLogica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2771:1: ( rule__ExpresionLogica__Group__3__Impl )
            // InternalBlockchain.g:2772:2: rule__ExpresionLogica__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__3__Impl();

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
    // InternalBlockchain.g:2778:1: rule__ExpresionLogica__Group__3__Impl : ( ( rule__ExpresionLogica__DerAssignment_3 ) ) ;
    public final void rule__ExpresionLogica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2782:1: ( ( ( rule__ExpresionLogica__DerAssignment_3 ) ) )
            // InternalBlockchain.g:2783:1: ( ( rule__ExpresionLogica__DerAssignment_3 ) )
            {
            // InternalBlockchain.g:2783:1: ( ( rule__ExpresionLogica__DerAssignment_3 ) )
            // InternalBlockchain.g:2784:2: ( rule__ExpresionLogica__DerAssignment_3 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerAssignment_3()); 
            // InternalBlockchain.g:2785:2: ( rule__ExpresionLogica__DerAssignment_3 )
            // InternalBlockchain.g:2785:3: rule__ExpresionLogica__DerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__DerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getDerAssignment_3()); 

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


    // $ANTLR start "rule__ExpresionAritmetica__Group__0"
    // InternalBlockchain.g:2794:1: rule__ExpresionAritmetica__Group__0 : rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 ;
    public final void rule__ExpresionAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2798:1: ( rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 )
            // InternalBlockchain.g:2799:2: rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalBlockchain.g:2806:1: rule__ExpresionAritmetica__Group__0__Impl : ( 'ExpArit' ) ;
    public final void rule__ExpresionAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2810:1: ( ( 'ExpArit' ) )
            // InternalBlockchain.g:2811:1: ( 'ExpArit' )
            {
            // InternalBlockchain.g:2811:1: ( 'ExpArit' )
            // InternalBlockchain.g:2812:2: 'ExpArit'
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_0()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__1"
    // InternalBlockchain.g:2821:1: rule__ExpresionAritmetica__Group__1 : rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 ;
    public final void rule__ExpresionAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2825:1: ( rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 )
            // InternalBlockchain.g:2826:2: rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2833:1: rule__ExpresionAritmetica__Group__1__Impl : ( ( rule__ExpresionAritmetica__IzqAssignment_1 ) ) ;
    public final void rule__ExpresionAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2837:1: ( ( ( rule__ExpresionAritmetica__IzqAssignment_1 ) ) )
            // InternalBlockchain.g:2838:1: ( ( rule__ExpresionAritmetica__IzqAssignment_1 ) )
            {
            // InternalBlockchain.g:2838:1: ( ( rule__ExpresionAritmetica__IzqAssignment_1 ) )
            // InternalBlockchain.g:2839:2: ( rule__ExpresionAritmetica__IzqAssignment_1 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_1()); 
            // InternalBlockchain.g:2840:2: ( rule__ExpresionAritmetica__IzqAssignment_1 )
            // InternalBlockchain.g:2840:3: rule__ExpresionAritmetica__IzqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__IzqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_1()); 

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
    // InternalBlockchain.g:2848:1: rule__ExpresionAritmetica__Group__2 : rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 ;
    public final void rule__ExpresionAritmetica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2852:1: ( rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 )
            // InternalBlockchain.g:2853:2: rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2860:1: rule__ExpresionAritmetica__Group__2__Impl : ( ( rule__ExpresionAritmetica__OperadorAssignment_2 )? ) ;
    public final void rule__ExpresionAritmetica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2864:1: ( ( ( rule__ExpresionAritmetica__OperadorAssignment_2 )? ) )
            // InternalBlockchain.g:2865:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_2 )? )
            {
            // InternalBlockchain.g:2865:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_2 )? )
            // InternalBlockchain.g:2866:2: ( rule__ExpresionAritmetica__OperadorAssignment_2 )?
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_2()); 
            // InternalBlockchain.g:2867:2: ( rule__ExpresionAritmetica__OperadorAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=24 && LA28_0<=30)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBlockchain.g:2867:3: rule__ExpresionAritmetica__OperadorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionAritmetica__OperadorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_2()); 

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
    // InternalBlockchain.g:2875:1: rule__ExpresionAritmetica__Group__3 : rule__ExpresionAritmetica__Group__3__Impl ;
    public final void rule__ExpresionAritmetica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2879:1: ( rule__ExpresionAritmetica__Group__3__Impl )
            // InternalBlockchain.g:2880:2: rule__ExpresionAritmetica__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__3__Impl();

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
    // InternalBlockchain.g:2886:1: rule__ExpresionAritmetica__Group__3__Impl : ( ( rule__ExpresionAritmetica__DerAssignment_3 ) ) ;
    public final void rule__ExpresionAritmetica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2890:1: ( ( ( rule__ExpresionAritmetica__DerAssignment_3 ) ) )
            // InternalBlockchain.g:2891:1: ( ( rule__ExpresionAritmetica__DerAssignment_3 ) )
            {
            // InternalBlockchain.g:2891:1: ( ( rule__ExpresionAritmetica__DerAssignment_3 ) )
            // InternalBlockchain.g:2892:2: ( rule__ExpresionAritmetica__DerAssignment_3 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_3()); 
            // InternalBlockchain.g:2893:2: ( rule__ExpresionAritmetica__DerAssignment_3 )
            // InternalBlockchain.g:2893:3: rule__ExpresionAritmetica__DerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__DerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_3()); 

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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalBlockchain.g:2902:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2906:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalBlockchain.g:2907:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalBlockchain.g:2914:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2918:1: ( ( 'var' ) )
            // InternalBlockchain.g:2919:1: ( 'var' )
            {
            // InternalBlockchain.g:2919:1: ( 'var' )
            // InternalBlockchain.g:2920:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBlockchain.g:2929:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2933:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalBlockchain.g:2934:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalBlockchain.g:2941:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__TipodatoAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2945:1: ( ( ( rule__Variable__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:2946:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:2946:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:2947:2: ( rule__Variable__TipodatoAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:2948:2: ( rule__Variable__TipodatoAssignment_1 )
            // InternalBlockchain.g:2948:3: rule__Variable__TipodatoAssignment_1
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
    // InternalBlockchain.g:2956:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2960:1: ( rule__Variable__Group__2__Impl )
            // InternalBlockchain.g:2961:2: rule__Variable__Group__2__Impl
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
    // InternalBlockchain.g:2967:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2971:1: ( ( ( rule__Variable__NameAssignment_2 )? ) )
            // InternalBlockchain.g:2972:1: ( ( rule__Variable__NameAssignment_2 )? )
            {
            // InternalBlockchain.g:2972:1: ( ( rule__Variable__NameAssignment_2 )? )
            // InternalBlockchain.g:2973:2: ( rule__Variable__NameAssignment_2 )?
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2974:2: ( rule__Variable__NameAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBlockchain.g:2974:3: rule__Variable__NameAssignment_2
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
    // InternalBlockchain.g:2983:1: rule__Condicional__Group__0 : rule__Condicional__Group__0__Impl rule__Condicional__Group__1 ;
    public final void rule__Condicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2987:1: ( rule__Condicional__Group__0__Impl rule__Condicional__Group__1 )
            // InternalBlockchain.g:2988:2: rule__Condicional__Group__0__Impl rule__Condicional__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBlockchain.g:2995:1: rule__Condicional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2999:1: ( ( 'if' ) )
            // InternalBlockchain.g:3000:1: ( 'if' )
            {
            // InternalBlockchain.g:3000:1: ( 'if' )
            // InternalBlockchain.g:3001:2: 'if'
            {
             before(grammarAccess.getCondicionalAccess().getIfKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBlockchain.g:3010:1: rule__Condicional__Group__1 : rule__Condicional__Group__1__Impl rule__Condicional__Group__2 ;
    public final void rule__Condicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3014:1: ( rule__Condicional__Group__1__Impl rule__Condicional__Group__2 )
            // InternalBlockchain.g:3015:2: rule__Condicional__Group__1__Impl rule__Condicional__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalBlockchain.g:3022:1: rule__Condicional__Group__1__Impl : ( '(' ) ;
    public final void rule__Condicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3026:1: ( ( '(' ) )
            // InternalBlockchain.g:3027:1: ( '(' )
            {
            // InternalBlockchain.g:3027:1: ( '(' )
            // InternalBlockchain.g:3028:2: '('
            {
             before(grammarAccess.getCondicionalAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalBlockchain.g:3037:1: rule__Condicional__Group__2 : rule__Condicional__Group__2__Impl rule__Condicional__Group__3 ;
    public final void rule__Condicional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3041:1: ( rule__Condicional__Group__2__Impl rule__Condicional__Group__3 )
            // InternalBlockchain.g:3042:2: rule__Condicional__Group__2__Impl rule__Condicional__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalBlockchain.g:3049:1: rule__Condicional__Group__2__Impl : ( ( rule__Condicional__ExpresionlogicaAssignment_2 ) ) ;
    public final void rule__Condicional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3053:1: ( ( ( rule__Condicional__ExpresionlogicaAssignment_2 ) ) )
            // InternalBlockchain.g:3054:1: ( ( rule__Condicional__ExpresionlogicaAssignment_2 ) )
            {
            // InternalBlockchain.g:3054:1: ( ( rule__Condicional__ExpresionlogicaAssignment_2 ) )
            // InternalBlockchain.g:3055:2: ( rule__Condicional__ExpresionlogicaAssignment_2 )
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_2()); 
            // InternalBlockchain.g:3056:2: ( rule__Condicional__ExpresionlogicaAssignment_2 )
            // InternalBlockchain.g:3056:3: rule__Condicional__ExpresionlogicaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__ExpresionlogicaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_2()); 

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
    // InternalBlockchain.g:3064:1: rule__Condicional__Group__3 : rule__Condicional__Group__3__Impl rule__Condicional__Group__4 ;
    public final void rule__Condicional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3068:1: ( rule__Condicional__Group__3__Impl rule__Condicional__Group__4 )
            // InternalBlockchain.g:3069:2: rule__Condicional__Group__3__Impl rule__Condicional__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalBlockchain.g:3076:1: rule__Condicional__Group__3__Impl : ( ')' ) ;
    public final void rule__Condicional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3080:1: ( ( ')' ) )
            // InternalBlockchain.g:3081:1: ( ')' )
            {
            // InternalBlockchain.g:3081:1: ( ')' )
            // InternalBlockchain.g:3082:2: ')'
            {
             before(grammarAccess.getCondicionalAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightParenthesisKeyword_3()); 

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
    // InternalBlockchain.g:3091:1: rule__Condicional__Group__4 : rule__Condicional__Group__4__Impl rule__Condicional__Group__5 ;
    public final void rule__Condicional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3095:1: ( rule__Condicional__Group__4__Impl rule__Condicional__Group__5 )
            // InternalBlockchain.g:3096:2: rule__Condicional__Group__4__Impl rule__Condicional__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalBlockchain.g:3103:1: rule__Condicional__Group__4__Impl : ( '{' ) ;
    public final void rule__Condicional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3107:1: ( ( '{' ) )
            // InternalBlockchain.g:3108:1: ( '{' )
            {
            // InternalBlockchain.g:3108:1: ( '{' )
            // InternalBlockchain.g:3109:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_4()); 

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
    // InternalBlockchain.g:3118:1: rule__Condicional__Group__5 : rule__Condicional__Group__5__Impl rule__Condicional__Group__6 ;
    public final void rule__Condicional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3122:1: ( rule__Condicional__Group__5__Impl rule__Condicional__Group__6 )
            // InternalBlockchain.g:3123:2: rule__Condicional__Group__5__Impl rule__Condicional__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Condicional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__6();

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
    // InternalBlockchain.g:3130:1: rule__Condicional__Group__5__Impl : ( ( ( rule__Condicional__LineaAssignment_5 ) ) ( ( rule__Condicional__LineaAssignment_5 )* ) ) ;
    public final void rule__Condicional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3134:1: ( ( ( ( rule__Condicional__LineaAssignment_5 ) ) ( ( rule__Condicional__LineaAssignment_5 )* ) ) )
            // InternalBlockchain.g:3135:1: ( ( ( rule__Condicional__LineaAssignment_5 ) ) ( ( rule__Condicional__LineaAssignment_5 )* ) )
            {
            // InternalBlockchain.g:3135:1: ( ( ( rule__Condicional__LineaAssignment_5 ) ) ( ( rule__Condicional__LineaAssignment_5 )* ) )
            // InternalBlockchain.g:3136:2: ( ( rule__Condicional__LineaAssignment_5 ) ) ( ( rule__Condicional__LineaAssignment_5 )* )
            {
            // InternalBlockchain.g:3136:2: ( ( rule__Condicional__LineaAssignment_5 ) )
            // InternalBlockchain.g:3137:3: ( rule__Condicional__LineaAssignment_5 )
            {
             before(grammarAccess.getCondicionalAccess().getLineaAssignment_5()); 
            // InternalBlockchain.g:3138:3: ( rule__Condicional__LineaAssignment_5 )
            // InternalBlockchain.g:3138:4: rule__Condicional__LineaAssignment_5
            {
            pushFollow(FOLLOW_26);
            rule__Condicional__LineaAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getLineaAssignment_5()); 

            }

            // InternalBlockchain.g:3141:2: ( ( rule__Condicional__LineaAssignment_5 )* )
            // InternalBlockchain.g:3142:3: ( rule__Condicional__LineaAssignment_5 )*
            {
             before(grammarAccess.getCondicionalAccess().getLineaAssignment_5()); 
            // InternalBlockchain.g:3143:3: ( rule__Condicional__LineaAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=49 && LA30_0<=52)||(LA30_0>=54 && LA30_0<=58)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBlockchain.g:3143:4: rule__Condicional__LineaAssignment_5
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Condicional__LineaAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCondicionalAccess().getLineaAssignment_5()); 

            }


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


    // $ANTLR start "rule__Condicional__Group__6"
    // InternalBlockchain.g:3152:1: rule__Condicional__Group__6 : rule__Condicional__Group__6__Impl rule__Condicional__Group__7 ;
    public final void rule__Condicional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3156:1: ( rule__Condicional__Group__6__Impl rule__Condicional__Group__7 )
            // InternalBlockchain.g:3157:2: rule__Condicional__Group__6__Impl rule__Condicional__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Condicional__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__7();

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
    // $ANTLR end "rule__Condicional__Group__6"


    // $ANTLR start "rule__Condicional__Group__6__Impl"
    // InternalBlockchain.g:3164:1: rule__Condicional__Group__6__Impl : ( '}' ) ;
    public final void rule__Condicional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3168:1: ( ( '}' ) )
            // InternalBlockchain.g:3169:1: ( '}' )
            {
            // InternalBlockchain.g:3169:1: ( '}' )
            // InternalBlockchain.g:3170:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Condicional__Group__6__Impl"


    // $ANTLR start "rule__Condicional__Group__7"
    // InternalBlockchain.g:3179:1: rule__Condicional__Group__7 : rule__Condicional__Group__7__Impl ;
    public final void rule__Condicional__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3183:1: ( rule__Condicional__Group__7__Impl )
            // InternalBlockchain.g:3184:2: rule__Condicional__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__7__Impl();

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
    // $ANTLR end "rule__Condicional__Group__7"


    // $ANTLR start "rule__Condicional__Group__7__Impl"
    // InternalBlockchain.g:3190:1: rule__Condicional__Group__7__Impl : ( ( rule__Condicional__ElseAssignment_7 )? ) ;
    public final void rule__Condicional__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3194:1: ( ( ( rule__Condicional__ElseAssignment_7 )? ) )
            // InternalBlockchain.g:3195:1: ( ( rule__Condicional__ElseAssignment_7 )? )
            {
            // InternalBlockchain.g:3195:1: ( ( rule__Condicional__ElseAssignment_7 )? )
            // InternalBlockchain.g:3196:2: ( rule__Condicional__ElseAssignment_7 )?
            {
             before(grammarAccess.getCondicionalAccess().getElseAssignment_7()); 
            // InternalBlockchain.g:3197:2: ( rule__Condicional__ElseAssignment_7 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBlockchain.g:3197:3: rule__Condicional__ElseAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ElseAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getElseAssignment_7()); 

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
    // $ANTLR end "rule__Condicional__Group__7__Impl"


    // $ANTLR start "rule__Else__Group__0"
    // InternalBlockchain.g:3206:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3210:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalBlockchain.g:3211:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBlockchain.g:3218:1: rule__Else__Group__0__Impl : ( () ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3222:1: ( ( () ) )
            // InternalBlockchain.g:3223:1: ( () )
            {
            // InternalBlockchain.g:3223:1: ( () )
            // InternalBlockchain.g:3224:2: ()
            {
             before(grammarAccess.getElseAccess().getCondicionalAction_0()); 
            // InternalBlockchain.g:3225:2: ()
            // InternalBlockchain.g:3225:3: 
            {
            }

             after(grammarAccess.getElseAccess().getCondicionalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0__Impl"


    // $ANTLR start "rule__Else__Group__1"
    // InternalBlockchain.g:3233:1: rule__Else__Group__1 : rule__Else__Group__1__Impl rule__Else__Group__2 ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3237:1: ( rule__Else__Group__1__Impl rule__Else__Group__2 )
            // InternalBlockchain.g:3238:2: rule__Else__Group__1__Impl rule__Else__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBlockchain.g:3245:1: rule__Else__Group__1__Impl : ( 'else' ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3249:1: ( ( 'else' ) )
            // InternalBlockchain.g:3250:1: ( 'else' )
            {
            // InternalBlockchain.g:3250:1: ( 'else' )
            // InternalBlockchain.g:3251:2: 'else'
            {
             before(grammarAccess.getElseAccess().getElseKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getElseKeyword_1()); 

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
    // InternalBlockchain.g:3260:1: rule__Else__Group__2 : rule__Else__Group__2__Impl rule__Else__Group__3 ;
    public final void rule__Else__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3264:1: ( rule__Else__Group__2__Impl rule__Else__Group__3 )
            // InternalBlockchain.g:3265:2: rule__Else__Group__2__Impl rule__Else__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalBlockchain.g:3272:1: rule__Else__Group__2__Impl : ( '{' ) ;
    public final void rule__Else__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3276:1: ( ( '{' ) )
            // InternalBlockchain.g:3277:1: ( '{' )
            {
            // InternalBlockchain.g:3277:1: ( '{' )
            // InternalBlockchain.g:3278:2: '{'
            {
             before(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalBlockchain.g:3287:1: rule__Else__Group__3 : rule__Else__Group__3__Impl rule__Else__Group__4 ;
    public final void rule__Else__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3291:1: ( rule__Else__Group__3__Impl rule__Else__Group__4 )
            // InternalBlockchain.g:3292:2: rule__Else__Group__3__Impl rule__Else__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Else__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__4();

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
    // InternalBlockchain.g:3299:1: rule__Else__Group__3__Impl : ( ( ( rule__Else__LineaAssignment_3 ) ) ( ( rule__Else__LineaAssignment_3 )* ) ) ;
    public final void rule__Else__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3303:1: ( ( ( ( rule__Else__LineaAssignment_3 ) ) ( ( rule__Else__LineaAssignment_3 )* ) ) )
            // InternalBlockchain.g:3304:1: ( ( ( rule__Else__LineaAssignment_3 ) ) ( ( rule__Else__LineaAssignment_3 )* ) )
            {
            // InternalBlockchain.g:3304:1: ( ( ( rule__Else__LineaAssignment_3 ) ) ( ( rule__Else__LineaAssignment_3 )* ) )
            // InternalBlockchain.g:3305:2: ( ( rule__Else__LineaAssignment_3 ) ) ( ( rule__Else__LineaAssignment_3 )* )
            {
            // InternalBlockchain.g:3305:2: ( ( rule__Else__LineaAssignment_3 ) )
            // InternalBlockchain.g:3306:3: ( rule__Else__LineaAssignment_3 )
            {
             before(grammarAccess.getElseAccess().getLineaAssignment_3()); 
            // InternalBlockchain.g:3307:3: ( rule__Else__LineaAssignment_3 )
            // InternalBlockchain.g:3307:4: rule__Else__LineaAssignment_3
            {
            pushFollow(FOLLOW_26);
            rule__Else__LineaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getLineaAssignment_3()); 

            }

            // InternalBlockchain.g:3310:2: ( ( rule__Else__LineaAssignment_3 )* )
            // InternalBlockchain.g:3311:3: ( rule__Else__LineaAssignment_3 )*
            {
             before(grammarAccess.getElseAccess().getLineaAssignment_3()); 
            // InternalBlockchain.g:3312:3: ( rule__Else__LineaAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=49 && LA32_0<=52)||(LA32_0>=54 && LA32_0<=58)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBlockchain.g:3312:4: rule__Else__LineaAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Else__LineaAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getElseAccess().getLineaAssignment_3()); 

            }


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


    // $ANTLR start "rule__Else__Group__4"
    // InternalBlockchain.g:3321:1: rule__Else__Group__4 : rule__Else__Group__4__Impl ;
    public final void rule__Else__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3325:1: ( rule__Else__Group__4__Impl )
            // InternalBlockchain.g:3326:2: rule__Else__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__4__Impl();

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
    // $ANTLR end "rule__Else__Group__4"


    // $ANTLR start "rule__Else__Group__4__Impl"
    // InternalBlockchain.g:3332:1: rule__Else__Group__4__Impl : ( '}' ) ;
    public final void rule__Else__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3336:1: ( ( '}' ) )
            // InternalBlockchain.g:3337:1: ( '}' )
            {
            // InternalBlockchain.g:3337:1: ( '}' )
            // InternalBlockchain.g:3338:2: '}'
            {
             before(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Else__Group__4__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__0"
    // InternalBlockchain.g:3348:1: rule__ExpresionNumerica__Group__0 : rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 ;
    public final void rule__ExpresionNumerica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3352:1: ( rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 )
            // InternalBlockchain.g:3353:2: rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ExpresionNumerica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__1();

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
    // $ANTLR end "rule__ExpresionNumerica__Group__0"


    // $ANTLR start "rule__ExpresionNumerica__Group__0__Impl"
    // InternalBlockchain.g:3360:1: rule__ExpresionNumerica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionNumerica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3364:1: ( ( () ) )
            // InternalBlockchain.g:3365:1: ( () )
            {
            // InternalBlockchain.g:3365:1: ( () )
            // InternalBlockchain.g:3366:2: ()
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 
            // InternalBlockchain.g:3367:2: ()
            // InternalBlockchain.g:3367:3: 
            {
            }

             after(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__1"
    // InternalBlockchain.g:3375:1: rule__ExpresionNumerica__Group__1 : rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 ;
    public final void rule__ExpresionNumerica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3379:1: ( rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 )
            // InternalBlockchain.g:3380:2: rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__ExpresionNumerica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__2();

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
    // $ANTLR end "rule__ExpresionNumerica__Group__1"


    // $ANTLR start "rule__ExpresionNumerica__Group__1__Impl"
    // InternalBlockchain.g:3387:1: rule__ExpresionNumerica__Group__1__Impl : ( 'ExpNum' ) ;
    public final void rule__ExpresionNumerica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3391:1: ( ( 'ExpNum' ) )
            // InternalBlockchain.g:3392:1: ( 'ExpNum' )
            {
            // InternalBlockchain.g:3392:1: ( 'ExpNum' )
            // InternalBlockchain.g:3393:2: 'ExpNum'
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 

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
    // $ANTLR end "rule__ExpresionNumerica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__2"
    // InternalBlockchain.g:3402:1: rule__ExpresionNumerica__Group__2 : rule__ExpresionNumerica__Group__2__Impl ;
    public final void rule__ExpresionNumerica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3406:1: ( rule__ExpresionNumerica__Group__2__Impl )
            // InternalBlockchain.g:3407:2: rule__ExpresionNumerica__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__2__Impl();

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
    // $ANTLR end "rule__ExpresionNumerica__Group__2"


    // $ANTLR start "rule__ExpresionNumerica__Group__2__Impl"
    // InternalBlockchain.g:3413:1: rule__ExpresionNumerica__Group__2__Impl : ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionNumerica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3417:1: ( ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3418:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3418:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            // InternalBlockchain.g:3419:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3420:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_INT||LA33_1==11) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt33=1;
                    }
                    break;
                case 11:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3==RULE_INT) ) {
                        alt33=1;
                    }
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // InternalBlockchain.g:3420:3: rule__ExpresionNumerica__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionNumerica__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ExpresionNumerica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__0"
    // InternalBlockchain.g:3429:1: rule__ExpresionTexto__Group__0 : rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 ;
    public final void rule__ExpresionTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3433:1: ( rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 )
            // InternalBlockchain.g:3434:2: rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalBlockchain.g:3441:1: rule__ExpresionTexto__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3445:1: ( ( () ) )
            // InternalBlockchain.g:3446:1: ( () )
            {
            // InternalBlockchain.g:3446:1: ( () )
            // InternalBlockchain.g:3447:2: ()
            {
             before(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 
            // InternalBlockchain.g:3448:2: ()
            // InternalBlockchain.g:3448:3: 
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
    // InternalBlockchain.g:3456:1: rule__ExpresionTexto__Group__1 : rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 ;
    public final void rule__ExpresionTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3460:1: ( rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 )
            // InternalBlockchain.g:3461:2: rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2
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
    // InternalBlockchain.g:3468:1: rule__ExpresionTexto__Group__1__Impl : ( 'ExpTex' ) ;
    public final void rule__ExpresionTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3472:1: ( ( 'ExpTex' ) )
            // InternalBlockchain.g:3473:1: ( 'ExpTex' )
            {
            // InternalBlockchain.g:3473:1: ( 'ExpTex' )
            // InternalBlockchain.g:3474:2: 'ExpTex'
            {
             before(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBlockchain.g:3483:1: rule__ExpresionTexto__Group__2 : rule__ExpresionTexto__Group__2__Impl ;
    public final void rule__ExpresionTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3487:1: ( rule__ExpresionTexto__Group__2__Impl )
            // InternalBlockchain.g:3488:2: rule__ExpresionTexto__Group__2__Impl
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
    // InternalBlockchain.g:3494:1: rule__ExpresionTexto__Group__2__Impl : ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3498:1: ( ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3499:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3499:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            // InternalBlockchain.g:3500:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3501:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBlockchain.g:3501:3: rule__ExpresionTexto__ValueAssignment_2
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
    // InternalBlockchain.g:3510:1: rule__ExpresionBoolean__Group__0 : rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 ;
    public final void rule__ExpresionBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3514:1: ( rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 )
            // InternalBlockchain.g:3515:2: rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBlockchain.g:3522:1: rule__ExpresionBoolean__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3526:1: ( ( () ) )
            // InternalBlockchain.g:3527:1: ( () )
            {
            // InternalBlockchain.g:3527:1: ( () )
            // InternalBlockchain.g:3528:2: ()
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 
            // InternalBlockchain.g:3529:2: ()
            // InternalBlockchain.g:3529:3: 
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
    // InternalBlockchain.g:3537:1: rule__ExpresionBoolean__Group__1 : rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 ;
    public final void rule__ExpresionBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3541:1: ( rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 )
            // InternalBlockchain.g:3542:2: rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalBlockchain.g:3549:1: rule__ExpresionBoolean__Group__1__Impl : ( 'ExpBool' ) ;
    public final void rule__ExpresionBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3553:1: ( ( 'ExpBool' ) )
            // InternalBlockchain.g:3554:1: ( 'ExpBool' )
            {
            // InternalBlockchain.g:3554:1: ( 'ExpBool' )
            // InternalBlockchain.g:3555:2: 'ExpBool'
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBlockchain.g:3564:1: rule__ExpresionBoolean__Group__2 : rule__ExpresionBoolean__Group__2__Impl ;
    public final void rule__ExpresionBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3568:1: ( rule__ExpresionBoolean__Group__2__Impl )
            // InternalBlockchain.g:3569:2: rule__ExpresionBoolean__Group__2__Impl
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
    // InternalBlockchain.g:3575:1: rule__ExpresionBoolean__Group__2__Impl : ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3579:1: ( ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3580:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3580:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            // InternalBlockchain.g:3581:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3582:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=12 && LA35_0<=13)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBlockchain.g:3582:3: rule__ExpresionBoolean__ValueAssignment_2
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
    // InternalBlockchain.g:3591:1: rule__ExpresionReferenciada__Group__0 : rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 ;
    public final void rule__ExpresionReferenciada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3595:1: ( rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 )
            // InternalBlockchain.g:3596:2: rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlockchain.g:3603:1: rule__ExpresionReferenciada__Group__0__Impl : ( 'ExpRef' ) ;
    public final void rule__ExpresionReferenciada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3607:1: ( ( 'ExpRef' ) )
            // InternalBlockchain.g:3608:1: ( 'ExpRef' )
            {
            // InternalBlockchain.g:3608:1: ( 'ExpRef' )
            // InternalBlockchain.g:3609:2: 'ExpRef'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBlockchain.g:3618:1: rule__ExpresionReferenciada__Group__1 : rule__ExpresionReferenciada__Group__1__Impl ;
    public final void rule__ExpresionReferenciada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3622:1: ( rule__ExpresionReferenciada__Group__1__Impl )
            // InternalBlockchain.g:3623:2: rule__ExpresionReferenciada__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__1__Impl();

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
    // InternalBlockchain.g:3629:1: rule__ExpresionReferenciada__Group__1__Impl : ( ( rule__ExpresionReferenciada__ReferenciaAssignment_1 ) ) ;
    public final void rule__ExpresionReferenciada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3633:1: ( ( ( rule__ExpresionReferenciada__ReferenciaAssignment_1 ) ) )
            // InternalBlockchain.g:3634:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_1 ) )
            {
            // InternalBlockchain.g:3634:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_1 ) )
            // InternalBlockchain.g:3635:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_1 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_1()); 
            // InternalBlockchain.g:3636:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_1 )
            // InternalBlockchain.g:3636:3: rule__ExpresionReferenciada__ReferenciaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__ReferenciaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_1()); 

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


    // $ANTLR start "rule__ExpresionRelacional__Group__0"
    // InternalBlockchain.g:3645:1: rule__ExpresionRelacional__Group__0 : rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 ;
    public final void rule__ExpresionRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3649:1: ( rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 )
            // InternalBlockchain.g:3650:2: rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalBlockchain.g:3657:1: rule__ExpresionRelacional__Group__0__Impl : ( 'ExpRel' ) ;
    public final void rule__ExpresionRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3661:1: ( ( 'ExpRel' ) )
            // InternalBlockchain.g:3662:1: ( 'ExpRel' )
            {
            // InternalBlockchain.g:3662:1: ( 'ExpRel' )
            // InternalBlockchain.g:3663:2: 'ExpRel'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalBlockchain.g:3672:1: rule__ExpresionRelacional__Group__1 : rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 ;
    public final void rule__ExpresionRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3676:1: ( rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 )
            // InternalBlockchain.g:3677:2: rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalBlockchain.g:3684:1: rule__ExpresionRelacional__Group__1__Impl : ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) ;
    public final void rule__ExpresionRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3688:1: ( ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) )
            // InternalBlockchain.g:3689:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            {
            // InternalBlockchain.g:3689:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            // InternalBlockchain.g:3690:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 
            // InternalBlockchain.g:3691:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            // InternalBlockchain.g:3691:3: rule__ExpresionRelacional__IzqAssignment_1
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
    // InternalBlockchain.g:3699:1: rule__ExpresionRelacional__Group__2 : rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 ;
    public final void rule__ExpresionRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3703:1: ( rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 )
            // InternalBlockchain.g:3704:2: rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalBlockchain.g:3711:1: rule__ExpresionRelacional__Group__2__Impl : ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) ;
    public final void rule__ExpresionRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3715:1: ( ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) )
            // InternalBlockchain.g:3716:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            {
            // InternalBlockchain.g:3716:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            // InternalBlockchain.g:3717:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 
            // InternalBlockchain.g:3718:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==11) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBlockchain.g:3718:3: rule__ExpresionRelacional__OperadorRelacionalAssignment_2
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
    // InternalBlockchain.g:3726:1: rule__ExpresionRelacional__Group__3 : rule__ExpresionRelacional__Group__3__Impl ;
    public final void rule__ExpresionRelacional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3730:1: ( rule__ExpresionRelacional__Group__3__Impl )
            // InternalBlockchain.g:3731:2: rule__ExpresionRelacional__Group__3__Impl
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
    // InternalBlockchain.g:3737:1: rule__ExpresionRelacional__Group__3__Impl : ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) ;
    public final void rule__ExpresionRelacional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3741:1: ( ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) )
            // InternalBlockchain.g:3742:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            {
            // InternalBlockchain.g:3742:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            // InternalBlockchain.g:3743:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 
            // InternalBlockchain.g:3744:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            // InternalBlockchain.g:3744:3: rule__ExpresionRelacional__DerAssignment_3
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


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalBlockchain.g:3753:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3757:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalBlockchain.g:3758:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBlockchain.g:3765:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3769:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:3770:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:3770:1: ( ( '-' )? )
            // InternalBlockchain.g:3771:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:3772:2: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBlockchain.g:3772:3: '-'
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
    // InternalBlockchain.g:3780:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3784:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalBlockchain.g:3785:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalBlockchain.g:3792:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3796:1: ( ( ( RULE_INT )? ) )
            // InternalBlockchain.g:3797:1: ( ( RULE_INT )? )
            {
            // InternalBlockchain.g:3797:1: ( ( RULE_INT )? )
            // InternalBlockchain.g:3798:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalBlockchain.g:3799:2: ( RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBlockchain.g:3799:3: RULE_INT
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
    // InternalBlockchain.g:3807:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3811:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalBlockchain.g:3812:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalBlockchain.g:3819:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3823:1: ( ( '.' ) )
            // InternalBlockchain.g:3824:1: ( '.' )
            {
            // InternalBlockchain.g:3824:1: ( '.' )
            // InternalBlockchain.g:3825:2: '.'
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
    // InternalBlockchain.g:3834:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3838:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalBlockchain.g:3839:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalBlockchain.g:3846:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3850:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:3851:1: ( RULE_INT )
            {
            // InternalBlockchain.g:3851:1: ( RULE_INT )
            // InternalBlockchain.g:3852:2: RULE_INT
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
    // InternalBlockchain.g:3861:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3865:1: ( rule__EDouble__Group__4__Impl )
            // InternalBlockchain.g:3866:2: rule__EDouble__Group__4__Impl
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
    // InternalBlockchain.g:3872:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3876:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalBlockchain.g:3877:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalBlockchain.g:3877:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalBlockchain.g:3878:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalBlockchain.g:3879:2: ( rule__EDouble__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=14 && LA39_0<=15)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:3879:3: rule__EDouble__Group_4__0
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
    // InternalBlockchain.g:3888:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3892:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalBlockchain.g:3893:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBlockchain.g:3900:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3904:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalBlockchain.g:3905:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalBlockchain.g:3905:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalBlockchain.g:3906:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalBlockchain.g:3907:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalBlockchain.g:3907:3: rule__EDouble__Alternatives_4_0
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
    // InternalBlockchain.g:3915:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3919:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalBlockchain.g:3920:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalBlockchain.g:3927:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3931:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:3932:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:3932:1: ( ( '-' )? )
            // InternalBlockchain.g:3933:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBlockchain.g:3934:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:3934:3: '-'
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
    // InternalBlockchain.g:3942:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3946:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalBlockchain.g:3947:2: rule__EDouble__Group_4__2__Impl
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
    // InternalBlockchain.g:3953:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3957:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:3958:1: ( RULE_INT )
            {
            // InternalBlockchain.g:3958:1: ( RULE_INT )
            // InternalBlockchain.g:3959:2: RULE_INT
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


    // $ANTLR start "rule__Primitivo__Group__0"
    // InternalBlockchain.g:3969:1: rule__Primitivo__Group__0 : rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 ;
    public final void rule__Primitivo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3973:1: ( rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 )
            // InternalBlockchain.g:3974:2: rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:3981:1: rule__Primitivo__Group__0__Impl : ( () ) ;
    public final void rule__Primitivo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3985:1: ( ( () ) )
            // InternalBlockchain.g:3986:1: ( () )
            {
            // InternalBlockchain.g:3986:1: ( () )
            // InternalBlockchain.g:3987:2: ()
            {
             before(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 
            // InternalBlockchain.g:3988:2: ()
            // InternalBlockchain.g:3988:3: 
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
    // InternalBlockchain.g:3996:1: rule__Primitivo__Group__1 : rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 ;
    public final void rule__Primitivo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4000:1: ( rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 )
            // InternalBlockchain.g:4001:2: rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:4008:1: rule__Primitivo__Group__1__Impl : ( ( rule__Primitivo__TipoAssignment_1 )? ) ;
    public final void rule__Primitivo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4012:1: ( ( ( rule__Primitivo__TipoAssignment_1 )? ) )
            // InternalBlockchain.g:4013:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            {
            // InternalBlockchain.g:4013:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            // InternalBlockchain.g:4014:2: ( rule__Primitivo__TipoAssignment_1 )?
            {
             before(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 
            // InternalBlockchain.g:4015:2: ( rule__Primitivo__TipoAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=31 && LA41_0<=34)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBlockchain.g:4015:3: rule__Primitivo__TipoAssignment_1
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
    // InternalBlockchain.g:4023:1: rule__Primitivo__Group__2 : rule__Primitivo__Group__2__Impl ;
    public final void rule__Primitivo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4027:1: ( rule__Primitivo__Group__2__Impl )
            // InternalBlockchain.g:4028:2: rule__Primitivo__Group__2__Impl
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
    // InternalBlockchain.g:4034:1: rule__Primitivo__Group__2__Impl : ( ( rule__Primitivo__NameAssignment_2 ) ) ;
    public final void rule__Primitivo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4038:1: ( ( ( rule__Primitivo__NameAssignment_2 ) ) )
            // InternalBlockchain.g:4039:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:4039:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            // InternalBlockchain.g:4040:2: ( rule__Primitivo__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:4041:2: ( rule__Primitivo__NameAssignment_2 )
            // InternalBlockchain.g:4041:3: rule__Primitivo__NameAssignment_2
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
    // InternalBlockchain.g:4050:1: rule__Mapa__Group__0 : rule__Mapa__Group__0__Impl rule__Mapa__Group__1 ;
    public final void rule__Mapa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4054:1: ( rule__Mapa__Group__0__Impl rule__Mapa__Group__1 )
            // InternalBlockchain.g:4055:2: rule__Mapa__Group__0__Impl rule__Mapa__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBlockchain.g:4062:1: rule__Mapa__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Mapa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4066:1: ( ( 'Map' ) )
            // InternalBlockchain.g:4067:1: ( 'Map' )
            {
            // InternalBlockchain.g:4067:1: ( 'Map' )
            // InternalBlockchain.g:4068:2: 'Map'
            {
             before(grammarAccess.getMapaAccess().getMapKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalBlockchain.g:4077:1: rule__Mapa__Group__1 : rule__Mapa__Group__1__Impl rule__Mapa__Group__2 ;
    public final void rule__Mapa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4081:1: ( rule__Mapa__Group__1__Impl rule__Mapa__Group__2 )
            // InternalBlockchain.g:4082:2: rule__Mapa__Group__1__Impl rule__Mapa__Group__2
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
    // InternalBlockchain.g:4089:1: rule__Mapa__Group__1__Impl : ( '<' ) ;
    public final void rule__Mapa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4093:1: ( ( '<' ) )
            // InternalBlockchain.g:4094:1: ( '<' )
            {
            // InternalBlockchain.g:4094:1: ( '<' )
            // InternalBlockchain.g:4095:2: '<'
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
    // InternalBlockchain.g:4104:1: rule__Mapa__Group__2 : rule__Mapa__Group__2__Impl rule__Mapa__Group__3 ;
    public final void rule__Mapa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4108:1: ( rule__Mapa__Group__2__Impl rule__Mapa__Group__3 )
            // InternalBlockchain.g:4109:2: rule__Mapa__Group__2__Impl rule__Mapa__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalBlockchain.g:4116:1: rule__Mapa__Group__2__Impl : ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) ;
    public final void rule__Mapa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4120:1: ( ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) )
            // InternalBlockchain.g:4121:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            {
            // InternalBlockchain.g:4121:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            // InternalBlockchain.g:4122:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 
            // InternalBlockchain.g:4123:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            // InternalBlockchain.g:4123:3: rule__Mapa__TipoDatoKeyAssignment_2
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
    // InternalBlockchain.g:4131:1: rule__Mapa__Group__3 : rule__Mapa__Group__3__Impl rule__Mapa__Group__4 ;
    public final void rule__Mapa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4135:1: ( rule__Mapa__Group__3__Impl rule__Mapa__Group__4 )
            // InternalBlockchain.g:4136:2: rule__Mapa__Group__3__Impl rule__Mapa__Group__4
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
    // InternalBlockchain.g:4143:1: rule__Mapa__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4147:1: ( ( ',' ) )
            // InternalBlockchain.g:4148:1: ( ',' )
            {
            // InternalBlockchain.g:4148:1: ( ',' )
            // InternalBlockchain.g:4149:2: ','
            {
             before(grammarAccess.getMapaAccess().getCommaKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBlockchain.g:4158:1: rule__Mapa__Group__4 : rule__Mapa__Group__4__Impl rule__Mapa__Group__5 ;
    public final void rule__Mapa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4162:1: ( rule__Mapa__Group__4__Impl rule__Mapa__Group__5 )
            // InternalBlockchain.g:4163:2: rule__Mapa__Group__4__Impl rule__Mapa__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalBlockchain.g:4170:1: rule__Mapa__Group__4__Impl : ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) ;
    public final void rule__Mapa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4174:1: ( ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) )
            // InternalBlockchain.g:4175:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            {
            // InternalBlockchain.g:4175:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            // InternalBlockchain.g:4176:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 
            // InternalBlockchain.g:4177:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            // InternalBlockchain.g:4177:3: rule__Mapa__TipoDatoValueAssignment_4
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
    // InternalBlockchain.g:4185:1: rule__Mapa__Group__5 : rule__Mapa__Group__5__Impl rule__Mapa__Group__6 ;
    public final void rule__Mapa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4189:1: ( rule__Mapa__Group__5__Impl rule__Mapa__Group__6 )
            // InternalBlockchain.g:4190:2: rule__Mapa__Group__5__Impl rule__Mapa__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalBlockchain.g:4197:1: rule__Mapa__Group__5__Impl : ( '>' ) ;
    public final void rule__Mapa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4201:1: ( ( '>' ) )
            // InternalBlockchain.g:4202:1: ( '>' )
            {
            // InternalBlockchain.g:4202:1: ( '>' )
            // InternalBlockchain.g:4203:2: '>'
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
    // InternalBlockchain.g:4212:1: rule__Mapa__Group__6 : rule__Mapa__Group__6__Impl rule__Mapa__Group__7 ;
    public final void rule__Mapa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4216:1: ( rule__Mapa__Group__6__Impl rule__Mapa__Group__7 )
            // InternalBlockchain.g:4217:2: rule__Mapa__Group__6__Impl rule__Mapa__Group__7
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
    // InternalBlockchain.g:4224:1: rule__Mapa__Group__6__Impl : ( ':' ) ;
    public final void rule__Mapa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4228:1: ( ( ':' ) )
            // InternalBlockchain.g:4229:1: ( ':' )
            {
            // InternalBlockchain.g:4229:1: ( ':' )
            // InternalBlockchain.g:4230:2: ':'
            {
             before(grammarAccess.getMapaAccess().getColonKeyword_6()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBlockchain.g:4239:1: rule__Mapa__Group__7 : rule__Mapa__Group__7__Impl ;
    public final void rule__Mapa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4243:1: ( rule__Mapa__Group__7__Impl )
            // InternalBlockchain.g:4244:2: rule__Mapa__Group__7__Impl
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
    // InternalBlockchain.g:4250:1: rule__Mapa__Group__7__Impl : ( ( rule__Mapa__NameAssignment_7 ) ) ;
    public final void rule__Mapa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4254:1: ( ( ( rule__Mapa__NameAssignment_7 ) ) )
            // InternalBlockchain.g:4255:1: ( ( rule__Mapa__NameAssignment_7 ) )
            {
            // InternalBlockchain.g:4255:1: ( ( rule__Mapa__NameAssignment_7 ) )
            // InternalBlockchain.g:4256:2: ( rule__Mapa__NameAssignment_7 )
            {
             before(grammarAccess.getMapaAccess().getNameAssignment_7()); 
            // InternalBlockchain.g:4257:2: ( rule__Mapa__NameAssignment_7 )
            // InternalBlockchain.g:4257:3: rule__Mapa__NameAssignment_7
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
    // InternalBlockchain.g:4266:1: rule__Aplicacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Aplicacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4270:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4271:2: ( ruleEString )
            {
            // InternalBlockchain.g:4271:2: ( ruleEString )
            // InternalBlockchain.g:4272:3: ruleEString
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
    // InternalBlockchain.g:4281:1: rule__Aplicacion__SmartcontractAssignment_4_0 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4285:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4286:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4286:2: ( ruleSmartContract )
            // InternalBlockchain.g:4287:3: ruleSmartContract
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
    // InternalBlockchain.g:4296:1: rule__Aplicacion__SmartcontractAssignment_4_1 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4300:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4301:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4301:2: ( ruleSmartContract )
            // InternalBlockchain.g:4302:3: ruleSmartContract
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
    // InternalBlockchain.g:4311:1: rule__Aplicacion__TipodatoAssignment_5_1 : ( ruleTipoDato ) ;
    public final void rule__Aplicacion__TipodatoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4315:1: ( ( ruleTipoDato ) )
            // InternalBlockchain.g:4316:2: ( ruleTipoDato )
            {
            // InternalBlockchain.g:4316:2: ( ruleTipoDato )
            // InternalBlockchain.g:4317:3: ruleTipoDato
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
    // InternalBlockchain.g:4326:1: rule__SmartContract__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SmartContract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4330:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4331:2: ( ruleEString )
            {
            // InternalBlockchain.g:4331:2: ( ruleEString )
            // InternalBlockchain.g:4332:3: ruleEString
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
    // InternalBlockchain.g:4341:1: rule__SmartContract__EntidadesAssignment_3_0 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4345:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4346:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4346:2: ( ruleEntidad )
            // InternalBlockchain.g:4347:3: ruleEntidad
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
    // InternalBlockchain.g:4356:1: rule__SmartContract__EntidadesAssignment_3_1 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4360:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4361:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4361:2: ( ruleEntidad )
            // InternalBlockchain.g:4362:3: ruleEntidad
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
    // InternalBlockchain.g:4371:1: rule__SmartContract__EstadoAssignment_4_0 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4375:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4376:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4376:2: ( ruleEstado )
            // InternalBlockchain.g:4377:3: ruleEstado
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
    // InternalBlockchain.g:4386:1: rule__SmartContract__EstadoAssignment_4_1 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4390:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4391:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4391:2: ( ruleEstado )
            // InternalBlockchain.g:4392:3: ruleEstado
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
    // InternalBlockchain.g:4401:1: rule__SmartContract__OperacionesAssignment_5_0 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4405:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4406:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4406:2: ( ruleOperacion )
            // InternalBlockchain.g:4407:3: ruleOperacion
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
    // InternalBlockchain.g:4416:1: rule__SmartContract__OperacionesAssignment_5_1 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4420:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4421:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4421:2: ( ruleOperacion )
            // InternalBlockchain.g:4422:3: ruleOperacion
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
    // InternalBlockchain.g:4431:1: rule__Entidad__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4435:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4436:2: ( ruleEString )
            {
            // InternalBlockchain.g:4436:2: ( ruleEString )
            // InternalBlockchain.g:4437:3: ruleEString
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
    // InternalBlockchain.g:4446:1: rule__Entidad__AtributosAssignment_4_0 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4450:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:4451:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:4451:2: ( ruleAtributo )
            // InternalBlockchain.g:4452:3: ruleAtributo
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
    // InternalBlockchain.g:4461:1: rule__Entidad__AtributosAssignment_4_1 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4465:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:4466:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:4466:2: ( ruleAtributo )
            // InternalBlockchain.g:4467:3: ruleAtributo
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


    // $ANTLR start "rule__Operacion__EsUserDefinedAssignment_2_1"
    // InternalBlockchain.g:4476:1: rule__Operacion__EsUserDefinedAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Operacion__EsUserDefinedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4480:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:4481:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:4481:2: ( ruleEBoolean )
            // InternalBlockchain.g:4482:3: ruleEBoolean
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Operacion__EsUserDefinedAssignment_2_1"


    // $ANTLR start "rule__Operacion__NameAssignment_3"
    // InternalBlockchain.g:4491:1: rule__Operacion__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Operacion__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4495:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4496:2: ( ruleEString )
            {
            // InternalBlockchain.g:4496:2: ( ruleEString )
            // InternalBlockchain.g:4497:3: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Operacion__NameAssignment_3"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_5_0"
    // InternalBlockchain.g:4506:1: rule__Operacion__ParametrosAssignment_5_0 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4510:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:4511:2: ( ruleParametro )
            {
            // InternalBlockchain.g:4511:2: ( ruleParametro )
            // InternalBlockchain.g:4512:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Operacion__ParametrosAssignment_5_0"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_5_1_1"
    // InternalBlockchain.g:4521:1: rule__Operacion__ParametrosAssignment_5_1_1 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4525:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:4526:2: ( ruleParametro )
            {
            // InternalBlockchain.g:4526:2: ( ruleParametro )
            // InternalBlockchain.g:4527:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__Operacion__ParametrosAssignment_5_1_1"


    // $ANTLR start "rule__Operacion__RetornoAssignment_7_1"
    // InternalBlockchain.g:4536:1: rule__Operacion__RetornoAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Operacion__RetornoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4540:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4541:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4541:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4542:3: ( ruleEString )
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_7_1_0()); 
            // InternalBlockchain.g:4543:3: ( ruleEString )
            // InternalBlockchain.g:4544:4: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Operacion__RetornoAssignment_7_1"


    // $ANTLR start "rule__Operacion__LineasAssignment_10"
    // InternalBlockchain.g:4555:1: rule__Operacion__LineasAssignment_10 : ( ruleLinea ) ;
    public final void rule__Operacion__LineasAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4559:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:4560:2: ( ruleLinea )
            {
            // InternalBlockchain.g:4560:2: ( ruleLinea )
            // InternalBlockchain.g:4561:3: ruleLinea
            {
             before(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Operacion__LineasAssignment_10"


    // $ANTLR start "rule__Estado__TipodatoAssignment_1"
    // InternalBlockchain.g:4570:1: rule__Estado__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Estado__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4574:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4575:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4575:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4576:3: ( ruleEString )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:4577:3: ( ruleEString )
            // InternalBlockchain.g:4578:4: ruleEString
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
    // InternalBlockchain.g:4589:1: rule__Estado__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Estado__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4593:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4594:2: ( ruleEString )
            {
            // InternalBlockchain.g:4594:2: ( ruleEString )
            // InternalBlockchain.g:4595:3: ruleEString
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
    // InternalBlockchain.g:4604:1: rule__Atributo__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Atributo__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4608:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4609:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4609:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4610:3: ( ruleEString )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:4611:3: ( ruleEString )
            // InternalBlockchain.g:4612:4: ruleEString
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
    // InternalBlockchain.g:4623:1: rule__Atributo__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4627:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4628:2: ( ruleEString )
            {
            // InternalBlockchain.g:4628:2: ( ruleEString )
            // InternalBlockchain.g:4629:3: ruleEString
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
    // InternalBlockchain.g:4638:1: rule__Parametro__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parametro__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4642:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4643:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4643:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4644:3: ( ruleEString )
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:4645:3: ( ruleEString )
            // InternalBlockchain.g:4646:4: ruleEString
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
    // InternalBlockchain.g:4657:1: rule__Parametro__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parametro__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4661:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4662:2: ( ruleEString )
            {
            // InternalBlockchain.g:4662:2: ( ruleEString )
            // InternalBlockchain.g:4663:3: ruleEString
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


    // $ANTLR start "rule__ExpresionLogica__IzqAssignment_1"
    // InternalBlockchain.g:4672:1: rule__ExpresionLogica__IzqAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__IzqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4676:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4677:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4677:2: ( ruleExpresion )
            // InternalBlockchain.g:4678:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpresionLogica__IzqAssignment_1"


    // $ANTLR start "rule__ExpresionLogica__OperadorAssignment_2"
    // InternalBlockchain.g:4687:1: rule__ExpresionLogica__OperadorAssignment_2 : ( ruleOperadorLogico ) ;
    public final void rule__ExpresionLogica__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4691:1: ( ( ruleOperadorLogico ) )
            // InternalBlockchain.g:4692:2: ( ruleOperadorLogico )
            {
            // InternalBlockchain.g:4692:2: ( ruleOperadorLogico )
            // InternalBlockchain.g:4693:3: ruleOperadorLogico
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorLogico();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpresionLogica__OperadorAssignment_2"


    // $ANTLR start "rule__ExpresionLogica__DerAssignment_3"
    // InternalBlockchain.g:4702:1: rule__ExpresionLogica__DerAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__DerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4706:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4707:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4707:2: ( ruleExpresion )
            // InternalBlockchain.g:4708:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExpresionLogica__DerAssignment_3"


    // $ANTLR start "rule__ExpresionAritmetica__IzqAssignment_1"
    // InternalBlockchain.g:4717:1: rule__ExpresionAritmetica__IzqAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__IzqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4721:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4722:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4722:2: ( ruleExpresion )
            // InternalBlockchain.g:4723:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__IzqAssignment_1"


    // $ANTLR start "rule__ExpresionAritmetica__OperadorAssignment_2"
    // InternalBlockchain.g:4732:1: rule__ExpresionAritmetica__OperadorAssignment_2 : ( ruleOperador ) ;
    public final void rule__ExpresionAritmetica__OperadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4736:1: ( ( ruleOperador ) )
            // InternalBlockchain.g:4737:2: ( ruleOperador )
            {
            // InternalBlockchain.g:4737:2: ( ruleOperador )
            // InternalBlockchain.g:4738:3: ruleOperador
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__OperadorAssignment_2"


    // $ANTLR start "rule__ExpresionAritmetica__DerAssignment_3"
    // InternalBlockchain.g:4747:1: rule__ExpresionAritmetica__DerAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__DerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4751:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4752:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4752:2: ( ruleExpresion )
            // InternalBlockchain.g:4753:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__DerAssignment_3"


    // $ANTLR start "rule__Variable__TipodatoAssignment_1"
    // InternalBlockchain.g:4762:1: rule__Variable__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4766:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4767:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4767:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4768:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:4769:3: ( ruleEString )
            // InternalBlockchain.g:4770:4: ruleEString
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
    // InternalBlockchain.g:4781:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4785:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4786:2: ( ruleEString )
            {
            // InternalBlockchain.g:4786:2: ( ruleEString )
            // InternalBlockchain.g:4787:3: ruleEString
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


    // $ANTLR start "rule__Condicional__ExpresionlogicaAssignment_2"
    // InternalBlockchain.g:4796:1: rule__Condicional__ExpresionlogicaAssignment_2 : ( ruleExpresionLogica ) ;
    public final void rule__Condicional__ExpresionlogicaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4800:1: ( ( ruleExpresionLogica ) )
            // InternalBlockchain.g:4801:2: ( ruleExpresionLogica )
            {
            // InternalBlockchain.g:4801:2: ( ruleExpresionLogica )
            // InternalBlockchain.g:4802:3: ruleExpresionLogica
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Condicional__ExpresionlogicaAssignment_2"


    // $ANTLR start "rule__Condicional__LineaAssignment_5"
    // InternalBlockchain.g:4811:1: rule__Condicional__LineaAssignment_5 : ( ruleLinea ) ;
    public final void rule__Condicional__LineaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4815:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:4816:2: ( ruleLinea )
            {
            // InternalBlockchain.g:4816:2: ( ruleLinea )
            // InternalBlockchain.g:4817:3: ruleLinea
            {
             before(grammarAccess.getCondicionalAccess().getLineaLineaParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getLineaLineaParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Condicional__LineaAssignment_5"


    // $ANTLR start "rule__Condicional__ElseAssignment_7"
    // InternalBlockchain.g:4826:1: rule__Condicional__ElseAssignment_7 : ( ruleElse ) ;
    public final void rule__Condicional__ElseAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4830:1: ( ( ruleElse ) )
            // InternalBlockchain.g:4831:2: ( ruleElse )
            {
            // InternalBlockchain.g:4831:2: ( ruleElse )
            // InternalBlockchain.g:4832:3: ruleElse
            {
             before(grammarAccess.getCondicionalAccess().getElseElseParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getElseElseParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Condicional__ElseAssignment_7"


    // $ANTLR start "rule__Else__LineaAssignment_3"
    // InternalBlockchain.g:4841:1: rule__Else__LineaAssignment_3 : ( ruleLinea ) ;
    public final void rule__Else__LineaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4845:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:4846:2: ( ruleLinea )
            {
            // InternalBlockchain.g:4846:2: ( ruleLinea )
            // InternalBlockchain.g:4847:3: ruleLinea
            {
             before(grammarAccess.getElseAccess().getLineaLineaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getElseAccess().getLineaLineaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Else__LineaAssignment_3"


    // $ANTLR start "rule__ExpresionNumerica__ValueAssignment_2"
    // InternalBlockchain.g:4856:1: rule__ExpresionNumerica__ValueAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExpresionNumerica__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4860:1: ( ( ruleEDouble ) )
            // InternalBlockchain.g:4861:2: ( ruleEDouble )
            {
            // InternalBlockchain.g:4861:2: ( ruleEDouble )
            // InternalBlockchain.g:4862:3: ruleEDouble
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpresionNumerica__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionTexto__ValueAssignment_2"
    // InternalBlockchain.g:4871:1: rule__ExpresionTexto__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ExpresionTexto__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4875:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4876:2: ( ruleEString )
            {
            // InternalBlockchain.g:4876:2: ( ruleEString )
            // InternalBlockchain.g:4877:3: ruleEString
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
    // InternalBlockchain.g:4886:1: rule__ExpresionBoolean__ValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ExpresionBoolean__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4890:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:4891:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:4891:2: ( ruleEBoolean )
            // InternalBlockchain.g:4892:3: ruleEBoolean
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


    // $ANTLR start "rule__ExpresionReferenciada__ReferenciaAssignment_1"
    // InternalBlockchain.g:4901:1: rule__ExpresionReferenciada__ReferenciaAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionReferenciada__ReferenciaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4905:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4906:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4906:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4907:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_1_0()); 
            // InternalBlockchain.g:4908:3: ( ruleEString )
            // InternalBlockchain.g:4909:4: ruleEString
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_1_0()); 

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
    // $ANTLR end "rule__ExpresionReferenciada__ReferenciaAssignment_1"


    // $ANTLR start "rule__ExpresionRelacional__IzqAssignment_1"
    // InternalBlockchain.g:4920:1: rule__ExpresionRelacional__IzqAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__IzqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4924:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4925:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4925:2: ( ruleExpresion )
            // InternalBlockchain.g:4926:3: ruleExpresion
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
    // InternalBlockchain.g:4935:1: rule__ExpresionRelacional__OperadorRelacionalAssignment_2 : ( ruleOperadorRelacion ) ;
    public final void rule__ExpresionRelacional__OperadorRelacionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4939:1: ( ( ruleOperadorRelacion ) )
            // InternalBlockchain.g:4940:2: ( ruleOperadorRelacion )
            {
            // InternalBlockchain.g:4940:2: ( ruleOperadorRelacion )
            // InternalBlockchain.g:4941:3: ruleOperadorRelacion
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
    // InternalBlockchain.g:4950:1: rule__ExpresionRelacional__DerAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__DerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4954:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4955:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4955:2: ( ruleExpresion )
            // InternalBlockchain.g:4956:3: ruleExpresion
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


    // $ANTLR start "rule__Primitivo__TipoAssignment_1"
    // InternalBlockchain.g:4965:1: rule__Primitivo__TipoAssignment_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Primitivo__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4969:1: ( ( ruleDatoPrimitivo ) )
            // InternalBlockchain.g:4970:2: ( ruleDatoPrimitivo )
            {
            // InternalBlockchain.g:4970:2: ( ruleDatoPrimitivo )
            // InternalBlockchain.g:4971:3: ruleDatoPrimitivo
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
    // InternalBlockchain.g:4980:1: rule__Primitivo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitivo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4984:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4985:2: ( ruleEString )
            {
            // InternalBlockchain.g:4985:2: ( ruleEString )
            // InternalBlockchain.g:4986:3: ruleEString
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
    // InternalBlockchain.g:4995:1: rule__Mapa__TipoDatoKeyAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4999:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5000:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5000:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5001:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 
            // InternalBlockchain.g:5002:3: ( ruleEString )
            // InternalBlockchain.g:5003:4: ruleEString
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
    // InternalBlockchain.g:5014:1: rule__Mapa__TipoDatoValueAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5018:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5019:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5019:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5020:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 
            // InternalBlockchain.g:5021:3: ( ruleEString )
            // InternalBlockchain.g:5022:4: ruleEString
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
    // InternalBlockchain.g:5033:1: rule__Mapa__NameAssignment_7 : ( ruleEString ) ;
    public final void rule__Mapa__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5037:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5038:2: ( ruleEString )
            {
            // InternalBlockchain.g:5038:2: ( ruleEString )
            // InternalBlockchain.g:5039:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800010780000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001032000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x07DE102000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x07DE000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x07DE000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x07DE000000FF0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x07DE00007F000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000002000840L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x07DE000000000800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000780000030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});

}