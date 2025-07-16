/**********************************************************************
 *
 * Copyright (c) 2025 Olaf Willuhn
 * All rights reserved.
 * 
 * This software is copyrighted work licensed under the terms of the
 * Jameica License.  Please consult the file "LICENSE" for details. 
 *
 **********************************************************************/

package de.jost_net.OBanToo.SEPA.BankDaten;

import org.junit.Assert;
import org.junit.Test;

import de.jost_net.OBanToo.SEPA.BankenDaten.Bank;
import de.jost_net.OBanToo.SEPA.BankenDaten.Banken;

/**
 * Unit-Tests für die Banken.
 */
public class TestBanken
{
  /**
   * Testet die österreichischen Banken.
   * @throws Exception
   */
  @Test
  public void testAT001() throws Exception
  {
    final Bank bank = Banken.getBankByBIC("TRBKATW2XXX");
    Assert.assertEquals("Trade Republic Bank GmbH, Branch Austria",bank.getBezeichnung());
    Assert.assertEquals("19001",bank.getBLZ());
  }
}
