package net.corda.training.state

import net.corda.core.contracts.ContractState
import net.corda.core.crypto.CompositeKey
import net.corda.training.contract.IOUContract

/**
 * This is where you'll add the definition of your state object. Look at the unit tests in [IOUStateTests] for
 * instructions on how to complete the [IOUState] class.
 */
data class IOUState(val data: String = "data"): ContractState {
    override val participants: List<CompositeKey> get() = listOf()

    /**
     * A Contract code reference to the IOUContract. Make sure this is not part of the [IOUState] constructor.
     * **Don't change this definition!**
     */
    override val contract get() = IOUContract()
}