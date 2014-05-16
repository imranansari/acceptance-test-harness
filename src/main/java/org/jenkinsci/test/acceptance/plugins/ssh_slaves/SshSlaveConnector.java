package org.jenkinsci.test.acceptance.plugins.ssh_slaves;

import org.jenkinsci.test.acceptance.plugins.ssh_credentials.SshCredentialDialog;
import org.jenkinsci.test.acceptance.po.ComputerConnector;
import org.jenkinsci.test.acceptance.po.Control;
import org.jenkinsci.test.acceptance.po.Describable;
import org.jenkinsci.test.acceptance.po.PageObject;

/**
 * @author Kohsuke Kawaguchi
 */
@Describable("Launch slave agents on Unix machines via SSH")
public class SshSlaveConnector extends ComputerConnector {
    public final Control credentialsId = control("credentialsId");

    public SshSlaveConnector(PageObject context, String path) {
        super(context, path);
    }

    public SshCredentialDialog addCredential() {
        // TODO: this needs to be more reliable
        clickButton("Add");

        return new SshCredentialDialog(page, "/credentials");
    }
}