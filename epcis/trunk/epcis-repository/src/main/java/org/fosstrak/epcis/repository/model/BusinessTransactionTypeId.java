/*
 * Copyright (C) 2008 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.accada.epcis.repository.model;

import org.accada.epcis.repository.Constants;

/**
 * A vocabulary type for representing business transaction type identifiers, per section
 * 7.2.6.1 of the spec.
 * @author Sean Wellington
 */
public class BusinessTransactionTypeId extends VocabularyElement {

	@Override
	public String getVocabularyType() {
		return Constants.BUSINESS_TRANSACTION_TYPE_ID_VTYPE;
	}

}
